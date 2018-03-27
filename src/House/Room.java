package House;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

public class Room {
    private int table;
    private int bed;
    private int closet;
    private String color;
    private nextRoom next;


    public Room(int table, int bed, int closet, String color, nextRoom next) {
        this.table = table;
        this.bed = bed;
        this.closet = closet;
        this.color = color;
        this.next = next;
    }

    public void door(){
        System.out.println("Welcome to the Hotel Services. ");
    }

    public int getTable() {
        return table;
    }

    public int getBed() {
        return bed;
    }

    public int getCloset() {
        return closet;
    }

    public String getColor() {
        return color;
    }

    public nextRoom getNext() {
        return next;
    }
}
