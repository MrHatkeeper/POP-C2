import java.util.Scanner;

public class OpakovaniJedna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String stringJedna = scan.nextLine();
        String stringDva = scan.nextLine();

        if(stringJedna.startsWith(stringDva)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
