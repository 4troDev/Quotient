import java.util.Scanner;
public class Quotient {

    public static void main(String[] args) {
        // TODO Auto-generated method stubs
        Scanner in = new Scanner(System.in);


        System.out.print("Please Enter A Number >> ");
        int a = in.nextInt();

        System.out.print("Please Enter Another Number >> ");
        int b = in.nextInt();
        
        int ans = a / b;
        
        System.out.println("The quotient of " + a + " and " + b + " is: " + ans );
    }
}