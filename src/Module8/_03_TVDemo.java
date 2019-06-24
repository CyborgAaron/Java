package Module8;

public class _03_TVDemo {
    int channel = 1; // Default channel is 1
    int volumeLevel = 1; // Default volume level is 1
    boolean on = false; // By default TV is off

    // Constructor
    public _03_TVDemo() {
    }

    // Turn on TV
    public void turnOn() {
        on = true;
    }

    // Turn off TV
    public void turnOff() {
        on = false;
    }

    // Set a new channel
    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    // Set a new volume
    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    // Increase channel
    public void channelUp() {
        if (on && channel < 120)
            channel++;
    }

    // Decrease channel
    public void channelDown() {
        if (on && channel > 1)
            channel--;
    }

    // Increase volume
    public void volumeUp() {
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    // Decrease volume
    public void volumeDown() {
        if (on && volumeLevel > 1)
            volumeLevel--;
    }

}

