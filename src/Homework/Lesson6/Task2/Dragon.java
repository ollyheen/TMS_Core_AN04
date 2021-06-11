package Homework.Lesson6.Task2;

public abstract class Dragon {

    private String colorDragon;
    private Boolean isAlive;

    public void setColorDragon(String colorDragon) {
        this.colorDragon = colorDragon;
    }

    public String getColorDragon() {
        return colorDragon;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public abstract void receiveDamage(String fightType, String weaponType);

}
