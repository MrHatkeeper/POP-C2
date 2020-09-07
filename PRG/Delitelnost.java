import java.util.Scanner;

public class Delitelnost{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Zadej číslo");
        int del = scan.nextInt();

        if(del % 7 == 0){
            System.out.println("Je dělitelné");
        }
        else{
            System.out.println("Není dělitelné");
        }
    }
}