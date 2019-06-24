import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userOption;
        boolean selectControllers = true;

//        String ps;
        do {

            System.out.println("------Main MENU-------");
            System.out.println("Option 1: One Player");
            System.out.println("Option 2: Two Players");
            System.out.println();
            System.out.print("Select an option");
            userOption = sc.nextInt();

//            int playerSelect = sc.nextInt();
//            System.out.println(playerSelect);
//            playerSelect--;

            switch (userOption) {

                case 1:
//                    System.out.println(); "You have chosen Player one. Please continue";
                    System.out.println("You have chosen Player one. Please continue");
                    break;
                case 2:
//                    ps = "You have chosen Player Two. Please continue";
                    System.out.println("You have chosen Player Two. Please continue");
                    break;
//                case 3:
//                    ps = "This is invalid. Please choose between 1 and 2";
                    //System.out.println("This is invalid. Please choose between 1 and 2");
//                    break;
                default:
//                    ps = "This is invalid. Please choose between 1 and 2";
                    System.out.println("This is invalid. Please choose between 1 and 2");
                    break;
            }
//            System.out.println(ps);

        }
        while (selectControllers);
        sc.close();

//        System.out.println("The Chosen Player is: " + playerSelect + selectControllers);

    }

}
