package Homework.Lesson2;

public class Task3 {
    public static void main(String[] args){
        /*
        3.1) Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
        */
        int sum = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        /*
        3.2) Вычислить: 1+2+4+8+...+256
        */

        int sum2 = 1;
        int limit = 256;
        int step = 1;

        while (step < limit) {
           step *= 2;
           sum2 = sum2 + step;
        }
        System.out.println(sum2);


        /*3.3) Начав тренировки, спортсмен в первый день пробежал 10 км.
                Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
        Какой суммарный путь пробежит спортсмен за 7 дней?*/


        int sumDistance = 10;
        int daysCount = 7;
        int prevDay = 10;

        for (int i = 2; i <= daysCount ; i++) {
            int resultDay = prevDay * 10 / 100;
            prevDay = resultDay + prevDay;
            sumDistance = sumDistance + prevDay;
        }

        System.out.println(sumDistance);
    }

}
