import java.util.Scanner;

public class OpakovaniDveJedna {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Jakási věta");
        String[] arr = sc.nextLine().split(" ");

        System.out.println(arr[arr.length - 2]);

    }
}
