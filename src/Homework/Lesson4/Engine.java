package Homework.Lesson4;

public class Engine {

    private boolean isEngineStart = false;
    private String engineType = "";

    public Boolean getIsEngineStart () {
        return isEngineStart;
    }

    public void startEngine () {
        isEngineStart = true;
        System.out.println("Engine is starting...");
    }

    public void stopEngine () {
        isEngineStart = false;
        System.out.println("Engine is stopped...");
    }


    public void setEngineType (String type) {
        engineType = type;
    }
    public String getEngineType () {
        return engineType;
    }

}
