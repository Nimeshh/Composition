package House;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class

public class nextRoom {
    private int numOfFlower;
    private String flower;
    private boolean attachedRestroom;

    public nextRoom(int numOfFlower, String flower, boolean attachedRestroom) {
        this.numOfFlower = numOfFlower;
        this.flower = flower;
        this.attachedRestroom = attachedRestroom;
    }

    public void roomService(boolean attachedRestroom) {
        //attachedRestroom = true;
        while (attachedRestroom) {
            System.out.println("Welcome to the hotel that provides the best room service.");
            break;
        }
    }

    public int getNumOfFlower() {
        return numOfFlower;
    }

    public String getFlower() {
        return flower;
    }

    public boolean isAttachedRestroom() {
        return attachedRestroom;
    }
}
