package Homework.Lesson2;

import java.util.Scanner;

public class Task2 {
    /*
    Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите число рождения: ");

        int dayBirthday = input.nextInt();

        System.out.print("Введите месяц рождения: ");

        int monthBirthday = input.nextInt();

      if (monthBirthday ==1 && dayBirthday >=21 && dayBirthday <=31
              || monthBirthday ==2 && dayBirthday <=18 && dayBirthday >=1){
             System.out.println("Ваш знак зодиака: Водолей");
         } else if (monthBirthday ==2 && dayBirthday >=19 && dayBirthday <=29
              || monthBirthday ==3 && dayBirthday <=20 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Рыбы");
        } else if (monthBirthday ==3 && dayBirthday >=21 && dayBirthday <=31
              || monthBirthday ==4 && dayBirthday <=20 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Овен");
        } else if (monthBirthday ==4 && dayBirthday >=21 && dayBirthday <=30
              || monthBirthday ==5 && dayBirthday <=21 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Телец");
        } else if (monthBirthday ==5 && dayBirthday >=22 && dayBirthday <=31
              || monthBirthday ==6 && dayBirthday <=21 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Близнецы");
        } else if (monthBirthday ==6 && dayBirthday >=22 && dayBirthday <=30
              || monthBirthday ==7 && dayBirthday <=22 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Рак");
        } else if (monthBirthday ==7 && dayBirthday >=23 && dayBirthday <=31
              || monthBirthday ==8 && dayBirthday <=23 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Лев");
        } else if (monthBirthday ==8 && dayBirthday >=24 && dayBirthday <=31
              || monthBirthday ==9 && dayBirthday <=23 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Дева");
        } else if (monthBirthday ==9 && dayBirthday >=24 && dayBirthday <=30
              || monthBirthday ==10 && dayBirthday <=23 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Весы");
        } else if (monthBirthday ==10 && dayBirthday >=24 && dayBirthday <=31
              || monthBirthday ==11 && dayBirthday <=22 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Скорпион");
        } else if (monthBirthday ==11 && dayBirthday >=23 && dayBirthday <=30
              || monthBirthday ==12 && dayBirthday <=21 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Стрелец");
        } else if (monthBirthday ==12 && dayBirthday >=22 && dayBirthday <=31
              || monthBirthday ==1 && dayBirthday <=20 && dayBirthday >=1) {
            System.out.println("Ваш знак зодиака: Козерог");
        } else {
            System.out.println("Вы ввели неверные данные");
         }

        input.close();
    }
}
