import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String input;
        float Celsius;
        float Fahrenheit;
        
        input = JOptionPane.showInputDialog("Enter a temperature in Celsius: ");
        
        Celsius = Float.parseFloat(input);
        
        Fahrenheit = (Celsius * 9/5) + 32;
        
        JOptionPane.showMessageDialog(null, "Fahrenheit = " + Fahrenheit);
    }
}
