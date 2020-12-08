import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String num1;
        String num2;
        float first;
        float second;
        
        num1 = JOptionPane.showInputDialog("Enter first number: ");
        num2 = JOptionPane.showInputDialog("Enter second number: ");
        
        first = Float.parseFloat(num1);
        second = Float.parseFloat(num2);
        
        float sum = first + second;
        float product = first * second;
        float difference = java.lang.Math.abs(first - second);
        float quotient = (first / second);
        float remainder = (first % second);
        
        String msg = "Sum = " + sum + "\n" + "Product = " + product + "\n" + "Difference = " + difference + "\n" +
                "Quotient = " + quotient + "\n" + "Remainder = " + remainder;
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
