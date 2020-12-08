import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = 0, num = 0;
        
        System.out.print("Enter size of array: ");
        size = input.nextInt();
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            list.add(num);
        }
        
        Collections.sort(list);
        
        System.out.println("The smallest element is: " + list.get(0));
        System.out.println("The largest element is: " + list.get(list.size() - 1));
    }
    
}
