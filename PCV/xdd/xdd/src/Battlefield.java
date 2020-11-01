import java.util.Arrays;
import java.util.Scanner;

public class Battlefield {
    Scanner scanner = new Scanner(System.in);


    public String[][] vytvoritPole(int x, int y){
        String[][] fieldType = new String[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                fieldType[i][j] = "#";
            }
        }
        return fieldType;
    }

    public String[][] addShip(String[][] mapa){

        int count = 0;
        while(count < 1){
            System.out.println("Jakou loď chceš položit (Carrier, Battleship, Destroyer, Submarine, PatrolBoat)");
            String lod = scanner.nextLine();
            System.out.println("Kam chceš položit loď (X)");
            int poziceY = Integer.parseInt(scanner.nextLine()) - 1;
            System.out.println("Kam chceš položit loď (Y)");
            int poziceX = Integer.parseInt(scanner.nextLine()) - 1;

            boolean otocit = false;
            System.out.println("Chceš dát loď horizontálně (y/n)");
            String xd = scanner.nextLine();
            if (xd.equals("y")) {
                otocit = true;
            } else {
                otocit = false;
            }





            int boatLenght = 0;
            if(lod.equals("Carrier")){
                boatLenght = 5;
            }
            else if (lod.equals("Battleship")){
                boatLenght = 4;
            }
            else if (lod.equals("Destroyer")){
                boatLenght = 3;
            }
            else if (lod.equals("Submarine")){
                boatLenght = 3;
            }
            else if (lod.equals("PatrolBoat")){
                boatLenght = 2;
            }

            int x = boatLenght;
            int y = 1;

            if(otocit){
                y = x;
                x = 1;
            }

            boolean empty = false;
            while(!empty){
                empty = true;
                for (int i = poziceX; i < poziceX + x; i++) {
                    for (int j = poziceY; j < poziceY + y; j++) {
                        if (mapa[i][j] != "#") {
                            empty = false;
                            break;
                        }
                    }
                }
                if(!empty){
                    System.out.println("Zkus dát loď někam jinam");
                    break;
                }
            }

            if(empty){
                for(int i = poziceX; i < poziceX + x;i++){
                    for(int j = poziceY; j < poziceY + y;j++){
                        mapa[i][j] = "█";
                    }
                }
            }
            for(int i = 0; i < mapa.length;i++){
                System.out.println(Arrays.toString(mapa[i]));
            }
            count++;
        }
        return mapa;
    }
}
