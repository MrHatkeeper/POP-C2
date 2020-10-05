import java.util.Arrays;
import java.util.Scanner;

public class IndexDva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Kolik čísel");
        int i = scan.nextInt();
        int[] arr = new int[i];
        for(int j = 0;j < i; j++ ){
            System.out.println("Zadej čísla");
            int add = scan.nextInt();
            arr[j] = add;
        }

        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            System.out.println("arr[(arr.length/2)] = "  + arr[(arr.length/2)] + " arr[((arr.length/2) - 1)] = " + arr[((arr.length/2) - 1)]);
            float result = ((float) arr[(arr.length/2)] + (float) arr[((arr.length/2) - 1)]) / 2;
            System.out.println("Medián je " + result);
        }
        else{
            System.out.println("Medián je " + arr[(arr.length/2)]);
        }
    }
}
