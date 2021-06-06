package Homework.Lesson4;

public class Car {

    private Integer carDistance;
    private Engine engine;
    private PetrolTank tank;
    private String carBrand;
    private Integer year;

    public Car (Engine engine, PetrolTank tank) {
      this.carBrand = "";
      this.year = 0;
      this.carDistance = 0;
      this.engine = engine;
      this.tank = tank;
    }

    public Car (Engine engine, PetrolTank tank, String brand, Integer year, Integer carDistance) {
        this.engine = engine;
        this.tank = tank;
        this.carBrand = brand;
        this.year = year;
        this.carDistance = carDistance;
    }


    public void setBrand (String name) {
        carBrand = name;
    }
    public String getBrand () {
        return carBrand;
    }

    public void setYear (Integer number) {
        year = number;
    }
    public Integer getYear () {
        return year;
    }


    public void setCarDistance(Integer distance) {
        carDistance = distance;
    }
    public Integer getAllDistance () {
        return carDistance;
    }



    public void carTurnOn () {
        if (tank.fuelAvailable() == true) {
            System.out.println("Fuel available...");
            engine.startEngine();
        } else {
            System.out.println(" Patrol tank is empty...");
        }

    }
    public void carTurnOff () {
        engine.stopEngine();
    }

    public void carRun () {
        if (engine.getIsEngineStart() == true) {
            System.out.println("Car is running...");
            carDistance = carDistance + 100;
        } else {
            System.out.println("Please, start engine...");
        }
    }

    public void addFuel (Integer quantity) {
        tank.addFuelQuantity(quantity);

    }

    public Integer fuelQuantity () {
        return tank.getFuelQuantity();
    }

    public String getCarInfo () {
        return "Brand: " + carBrand
                + "\nYear: " + year
                + "\nAll Distance: " + carDistance
                + "\nFuel quantity: " + tank.getFuelQuantity()
                + "\nType engine: " + engine.getEngineType();
    }

}
