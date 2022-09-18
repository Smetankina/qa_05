package Arrays;

import java.util.Arrays;
/*
* Задача №5

*
*
*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
*/
public class Task_4_5 {
    public static void main(String[] args) {


        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

/*
//  get all the elements of the array
  for(int i = 0;i< array.length;i++){
        //   System.out.println(Arrays.toString(array[i]));
            for(int j =0; j< array[i].length;j++){
                System.out.println(array[i][j]);
            }
        }*/
int sum = 0;

for (int i = 0;i < array.length; i++){
    for (int j =0;j < array[i].length; j++){
        sum += array[i][j];
    }

}
        System.out.println(sum);
    }
}
