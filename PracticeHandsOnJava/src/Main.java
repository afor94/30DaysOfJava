import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        if(s.equals("Alec")) {
            System.out.println("Hey Alec");
        } else if(s.equals("Sally")){
            System.out.println("Hey Sally");
        } else{
            System.out.println("You're not welcome here");
        }

        in.close();
    }
}
