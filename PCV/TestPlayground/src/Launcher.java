import java.util.Scanner;

public class Launcher {

    public void run(){
        while (true) {
            /**
             * TODO
             * 1) posunte kod nize, tak aby zmena jazyka probihala v LanguageManageru
             * 2) upravte kod tak, aby nacitani vstupu probihalo v InputManager
             *      - ten vytvorte, pouzijte navrhovy vzor singleton, implementujte pomoci enumu
             */

            LanguageManager.INSTANCE.changeLanguage();

        }
    }
}
