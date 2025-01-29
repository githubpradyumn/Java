
public class Patterns {
    public static void main(String[] args) {
        // char a = '*';
        // // *
        // // **
        // // ***
        // // ****
        // // *****
        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j < i+1; j++) {
        //         System.out.print(a);
        //     }
        //     System.out.println( );
        // }
        // // *****
        // // ****
        // // ***
        // // **
        // // *
        // for (int i = 0; i < 5; i++) {
        //     for (int j = i; j < 5; j++) {
        //         System.out.print(a);
        //     }
        //     System.out.println( );
        // }
        char c = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(c) ;
                c++;
            }
            System.out.println( );
        }
    }
    
}
