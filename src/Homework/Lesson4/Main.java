package Homework.Lesson4;

public class Main {
    public static void main(String[] args) {

       /*
       Напишите структуру классов и продемонстрируйте работу:

        1. Машина имеет двигатель, бензобак (реализуйте класс для каждой сущности).

        2. Чтобы поехать, машину необходимо завести, т.е. включить двигатель.
        - Реализуйте методы включения машины, который в свою очередь включает её двигатель.
        - Реализуйте метод езды на машине (например просто печатаем на консоль, что машина поехала)
        - Если машина не заведена, ехать она не может.
        - Машину можно заглушить.

        3. После каждой поездки считаем, что машина прошла фиксированное расстояние.

        4. Реализовать возможность посмотреть, какое расстояние машина прошла за все время.

        5. Чтобы создать машину обязательно нужно иметь двигатель и бензобак.

        6. Марка машины, год выпуска, пройденное расстояние - не обязательны при создании машины и могут быть
        выставлены потом. (не обязательно задавать в конструкторе)

        7. После создания поменять двигатель машине нельзя.

        8. Чтобы машина завелась, у неё должно быть топливо в бензобаке, если топлива нет, машина не может завестись.
        - Машину можно дозаправить, можно проверить сколько топлива осталось.

        9. Реализуйте пару полей для двигателя и бензобака, например: тип двигателя, общий объем бензобака, сколько бензина
        сейчас и т.д.*/

        // Пример выполнения:

        Engine engineForBMW = new Engine();
        engineForBMW.setEngineType("V6");

        PetrolTank tankForBMW = new PetrolTank();

        Car bmw = new Car(engineForBMW, tankForBMW);

        bmw.setYear(2021);
        bmw.setCarDistance(10);
        bmw.setBrand("x6");
        bmw.carRun();

        bmw.carTurnOn();
        bmw.addFuel(20);
        bmw.carTurnOn();
        bmw.carRun();

        bmw.carTurnOff();

        System.out.println(bmw.getCarInfo());

    }
}
