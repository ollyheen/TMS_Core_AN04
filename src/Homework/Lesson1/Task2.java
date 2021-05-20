package Homework.Lesson1;

public class Task2 {
    public static void main(String[] args) {
        /*
        Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
        Определить существует ли такой треугольник. Дано: a, b, c – стороны предполагаемого треугольника.
        Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
        Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами
        не существует. Подсказка: используйте тип boolean и логические операции с ним:
        || - логическое ИЛИ, && - логическое И
        5 > 0 || 5 < 0 - результат true
        5 > 0 && 5 < 0 - результат false
        1 > 1 || 2 > 2 || 3 >= 3 - результат true
        */

        int a = 10;
        int b = 15;
        int c = 12;

        boolean triangleSide1 = (a + b) > c;
        boolean triangleSide2 = (b + c) > a;
        boolean triangleSide3 = (a + c) > b;

        boolean triangle = triangleSide1 && triangleSide2 && triangleSide3;

        System.out.println("Треугольник существует: " + triangle);
    }
}
