import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        String a = con.nextLine();
        String b = con.nextLine();
        if (a.equals(b))
            System.out.println("строки одинаковые");
        else
        System.out.println("строки разные");
    }
}