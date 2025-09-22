import java.util.*;

public class calculator{

    //Methods for operations
    public static double addition(double a , double b){
        return a+b;
    }

    public static double subtraction(double a , double b){
        return a-b;
    }

    public static double multiplication(double a , double b){
        return a*b;
    }

    public static double division(double a , double b){
        if(b==0){
            System.out.println("Error! : The Divison by zero is not Allowed");
            return 0 ;
        }

        return a/b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean running  = true;

        // Menu
        while(running) {
            System.out.println("/n Calculator Menu ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Choose an option");

            int choice  = sc.nextInt();

            if(choice == 5){
                System.out.println("Exiting the Calculator\nByee Byeee....");
                running = false;
                continue;
            }

            // Taking Inputs

            System.out.println("Enter First Number: ");
            double num1 = sc.nextDouble();

            System.out.println("Enter Second Number: ");
            double num2 = sc.nextDouble();

            double result = 0;


            //Performing Operations

            switch(choice) {
                case 1: 
                    result = addition(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = subtraction(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = multiplication(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    result = division(num1, num2);
                    System.out.println("Result: " + result);
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}