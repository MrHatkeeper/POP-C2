public class NonPrimeNumber {
    public static void main(String []args){


        for(int i = 2; i < 101; i++){
            int count = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(i);
            }
        }
    }
}
