import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int array[];
        
        array = new int[10];
        
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter a number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
    }
    
}