package app;
import java.util.Scanner;
public class calculator {



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.print("first number:");
            int s = scan.nextInt();
            System.out.print("second number :");
            int i = scan.nextInt();
            System.out.println("result is :"+(s+i));


        }
}
