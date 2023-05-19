       // Домашнее задание к семинару 1 от 18.05.2023
       //1. Вычислить n-ое треугольного число(сумма чисел от 1
       // до n)

package homework1;
import java.util.Scanner;
public class Task1Thiangle {
    public void triangleNumber(int number){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int n = scanner.nextInt();
//        int n = 5;
        int result;
        result = n * (n+1) / 2;
        System.out.println("Триугольное число, числа " + n + " являестся " + result);
    }
}

