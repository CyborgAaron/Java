package Module8;

public class _04_Class {
    public static void main(String[] args) {
        _03_TVDemo channel1 = new _03_TVDemo();
//        System.out.println("TV1'S " + channel1.on + " channel is " + channel1.channel + " and volume is " + channel1.volumeLevel);

        _03_TVDemo channel2 = new _03_TVDemo();
//        channel2.channel = 30;
//        channel2.volumeLevel = 3;
        channel2.turnOn();
        channel2.setChannel(3);
        channel2.setVolume(3);

        System.out.println("TV2's channel is " + channel2.channel + " and volume is " + channel2.volumeLevel);

//        channel1.channel = 3;
//        channel1.volumeLevel = 3;
        channel1.turnOn();
        channel1.setChannel(30);
        channel1.setVolume(3);
        System.out.print("TV1's Channel is " + channel1.channel + " and volume is " + channel1.volumeLevel);



    }


}
