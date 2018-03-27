package Hotel;

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.


public class Bed {
    private String style;
    private int quilt;
    private int blanket;
    private int sheet;

    public Bed(String style, int quilt, int blanket, int sheet) {
        this.style = style;
        this.quilt = quilt;
        this.blanket = blanket;
        this.sheet = sheet;
    }

    public void make(){
        System.out.println("Bed--> Making");

    }

    public String getStyle() {
        return style;
    }

    public int getQuilt() {
        return quilt;
    }

    public int getBlanket() {
        return blanket;
    }

    public int getSheet() {
        return sheet;
    }
}
