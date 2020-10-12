import java.util.HashMap;
import java.util.Scanner;

class IndexJedna{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char[] input = scan.nextLine().toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (char ch = 'a';ch < 'z';ch++){
            map.put(ch, 0);
        }


        for(char ch : map.keySet()){
            int xd = 0;
            for(int i = 0; i < input.length;i++){
                if(ch == input[i]){
                    map.replace(ch, xd += 1);
                }
            }
        }
        System.out.println(map);
    }
}