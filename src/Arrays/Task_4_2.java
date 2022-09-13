package Arrays;
/*
* Задача №2

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести максимальное значение массива.
*/
public class Task_4_2 {
    public static void main(String[] args) {

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int max = array[0];

        for (int i = 0;i < array.length; i++){
            if (array[i]>max) {
                max = array[i];
            }

        }
        System.out.println(max);


    }

}
