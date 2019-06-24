package Module7;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Paris");
        coll.add("Bordeaux");
        coll.add("Toulouse");
        coll.add("Lyon");

        coll.forEach(e -> System.out.println((e.toUpperCase() + " ")));



    }

}
