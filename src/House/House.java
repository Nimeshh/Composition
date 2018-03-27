package House;

public class House {
    private Room room;

    public House(Room room) {
        this.room = room;
    }

    public void welcome() {
        beautiful();
    }

    private void beautiful() {
        room.door();
    }
}
