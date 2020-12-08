public class Main {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        
        int BIG = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);
        
        System.out.println("number 1 = " + num1);
        System.out.println("number 2 = " + num2);
        System.out.println("number 3 = " + num3);
        System.out.println("The highest number is = " + BIG);
    }   
}
