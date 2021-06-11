package Homework.Lesson6.Task2;

public class BlueDragon extends Dragon {

    public BlueDragon() {
        setColorDragon("Голубой дракон");
        setAlive(true);
    }

    @Override
    public void receiveDamage(String fightType, String weaponType) {
        if (fightType.equals(Constants.DISTANT_COMBAT) && weaponType.equals(Constants.MAGIC)) {
            setAlive(false);
            System.out.println("Дракон повержен! Забирай награду!");
        } else {
            System.out.println("Таким типом боя и оружия ты меня не одолеешь!");
        }

    }
}
