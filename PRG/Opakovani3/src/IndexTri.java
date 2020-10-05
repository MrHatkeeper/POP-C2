import java.util.Scanner;

public class IndexTri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Kolik čísel");
        int count = scan.nextInt();
        int[] arr = new int[count];
        for(int j = 0;j < count; j++ ){
            System.out.println("Zadej čísla");
            int add = scan.nextInt();
            arr[j] = add;
        }

        int result = 0;
        for(int i = 0; i < arr.length;i++){
            result += arr[i];
        }
        System.out.println("Výsledek je " + ((float)result / arr.length));
    }
}
