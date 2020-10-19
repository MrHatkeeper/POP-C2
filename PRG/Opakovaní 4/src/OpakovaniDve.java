import java.util.Scanner;

public class OpakovaniDve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Slovo");
        String slovo = scanner.nextLine();
        String output = "";

        for(int i = slovo.length() - 1 ; i >= 0; i--){
            output += slovo.charAt(i);
        }
        System.out.println(output);
    }
}
