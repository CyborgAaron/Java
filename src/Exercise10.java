public class Exercise10 {
    public static void main(String[] args) {
        int packagePrice = 10_000;
        String PackageType = "Gold";
        switch (PackageType)
        {
            case "Bronze": packagePrice = packagePrice + 250;
                break;
            case "Silver": packagePrice = packagePrice + 500;
                break;
            case "Gold": packagePrice = packagePrice + 1000;
                break;
                default: packagePrice = packagePrice + 0;
                    break;
//            case 4: PackageType = "January";
//                break;

        }
        System.out.println(PackageType + " is " + packagePrice);
    }

}
