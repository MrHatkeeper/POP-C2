import java.util.Scanner;

public class Lode {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);

        player.startHry();
        player.polozitLode();

        boolean gameOver = false;
        int count = 1;
        while(!gameOver){
            if(count % 2 == 0){
                System.out.println("Na tahu je hráč 2");
            }
            else{
                System.out.println("Na tahu je hráč 1");
            }
            System.out.println("Kam chceš střílet (X)");
            int x = scanner.nextInt();
            System.out.println("Kam chceš střílet (Y)");
            int y = scanner.nextInt();
            gameOver = player.fire(y - 1, x - 1, count);
            count++;
        }
        if(count % 2 == 0){
            System.out.println("Vyhrál hráč dva");
            System.out.println("Vyhrál hráč jedna");
        }
        else{
            System.out.println("Vyhrál hráč dva");
        }
    }
}
