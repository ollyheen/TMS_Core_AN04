package Homework.Lesson3;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

   /*
   Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
    */

        int n = 5;
        int max = 17;
        int min = -15;

        int[] array = new int[n];

        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = new Random().nextInt(max - min) + min;
            System.out.println(array[i]);
        }



        /*
        2.1) Найти наименьший нечетный элемент.
        */

        int minElement = max;
        boolean minElementFound = false;

        for (int j = 0; j <= array.length - 1 ; j++) {
           if(array[j] % 2 != 0){
               minElementFound = true;
              if (array[j] < minElement){
                  minElement = array[j];
              }
           }
        }

        if(minElementFound){
            System.out.println("Наименьший нечетный элемент = " + minElement);
        } else {
            System.out.println("Нечетных элементов не найдено");
        }



        /*
        2.2) Найти второй по максимальности элемент массива
        (т.е. из чисел 1 2 3 4 - 3 будет вторым по максимальности)
        */





        /*
        2.3) Найти максимальный элемент массива и поменять его местами с 1-м (0-м по индексу) числом массива
        */


    }
}
