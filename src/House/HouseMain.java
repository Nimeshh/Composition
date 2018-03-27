package House;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

public class HouseMain {
    public static void main(String[] args) {
        nextRoom nRoom = new nextRoom(3, "Daisy", true);
        Room room = new Room(2, 2, 1, "white", nRoom);
        House Bunglow = new House(room);

        Bunglow.welcome();
        nRoom.roomService(true);
    }
}
