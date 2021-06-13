package Homework.Lesson6.Task1.Warriors;

public class Elf extends Warrior {
    public Elf () {
        super.setRace("Elf");
        this.setWarriorClass("Archer"); // лучник
        super.setWeapon("Bow"); // лук
    }

    @Override
    public void setWeapon(String weapon) {
        System.out.println("\"I will not give up my weapon! I have " + getWeapon() + "\"");
    }

    @Override
    public void warriorActions(String phraseStart, String attackMethod, String phraseEnd) {
        System.out.println("Take out " + getWeapon()
                + "\n" + phraseStart
                + "\n" + attackMethod
                + "\n" + phraseEnd);
    }

    @Override
    public void setRace(String race) {
        System.out.println("\"I'm " + getRace() + "!\"" );
    }

    public void actionAttack() {
        warriorActions(
                "... Says something quietly...",
                "Archery",
                "..."
        );
    }
}
