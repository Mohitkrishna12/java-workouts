package functions_practice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of the given number is: " + factorial(num));
    }
    static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        int result =1;
        while(num > 1){
            result = result * num;
            num--;
        }
        return result;
    }
}
