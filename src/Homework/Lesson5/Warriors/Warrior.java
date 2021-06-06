package Homework.Lesson5.Warriors;

public class Warrior {

    public Warrior() {
        this.commonPhrase = "\"I win!\"";
        this.warriorName = "";
    }

    private String race; // раса - орки, эльфы, нежить, гоблины
    private String weapon; // тип вооружения - топор, лук, волшебная палочка, меч
    private String warriorClass; // класс вооружения - тяжелый воин, лучник, маг, мечник
    private String warriorName; // имя воина
    private final String commonPhrase;

    public String getCommonPhrase() {
        return commonPhrase;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setWarriorClass(String warriorClass) {
        this.warriorClass = warriorClass;
    }

    public void setWarriorName(String warriorName) {
        this.warriorName = warriorName;
    }

    public String getRace() {
        return race;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getWarriorClass() {
        return warriorClass;
    }

    public String getWarriorName() {
        if(warriorName.equals("")) {
            return "\"I not have name\"";
        } else {
            return "\"My name is " + warriorName + "\"";
        }
    }

    public void warriorActions(String phraseStart, String attackMethod, String phraseEnd) {
        System.out.println("Take out " + weapon
                + "\n" + phraseStart
                + "\n" + attackMethod
                + "\n" + phraseEnd);
    }
}
