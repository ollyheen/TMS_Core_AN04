package Homework.Lesson6.Task1.Warriors;

public class Orc extends Warrior {

    public Orc () {
        super.setRace("Orc");
        this.setWarriorClass("Heavy warrior");
        super.setWeapon("Axe"); // топор
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
                "... Makes a slurred sound...",
                "Blows off opponent's head",
                "... Makes a slurred sound..."
        );
   }

}
