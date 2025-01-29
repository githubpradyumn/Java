
public class Patterns {
    public static void main(String[] args) {
        // // Question01
        // // *****
        // // *****
        // // *****
        // // *****
        // // *****
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         System.out.print('*');
        //     }
        //     System.out.println( );
        // }
        // // Question 02
        // // *
        // // **
        // // ***
        // // ****
        // // *****
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print('*');
        //     }
        //     System.out.println( );
        // }
        // // Question 03
        // // *****
        // // ****
        // // ***
        // // **
        // // *
        // for (int i = 0; i < 5; i++) {
        //      for (int j = i; j < 5; j++) {
        //          System.out.print('*');
        //      }
        //      System.out.println( );
        //  }
        // for (int i = 0; i < 5; i++) {
            // for (int j = 0; j < 5 - i; j++) {
                // System.out.print('*');
            // }
            // System.out.println( );
        // }
        // // Question 04
        // // 1
        // // 12
        // // 123
        // // 1234
        // // 123345
        // int num = 1;
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(num );
        //     } 
        //     System.out.println( );
        // }
        // // Question 05
        // // 1
        // // 22
        // // 333
        // // 4444
        // // 55555
        // int num = 1;
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(num );
        //     }
        //     num++;  
        //     System.out.println( );
        // }
        // // Question 06
        // // 12345
        // // 1234
        // // 123
        // // 12
        // // 1
        // int num = 1;
        // for (int i = 0; i < 5; i++) {
        //     for (int j = i; j < 5; j++) {
        //         System.out.print(num + j - i);
        //     }
        //     System.out.println( );
        // }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j < 4 - i -1){
                    System.out.print(' ');
                } else if (j > 4 + i -1) {
                    System.out.print(' ');
                } else {
                    System.out.print("*");
                }
                }
            System.out.println( );
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (i > j ){
                    System.out.print(' ');
                } else if (j >= 7-i){
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println( );
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                if (j < 4 - i -1){
                    System.out.print(' ');
                } else if (j > 4 + i -1) {
                    System.out.print(' ');
                } else {
                    System.out.print("*");
                }
            }
            System.out.println( );
        }
        for (int i = 4; i < 8; i++) {
            for (int j = 4; j < 11; j++) {
                if (i > j ){
                    System.out.print(' ');
                } else if (j > 14-i){
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println( );
        }
        for (int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < i+1; j ++){
                System.out.print('*');
            }
            System.out.println( );
        }
        for (int i = 0 ; i < 5 ; i++) {
            for(int j = 0 ; j < 4 - i; j ++){
                System.out.print('*');
            }
            System.out.println( );
        }
    }
    
}
