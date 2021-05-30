package Homework.Lesson3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

    /*Одномерные массивы посложнее
    3.1) В произвольно заполненном массиве проверить все ли числа разные
    */

        int[] randomArray = {3,7,5,11,21,56};

        boolean numberDifferent = true;

        for (int i = 0; i <= randomArray.length -1 ; i++) {
           int cellValue = randomArray[i];

            for (int j = i + 1; j <= randomArray.length -1; j++) {
                if (cellValue == randomArray[j]) {
                    numberDifferent = false;
                    break;
                }
            }
        }

        System.out.println("Все числа разные " + numberDifferent);


        /*
        3.2) Дан массив длины n=50, заполненный случайными числами из промежутка [a; b], a=0, b=100, b >= n всегда.
        Проверить являютя ли все числа в массиве уникальными
        */

        int n = 50;
        int[] array = new int[n];
        int b = 100;
        boolean numberDifferent1 = true;

        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = new Random().nextInt(b + 1);
        }

        for (int i = 0; i <= array.length -1 ; i++) {
            int cellValue = array[i];

            for (int j = i + 1; j <= array.length -1; j++) {
                if (cellValue == array[j]) {
                    numberDifferent1 = false;
                    break;
                }
            }
        }

        System.out.println("Все числа уникальные " + numberDifferent1);



        /*
        3.3*) Оценить сложности алгоритмов для 3.1 и 3.2; 3.2 должен решаться за линейное время
        */


        /*
        3.4*) Дан массив длины 20, заполненнйы случайнми числами из отрезка [0;5].
        Для каждого числа из массива найти его кол-во. Решение за линейное время
        */
    }
}
