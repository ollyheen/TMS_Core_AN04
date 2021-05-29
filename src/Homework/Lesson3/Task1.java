package Homework.Lesson3;

public class Task1 {

    public static void main(String[] args) {
    /*
    Дан произвольный массив чисел
    1.1) Найти произведение элементов, кратных 3.
    */

        int result = 0;
        int[] randomArray = {1, 33, 23, 25, 42, 99, 120, 3};

        for (int i = 0; i <= randomArray.length - 1 ; i++) {
            if (randomArray[i] % 3 == 0){

                if (result != 0) {
                   result =  result * randomArray[i];
                } else {
                    result = result + randomArray[i];
                }

            }
        }
        System.out.println("Произведение элементов, кратных 3 = " + result);


    /*
    1.2) Найти среднее арифметическое элементов с нечетными номерами.
    */

        int result2 = 0;
        int count = 0;
        for (int j = 0; j <= randomArray.length - 1 ; j++) {
            if (j % 2 != 0) {
                count++;
                result2 = result2 + j;
            }
        }

        System.out.println("Cреднее арифметическое элементов с нечетными номерами = " + result2 / count);


        /*
        1.3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.
        */

    }
}
