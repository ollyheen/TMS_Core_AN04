package Homework.Lesson2;

import java.util.Scanner;

public class Task1 {
    /*
   Написать программу, которая читает введеное с консоли число. Число должно быть от 1 до 12.
   Напечатать на консоль название месяца, которое соответствует введеному числу (например 1 - Январь)
   Если число неправильное (не от 1 до 12), напечатать на консоль сообщение, информирующее об ошибке
   (например "Неправильное число, должно быть от 1 до 12) Для считывание числа с консоли используйте
   Scanner in = new Scanner(System.in);
   System.out.print("Введите число: ");
   int num = in.nextInt();
   //
   // работа с числом
   //
   in.close()
   */
    public static void main(String[] args) {


        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = inputNumber.nextInt();

        if (number == 1) {
            System.out.println("Январь");
        } else if(number == 2) {
            System.out.println("Февраль");
        } else if(number == 3) {
            System.out.println("Март");
        } else if(number == 4) {
            System.out.println("Апрель");
        } else if(number == 5) {
                System.out.println("Май");
        } else if(number == 6) {
            System.out.println("Июнь");
        } else if(number == 7) {
            System.out.println("Июль");
        } else if(number == 8) {
            System.out.println("Август");
        } else if(number == 9) {
            System.out.println("Сентябрь");
        } else if(number == 10) {
            System.out.println("Октябрь");
        } else if(number == 11) {
            System.out.println("Ноябрь");
        } else if(number == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Введено неверное число, введите число от 1 до 12");
        }

        inputNumber.close();
    }
}
