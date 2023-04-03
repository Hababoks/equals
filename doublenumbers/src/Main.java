import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        if (Math.abs(b-a) < 0.000001 )
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}