package Module7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDEMO {
    public static void main(String[] args) {

        Collection<String> coll1 = new ArrayList<>();
        coll1.add("EdinBurugh");
        coll1.add("EdinBurugh");
        coll1.add("EdinBurugh");
        coll1.add("EdinBurugh");

        Iterator<String> it = coll1.iterator();
        //Going through each elements in the ArrayList
        while (it.hasNext()) {
            System.out.println(it.next().toUpperCase() + " ");
        }
        System.out.println();
    }
}
