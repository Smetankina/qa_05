/*Задача №3


Необходимо создать целочисленную переменную, присвоить произвольное значение переменной
на ваш выбор и вывести следующие строки:
больше 10 - если переменная больше 10
меньше 100 - если переменная меньше 100
результат деления на 2 больше 20 - если это соответствует истине
значение переменной между 5 и 40 включительно - если это правда
значение переменной меньше 5 или больше 40 - если предыдущие условие ложное*/

import java.util.Scanner;

public class Task_3_3 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = a.nextInt();

        if(number > 10){
            System.out.println("больше 10");
        }

        if(number < 100){
            System.out.println("меньше 100");
        }
        if(number % 2 > 20){
            System.out.println("результат деления на 2 больше 20");
        }
        if(number >= 5 && number <= 40){
            System.out.println("значение переменной между 5 и 40 включительно");
        }
        if(number > 40 || number < 5){
            System.out.println("значение переменной меньше 5 или больше 40");
        }




    }
}