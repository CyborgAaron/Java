public class Exercise7 {
    public static void main(String[] args) {
        int x = 5, y = 5, i, j;
        System.out.print("pre Increment");
        System.out.print("\t");
        System.out.println("post Increment");

        System.out.print("x = 5");
        System.out.print("\t\t\t");
        System.out.println("y = 5");

        System.out.println("===================================");

        System.out.print(i=--x);
        System.out.print("\t\t\t\t");
        System.out.println(j=y--);

        System.out.print(i=--x);
        System.out.print("\t\t\t\t");
        System.out.println(j=y--);

        System.out.print(i=--x);
        System.out.print("\t\t\t\t");
        System.out.println(j=y--);

        System.out.println("=================================");

        int a =5, b =3, c = 5, d = 3, e = a * --b, f = c * d--;

        System.out.print("e");
        System.out.print("\t\t\t\t");
        System.out.println("f");

        System.out.println("================================");

        System.out.print(a * --b);
        System.out.print("\t\t\t\t");
        System.out.println(c * --d);
    }

}
