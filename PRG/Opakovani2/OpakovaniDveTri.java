import java.util.Scanner;

public class OpakovaniDveTri {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Počet čísel");
        int pocet = Integer.parseInt(sc.nextLine());

        String[] cisla = new String[pocet];
        for(int i = 0; i < pocet; i++){
            System.out.println("Zadej číslo");
            cisla[i] = sc.nextLine();
        }

        for(String i: cisla){
            boolean jeCislo = false;
            System.out.println("Zjisti číslo");
            String pomer = sc.nextLine();
            for (int j = 0; j < cisla.length;j++) {
                if(pomer.equals(cisla[j])){
                    System.out.println("Číslo " + cisla[j] + " bylo zadáno " + (j + 1) + ".");
                    jeCislo = true;
                    break;
                }
            }
            if(!jeCislo){
                System.out.println("-1 není tam");
            }
        }
    }
}
