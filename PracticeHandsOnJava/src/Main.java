import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     

        LinkedList<String> names = new LinkedList<String>();
        names.push("alec");
        names.push("emily");
        names.push("louise");
        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());
    }
}
