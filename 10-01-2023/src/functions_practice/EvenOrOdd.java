package functions_practice;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = sc.nextLong();
        sc.close();
        if(evenOrOdd(number)){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
    }
    static boolean evenOrOdd(long num){
        if(num % 2 ==0){
            return true;
        }
        return false;
    }
}
