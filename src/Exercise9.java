public class Exercise9 {
    public static void main(String[] args) {
        int age = 90, YounAge = 35, matureAge = 36, ElderAge =60;
        if (age <= 17) {
            System.out.println("Can't get insurance");
        } else if (age <= YounAge) {
            System.out.println("Insurance will cost £1000");
        } else if ( age <= ElderAge) {
            System.out.println("Insurance will cost £2000");
        } else {
            System.out.println("Insurance costs £500");
        }
    }
}
