package Homework.Lesson6.Task2;

public class Hero implements Attacking {

    private final String fightType;
    private final String weaponType;

    public Hero(String fType, String wType) {
        this.fightType = fType;
        this.weaponType = wType;
    }

    @Override
    public void attack(Dragon randomDragon) {
        System.out.println("В атаку!");
        randomDragon.receiveDamage(fightType, weaponType);
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public String getFightType() {
        return fightType;
    }
}
