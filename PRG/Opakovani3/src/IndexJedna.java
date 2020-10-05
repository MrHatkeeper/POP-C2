import java.util.Arrays;
import java.util.Scanner;

public class IndexJedna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Zadej string");
        String s = scan.nextLine();

        String[] arr = new String[s.length()];

        //udělání si array na poměřování
        for(int i = 0; i < s.length();i++){
            String letter = String.valueOf(s.charAt(i));
            int count = 0;
            for(int j = 0; j < arr.length;j++){
                if(letter.equals(arr[j])){
                    count++;
                }
            }
            if(count == 0){
                arr[i] = letter;
            }
        }
        System.out.println(Arrays.toString(arr));



        for(int i = 0; i <arr.length; i++){
            int count = 0;
            for(int j = 0; j < s.length(); j++ ){
                if(arr[i].equals(s.charAt(j))){
                    count++;
                }
            }
            System.out.println(arr[i] + " je zde " + count);
        }
    }
}
