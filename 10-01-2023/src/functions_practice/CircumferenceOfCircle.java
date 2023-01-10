package functions_practice;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of the circle: ");
        int radius = sc.nextInt();
        System.out.println("Area of the circle: "+areaofCircle(radius));
        System.out.println("Circumference of the circle: "+circumOfCircle(radius));
    }
    static float areaofCircle(int radius){
        return (float) (Math.PI * radius * radius);
    }

    static  float circumOfCircle(int radius){
        return (float) (2 * Math.PI * radius);
    }

}
