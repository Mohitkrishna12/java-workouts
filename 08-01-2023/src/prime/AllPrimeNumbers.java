package prime;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];

        for(int i=0;i<l;i++){
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<l;i++){
            if(arr[i] %2 != 0){
                System.out.println("prime number: "+arr[i]);
            }
        }


    }
}
