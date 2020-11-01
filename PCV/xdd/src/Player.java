import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Battlefield battlefield = new Battlefield();
    Scanner scanner = new Scanner(System.in);

    String[][] mapHracJedna;
    String[][] mapHracDve;
    public void startHry(){
        System.out.println("Zadej x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadej y");
        int y = Integer.parseInt(scanner.nextLine());
        mapHracJedna = battlefield.vytvoritPole(x,y);
        mapHracDve = battlefield.vytvoritPole(x,y);
        for(int i = 0; i < mapHracJedna.length; i++){
            System.out.println(Arrays.toString(mapHracJedna[i]));
        }
    }

    public void polozitLode(){
        System.out.println("");
        System.out.println("Hráč jedna pokládá lodě");
        System.out.println("");
        mapHracJedna = battlefield.addShip(mapHracJedna);
        System.out.println("");
        System.out.println("Hráč dvě pokládá lodě");
        System.out.println("");
        mapHracDve = battlefield.addShip(mapHracDve);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public void fire(int x, int y, int hrac){
        String [][] aktivMapa;
        if(hrac % 2 == 0){
            aktivMapa = mapHracJedna;
        }
        else{
            aktivMapa = mapHracDve;
        }
    }
}
