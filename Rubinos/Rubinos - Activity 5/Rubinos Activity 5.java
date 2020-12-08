public class Activity5 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j > i){
                    System.out.print(" ");
                } else {
                   System.out.print("*"); 
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= 5-j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= 5 - j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            
            if (i >= 2){
                for (int j = 1; j <= 4; j++) {
                    if (j > i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= 5 - j) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }

            if (i >= 2) {
                for (int j = 1; j <= 4; j++) {
                    if (j > i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(i);
                    }
                }
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i <= 5 - j) {
                    System.out.print(" ");
                } else {
                    System.out.print(6-j);
                }
            }

            if (i >= 2) {
                for (int j = 1; j <= 4; j++) {
                    if (j > i - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(j+1);
                    }
                }
            }
            System.out.print("\n");
        }
        
    }
}
