import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int input;
        double Celsius;
        double Fahrenheit;
        double output;
        
        input = Integer.parseInt(JOptionPane.showInputDialog("Choose:" + "\n" + "1: C -> F" + "\n" + "2: F -> C"));
        
        switch (input){
            case 1:
                Celsius = Double.parseDouble(JOptionPane.showInputDialog("Enter value: "));
                
                output = (Celsius * 9/5) + 32;
                
                JOptionPane.showMessageDialog(null, Celsius + " degrees Celsius = " + output + " degrees Fahrenheit");
                break;
            case 2:
                Fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Enter a value: "));
                
                output = (Fahrenheit - 32) * 5/9;
                
                JOptionPane.showMessageDialog(null, Fahrenheit + " degrees Fahrenheit = " + output + " degrees Celsius");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Enter either 1 or 2", "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
