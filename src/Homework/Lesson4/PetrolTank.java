package Homework.Lesson4;

public class PetrolTank {

    private Integer fuelQuantity = 0;

    public Boolean fuelAvailable () {
        if (fuelQuantity > 0 ) {
            return true;
        } else {
            return false;
        }
    }

    public void addFuelQuantity (Integer quantity) {
        fuelQuantity = fuelQuantity + quantity;
    }

    public Integer getFuelQuantity () {
        return fuelQuantity;
    }



}
