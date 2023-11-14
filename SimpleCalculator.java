import java.util.Scanner;

public class SimpleCalculator {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("Welcome All!");
        while (true) {
        System.out.println("Menu of Simple Calculator!");
        System.out.println("1. Addition\n2.Subtracation\n3.Multiplication\n4.Division\n0.For exit Program");
        int userInput = sc.nextInt();

        if (userInput == 1) {
            calculator.add();
        }
        else if (userInput == 2) {
            calculator.sub();            
        }
        else if (userInput == 3) {
            calculator.mul();
        }
        else if (userInput == 4) {
            calculator.div();
        }
        else if (userInput == 0) {
            break;            
        }
    }
    }
    public void add(){
        System.out.println("Addition");           
        System.out.println("Enter First Number");
        float input1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float input2 = sc.nextFloat();
        float sum = input1+input2;
        System.out.println("The sum is: "+ sum);    
    }
    public void sub(){
        System.out.println("Subtraction");
        System.out.println("Enter First Number");
        float input1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float input2 = sc.nextFloat();
        float sum = input1-input2;
        System.out.println("The Subtraction is: "+ sum); 
    }
    public void mul(){
        System.out.println("Multiplication");
        System.out.println("Enter First Number");
        float input1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float input2 = sc.nextFloat();
        float sum = input1*input2;
        System.out.println("The Multiplication is: "+ sum); 
    }
    public void div(){
        System.out.println("Division");
        System.out.println("Enter First Number");
        float input1 = sc.nextFloat();
        System.out.println("Enter Second Number");
        float input2 = sc.nextFloat();
        float sum = input1/input2;
        System.out.println("The Division is: "+ sum); 
    }
}
