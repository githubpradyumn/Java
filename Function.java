


public class Function{

    public static int calculateSum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void Swapping (int first , int second){
        int temp = first ;
        first = second;
        second = temp;
    }
    
   
    // public static void main(String[] args) {
        //     // Scanner sc = new Scanner(System.in);
        //     // int num1 = sc.nextInt();
        //     // int num2 = sc.nextInt();
        //     // int sum = calculateSum(num1,num2);
        //     // System.out.println(sum);
        // }


    public static int Product(int a , int b){
        int result = a * b;
        return result;
    }
    // public static void main(String[] args) {
    //     int num1 = 5;
    //     int num2 = 10;
    //     int product = Product(num1,num2);
    //     System.out.println("Product of num1*num2 is :" + product);
    //     product = Product(10 , 2);
    //     System.out.println("Product of num1*num2 is :" + product);
    // }
//   Factorial of a number 
    public static int Factorial(int num){
        int n = 1;
        for (int i = 1 ; i <= num; i++) {
            n = n * i;
        }
        return n ;
    }
    // public static void main(String[] args) {
    //     int num = 4;
    //     int result = Factorial(num);
    //     System.out.println(result);
    // }
    

} 