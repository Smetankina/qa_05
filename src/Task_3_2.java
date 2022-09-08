/*Задача №2


Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная*/

public class Task_3_2 {


    public static void main(String[] args) {
int a = 6;

int b = 3;

int sum = a+b;

if(sum%2 == 0){
    System.out.println("maybe a and b are even");
}
if (sum%2 == 1){
    System.out.println("some variable is odd");
}
    }
}
