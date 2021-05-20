package Homework.Lesson1;

public class Task4 {
    public static void main(String[] args) {
    /*
    Даны 2 числа. Вывести большее из них. Подсказка: используйте Math.abs(..) для нахождения модуля числа
    */
        int a = 10;
        int b = 5;

        int maxNum = (a + b + Math.abs(a - b)) / 2;

        System.out.println("Большее число (вариант решения 1): " + maxNum);

        System.out.println("Большее число (вариант решения 2): " + Math.max(a,b));
    }

}
