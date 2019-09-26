import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] avg) {
//        Scanner sc=new Scanner(System.in);
        int a = -1, b;
        Scanner nhap = new Scanner(System.in);
        while (a != 0) {
            System.out.println("Enter a: ");

            a = nhap.nextInt();
            System.out.println("Enter b: ");
            b = nhap.nextInt();
            a = Math.abs(a);
            b = Math.abs(b);
            if (a == 0 || b == 0)
                System.out.println("No greatest common factor");
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            System.out.println("Greatest common factor: " + a);
        }
    }
}