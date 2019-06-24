package Module7;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> coll1 = new ArrayList<>();

        coll1.add("Birmingham");
        coll1.add("Leeds");
        coll1.add("Reading");
        coll1.add("Wales");
        coll1.add("Stafford");
        coll1.add("Newcastle");
        coll1.add("Surrey");
        coll1.add("Berlin");
        System.out.println("A list of cites in coll1: ");
        System.out.println(coll1);
        System.out.println("\nIs Leeds in coll1? "
                + coll1.contains("Leeds"));
        coll1.remove("Leeds");
        System.out.println("\n" + coll1.size() +
                " cities are in coll1 now.");

        ArrayList<String> coll2 = new ArrayList<>();
        coll1.add("Berlin");
        coll1.add("Dresden");
        coll1.add("Rleizig");
        coll1.add("Bremen");
        coll1.add("Reading");
        System.out.println("A list of cites in coll2: ");
        System.out.println(coll2.size());

        ArrayList<String> c1 = (ArrayList<String>)(coll1.clone());
        c1.addAll(coll2);
        System.out.println("\nCities in coll1 or coll2: ");
        System.out.println(c1);

        c1 = (ArrayList<String>) (coll1.clone());
        c1.retainAll(coll2);
        System.out.println("\nCites in coll1 and coll2: ");
        System.out.println(c1);

        c1 = (ArrayList<String>) (coll1.clone());
        c1.removeAll(coll2);
        System.out.println("\nCites in coll1, but not in 2: ");
        System.out.println(coll1);


    }
}
