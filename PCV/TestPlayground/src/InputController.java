import java.util.Scanner;

public enum InputController {
    INSTANCE;
    Scanner sc = new Scanner(System.in);

    public String getAdvancedInput(){
        return sc.nextLine();
    }

}
