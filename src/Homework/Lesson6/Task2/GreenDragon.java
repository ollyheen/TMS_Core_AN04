package Homework.Lesson6.Task2;

public class GreenDragon extends Dragon {

    public GreenDragon() {
        setColorDragon("Зеленый дракон");
        setAlive(true);
    }

    @Override
    public void receiveDamage(String fightType, String weaponType) {
        if (fightType.equals(Constants.DISTANT_COMBAT) && weaponType.equals(Constants.BOW)) {
            setAlive(false);
            System.out.println("Дракон повержен! Забирай награду!");
        } else {
            System.out.println("Таким типом боя и оружия ты меня не одолеешь!");
        }

    }
}
