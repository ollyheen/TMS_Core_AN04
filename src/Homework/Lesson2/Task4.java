package Homework.Lesson2;

public class Task4 {
    /*
    4.1) Дано положительное число x (например 1098). Написать программу,
    которая печатает на консоль все цифры данного числа (используя цикл while)
    */

    public static void main(String[] args){
        int x = 1098;

        while (x > 0) {
            System.out.println(x % 10);
            x = x / 10;
        }
    }
}
