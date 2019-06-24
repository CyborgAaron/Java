public class AnotherStackAndHeap {
    public static void main(String[] args) {
        int myInt =4;
        int anotherInt = 4;
        System.out.println(myInt);
        System.out.println(anotherInt);
        if (myInt == anotherInt) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();

        myInt = 5;
        System.out.println(myInt);
        if (myInt == anotherInt) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println();

        String myStrring = "Sparta Global Ltd";
        String anotherString = "Sparta Glboal Ltd";
        System.out.println(myStrring);
        System.out.println(anotherString);
        if (myStrring == anotherString) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        System.out.println();


        String YetanotherString =  new String ("Sparta Glboal Ltd");
        System.out.println(YetanotherString);
        if (myStrring == YetanotherString) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();

        if (myStrring.equals(YetanotherString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
