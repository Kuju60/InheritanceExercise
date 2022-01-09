package javaEbook.chapterThree;
import java.util.Scanner;

public class Quadratic {
    //create main method
    public static void main( String[] args ){
        //create scanner object
        Scanner input = new Scanner( System.in);
        //declaring variables
        System.out.print("Enter the values of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the values of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the values of c: ");
        double c = input.nextDouble();
        //initializing the roots
        double root1 = 0;
        double root2 = 0;
        double  result = b * b - 4 * a * c;
        //using the if statement
        if( result < 0){
            System.out.println("Roots are not possible ");
        }
        if( result > 0){
            System.out.println("Roots are unequal ");

            root1 = ( -b + Math.sqrt(result))/(2*a);
            root2 = ( -b - Math.sqrt( result))/(2*a);
        }
        if (result == 0){
            System.out.println("Roots are equal ");

            root1 = -b / (2 * a);
            root2 = -b / (2 * a);
        }
        System.out.println("The quadratic equation roots are: ");
        System.out.println("Root 1 : " + root1);
        System.out.println("Root 1 : " + root2);
    }

}