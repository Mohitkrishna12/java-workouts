package prime;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("not a prime");
        }else{
            System.out.println("prime");
        }
    }
}
