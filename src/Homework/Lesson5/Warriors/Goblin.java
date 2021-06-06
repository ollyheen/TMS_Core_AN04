package Homework.Lesson5.Warriors;

public class Goblin extends Warrior {

    public Goblin () {
        super.setRace("Goblin");
        this.setWarriorClass("Swordsman"); // мечник
        super.setWeapon("Sword"); // меч
    }

    @Override
    public void setWeapon(String weapon) {
        System.out.println("\"I will not give up my weapon! I have " + getWeapon() + "\"");
    }

    @Override
    public void setRace(String race) {
        System.out.println("\"I'm " + getRace() + "!\"" );
    }

    public void actionAttack() {
        warriorActions(
                "... Stuttering from ale mutters a cry...",
                "Сuts the enemy",
                getCommonPhrase()
        );
    }

}
