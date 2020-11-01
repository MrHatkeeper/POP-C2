import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Battlefield battlefield = new Battlefield();
    Scanner scanner = new Scanner(System.in);

    String[][] mapHracJedna;
    String[][] strelyHracJedna;
    int pocetPrvni;


    String[][] mapHracDve;
    String[][] strelyHracDve;
    int pocetDruhy;

    public void startHry(){
        System.out.println("Zadej x");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadej y");
        int y = Integer.parseInt(scanner.nextLine());
        mapHracJedna = battlefield.vytvoritPole(x,y);
        mapHracDve = battlefield.vytvoritPole(x,y);
        strelyHracJedna = battlefield.vytvoritPole(x,y);
        strelyHracDve = battlefield.vytvoritPole(x,y);
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

    public boolean fire(int x, int y, int hrac){
        String[][] aktivStrely;
        String[][] aktivMapa;
        if(hrac % 2 == 0){
            aktivStrely = strelyHracDve;
            aktivMapa = mapHracJedna;
        }
        else{
            aktivStrely = strelyHracJedna;
            aktivMapa = mapHracDve;
        }
        System.out.println("");
        System.out.println("Tvoje pokusy");

        if(aktivMapa[x][y].equals("█")){
            aktivMapa[x][y] = "Hit";
            aktivStrely[x][y] = "Hit";

            System.out.println("");
            System.out.println("Hit");
            System.out.println("");
        }
        else if(aktivMapa[x][y].equals("#")){
            aktivMapa[x][y] = "Miss";
            aktivStrely[x][y] = "Miss";
            System.out.println("Miss");
        }
        for(int i = 0; i < aktivStrely.length; i++){
            System.out.println(Arrays.toString(aktivStrely[i]));
        }
        System.out.println("");
        int count = 0;
        for(int i = 0; i < aktivMapa.length; i++){
            for(int j = 0; j < aktivMapa[i].length; j++){
                if(aktivMapa[i][j].equals("█")){
                    count++;
                }
            }
        }
        if(count == 0){
            return true;
        }
        return false;
    }
}
