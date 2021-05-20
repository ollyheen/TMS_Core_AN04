package Homework.Lesson1;

public class Task1 {
    public static void main(String[] args) {
        /*
        написать код, который правильно считает кол-во цифр в дробном числе
        а) Считаем все цифры в числе (дробную часть тоже)
        б) (посложнее) - считаем только цифры целой части
        */

        double allNumber = 111.1111;

        // Решение a):
        String numberToString = Double.toString(allNumber);
        int lengthA = numberToString.length() - 1;

        System.out.println("a) " + lengthA);

        // Решение б):
         int integerAllNumber = (int)allNumber;
         String numberToStringToThePoint = Integer.toString(integerAllNumber);
         int lengthB = numberToStringToThePoint.length();

         System.out.println("b) " + lengthB);
    }
}
