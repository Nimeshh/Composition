package Hotel;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.


public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, "White");
        Bed bed = new Bed("King", 1, 1,1);
        Lamp lamp = new Lamp(false, "antique");
        Hotel hotel = new Hotel("Hilton", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        hotel.makeBed();
        hotel.getLamp().turnOn();
        System.out.println(hotel.getName());

    }
}
