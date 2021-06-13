package Homework.Lesson6.Task1.Warriors;

public class Undead extends Warrior {

    public Undead () {
        super.setRace("Undead");
        this.setWarriorClass("Magician"); // маг
        super.setWeapon("Magic wand"); // волшебная палочка
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
                "... Laughs terrifyingly...",
                "Сasts a magic spell",
                getCommonPhrase()
        );
    }

}

