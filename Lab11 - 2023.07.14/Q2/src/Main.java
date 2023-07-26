import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6};
    try{
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        int value = array[index];
        System.out.println("Value at index "+index+" :"+value);
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Error: invalid index access!!!");
    }
    finally {
        for(int i=0; i< array.length;i++){
            System.out.println(array[i]);
        }
    }

    }
}