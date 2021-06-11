package Homework.Lesson6.Task2;

public class Main {
    /*
    Реализуйте небольшую игру.
    В игре есть комната с драконом, драконы бывают разные (красные, зеленые и т.д. - какие придумаете :) )
    В комнате лежат сокровища, которые мы хотим забрать.
    Чтобы забрать сокровища, нужно сначала убить дракона, но убивать разных драконов нужно по-разному
    Чтобы убить красного дракона, необходимо либо сражаться дальним боем, либо магией воды
    Зеленого дракона поможет убить ближний бой
    Победить черного дракона можно только усыпив его
    В игре также есть наш персонаж, которого можно вооружить разным видом оружия и отправить сражаться с драконом
    в комнату
    Если дракона удалосьп победить, персонаж забирает его богатства и выходит из комнаты
    Мы не знаем какого типа дракон будет сидеть в комнате (используйте рандом)
    */
    public static void main(String[] args) {

        Room gameRoom = new Room();

        Attacking myHero = new Hero(Constants.CLOSE_COMBAT, Constants.SWORD);
        gameRoom.setHeroToRoom(myHero);

        System.out.println("Воин, твое оружие - " + gameRoom.getHero().getWeaponType()
                + ". \nИспользуй " + gameRoom.getHero().getFightType());

        System.out.println("В комнате " + gameRoom.getRandomDragon().getColorDragon()
                + " - срази его и получи " + gameRoom.getGoldCoins()
                + " золотых монет в награду!");

        gameRoom.getHero().attack(gameRoom.getRandomDragon());

        gameRoom.grabGoldCoins();
    }
}
