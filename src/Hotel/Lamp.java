package Hotel;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.


public class Lamp {
    private boolean battery;
    private String type;

    public Lamp(boolean battery, String type) {
        this.battery = battery;
        this.type = type;
    }

    public void turnOn(){
        System.out.println("The lamp is now on.");
    }
    public boolean isBattery() {
        return battery;
    }

    public String getType() {
        return type;
    }
}
