import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.push("alec");
        names.push("emily");
        names.push("louise");

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        names.add(2, "Bean");

        for(String s: names){
            System.out.println(s);
        }

        ListIterator<String> lit = names.listIterator();
        lit.next();
        lit.next();
        lit.add("Kuiper");

        for(String s: names){
            System.out.println(s);
        }


    }
}
