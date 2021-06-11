package Homework.Lesson6.Task2;

public class RedDragon extends Dragon {

    public RedDragon () {
        setColorDragon("Красный дракон");
        setAlive(true);
    }

    @Override
    public void receiveDamage(String fightType, String weaponType) {
        if (fightType.equals(Constants.CLOSE_COMBAT) && weaponType.equals(Constants.SWORD)) {
            setAlive(false);
            System.out.println("Дракон повержен! Забирай награду!");
        } else {
            System.out.println("Таким типом боя и оружия ты меня не одолеешь!");
        }

    }
}
