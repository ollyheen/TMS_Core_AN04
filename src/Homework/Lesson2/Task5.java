package Homework.Lesson2;

public class Task5 {
    /*
    5.1) Написать программу, которая печатает на консоль прямоугольник из символа "@" длины NxM
    (задается вручную, т.е. int n = 10; int m = 5, например)

    @@@@@@@@@@
    @@@@@@@@@@
    @@@@@@@@@@
    @@@@@@@@@@
    @@@@@@@@@@
    */
    public static void main(String[] args) {

        int symbolsInLine = 3;
        int linesCount = 3;
        char at = '@';

        for (int i = 0; i < linesCount; i++) {

            for (int k = 0; k < symbolsInLine; k++) {
                System.out.print(at);
            }

            System.out.print("\n");
        }



    /*5.2) Дано число x, найти все простые числа от 1 до x
    (число считается простым, если делится только на себя и на 1)*/

    }

}
