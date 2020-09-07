public class PrimeNumber {
    public static void main(String []args){

        String prime = "";
        for(int i = 1; i < 101; i++){
            int count = 0;
            for(int j = i; j > 2; j--){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                prime += i + " ";
            }
        }
        System.out.println(prime);
    }
}
