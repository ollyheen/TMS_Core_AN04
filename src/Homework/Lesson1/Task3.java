package Homework.Lesson1;

public class Task3 {
    public static void main(String[] args){
        /*
        Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
        Подсказка: используйте Math.abs(..) для нахождения модуля числа
        */

        int a = -5;
        int b = 10;
        int c = 28;
        int countPositive = ((Math.abs(a) / a + 1) / 2) + ((Math.abs(b) / b + 1) / 2) + ((Math.abs(c) / c + 1) / 2);

        System.out.println("Количество положительных чисел в исходном наборе: " + countPositive);
    }
}
