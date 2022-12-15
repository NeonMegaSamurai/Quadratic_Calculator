import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a;
        double b;
        double c;

        double D;

        double x1;
        double x2;

        System.out.print("Enter a: ");
        a = scan.nextDouble();

        System.out.print("Enter b: ");
        b = scan.nextDouble();

        System.out.print("Enter c: ");
        c = scan.nextDouble();

        D = Math.pow(b,2) - 4 * a * c;
        System.out.println("The discriminant is: " + D);
        if(D >= 0){
            x1 =(-b + Math.sqrt(D))/(2 * a);
            x2 =(-b - Math.sqrt(D))/(2 * a);
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else if (D < 0) {
            x1 =-b/(2 * a) ;
            x2 =-b/(2 * a) ;
            double d_i1 = Math.sqrt(-D)/(2 * a);
            double d_i2 = -Math.sqrt(-D)/(2 * a);
            System.out.println("X1 = " + x1 + "+" + d_i1 + "i");
            System.out.println("X2 = " + x2 + d_i2 + "i");
        }
    }
}