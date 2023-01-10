package functions_practice;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark out of 100: ");
        int mark = sc.nextInt();
        if(markRange(mark)){
            System.out.println("Your Grade is: "+ displayGrade(mark));
        }else{
            System.out.println("please enter mark less than or equal to 100");
        }
    }
    static boolean markRange(int mark){
        if(mark>=0 && mark <=100){
            return true;
        }
        return false;
    }

    static String displayGrade(int mark){
        //to use switch case divide mark by 10 and get the remainder.
        if(mark >=91 && mark <=100){
            return "AA";
        }else if(mark >=81 && mark <=90){
            return "AB";
        }else if(mark >=71 && mark <=80){
            return "BB";
        }else if(mark >=61 && mark <=70){
            return "BC";
        }else if(mark >=51 && mark <=60){
            return "CD";
        }else if(mark >=41 && mark <=500){
            return "DD";
        }else {
            return "Fail";
        }
    }
}
