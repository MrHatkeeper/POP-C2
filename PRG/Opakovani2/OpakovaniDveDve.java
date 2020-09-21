import java.util.Scanner;

public class OpakovaniDveDve {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("počet prvočísel");
        int pocetFinal= sc.nextInt();

        int counter = 0;
        int i = 2;
        while (counter < pocetFinal){
            int count = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                counter++;
                System.out.println(i);
            }
            i++;
        }
    }
}
