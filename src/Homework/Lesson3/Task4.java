package Homework.Lesson3;

public class Task4 {
    public static void main(String[] args) {

    /*
    Пузырек
    4.1) Реализовать сортировку пузырьком, в которой мы выталкиваем сначала элемент слева-направо,
    а затем на обратном пути справа-налево и т.д. (пример был на занятии)
    */

        int[] array = {5, 1, 8, 6, 3, 4, 2, 7};
        boolean sorted = false;

        while (sorted == false) {
            sorted = true;
            for (int i = 0; i < array.length - 1 ; i++) {
                if (array[i] > array[i + 1]) {
                    int left = array[i];
                    int right = array[i + 1];
                    array[i] = right;
                    array[i + 1] = left;
                    sorted = false;
                }
            }
        }

        for (int j = 0; j <= array.length - 1 ; j++) {
            System.out.println(array[j]);

        }
    }
}
