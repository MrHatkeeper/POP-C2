import java.util.Scanner;

public class IndexJedna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Zadej string");
        String s = scan.nextLine();
        System.out.println("Má to " + s.length() + " znaky");
    }
}
