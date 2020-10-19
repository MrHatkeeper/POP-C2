import java.util.Scanner;

public class OpakovaniTri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String slovo = scanner.nextLine();
        if(Palindrom(slovo)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    static boolean  Palindrom(String slovo){
        int i = 0;
        int j = slovo.length() - 1;

        while(i<j){
            if(slovo.charAt(i) != slovo.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
