package Homework.Lesson6.Task2;

import java.util.Random;

public class Room {

    private final Integer goldCoins;
    private Dragon randomDragon;
    private Attacking hero;

    public Room() {
        this.goldCoins = new Random().nextInt(1000) + 1;
        Random random = new Random();
        int x = random.nextInt(3);
        if (x == 0) {
            randomDragon = new RedDragon();
        } else if (x == 1) {
            randomDragon = new GreenDragon();
        } else if (x == 2) {
            randomDragon = new BlueDragon();
        }
    }

    public Attacking getHero() {
        return hero;
    }

    public void setHeroToRoom(Attacking hero) {
        this.hero = hero;
    }

    public Integer getGoldCoins() {
        return goldCoins;
    }

    public Dragon getRandomDragon() {
        return randomDragon;
    }

    public void grabGoldCoins() {
        if (randomDragon.getAlive()) {
            System.out.println("Воин! " + randomDragon.getColorDragon() + " еще жив! Сначала повергни его!");
        } else {
            System.out.println("Забирай свои " + goldCoins + " золотых монет! Ты достоин их!");
        }
    }
}
