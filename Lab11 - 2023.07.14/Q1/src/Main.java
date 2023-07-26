import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Enter First integer: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second integer: ");
        num2 = sc.nextInt();
        try{
            int num3 = num1/num2;
            System.out.println("Answer: "+num3);
        }
        catch (ArithmeticException e){
            System.out.println("You Can't Divide by Zero!!!");
        }
    }
}