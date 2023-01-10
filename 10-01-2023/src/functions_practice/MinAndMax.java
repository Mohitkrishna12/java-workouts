package functions_practice;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        int maximum = largest(num1,num2,num3);
        int minimum = smallest(num1,num2,num3);
        System.out.println("Maximum in given three number: "+ maximum);
        System.out.println("Minimum in given three number: "+minimum);
    }

    static int largest(int n1,int n2,int n3){
        int max= n1;
        if(n2>max){
            max=n2;
        }else if(n3>max){
            max=n3;
        }
        return max;
    }

    static int smallest(int n1,int n2,int n3){
        int min = n1;
        if(n2<min){
            min=n2;
        }else if(n3<min){
            min=n3;
        }
        return min;
    }
}
