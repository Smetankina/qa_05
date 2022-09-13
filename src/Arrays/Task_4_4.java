package Arrays;
/*Задача №4

Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
*/
public class Task_4_4 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;

        double average = 0;

        for (int i = 0;i < array.length; i++) {
            sum += array[i];

         average = sum / array.length;
        }
        System.out.println(average);
    }
}
