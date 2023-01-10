package functions_practice;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age  = sc.nextInt();
        sc.close();
        if(eligibleToVote(age)){
            System.out.println("Candidate is eligible for voting");
        }else{
            System.out.println("Candidate is not eligible for voting");
        }
    }
    static boolean eligibleToVote(int age){
        if(age >= 18){
            return true;
        }
        return false;
    }
}
