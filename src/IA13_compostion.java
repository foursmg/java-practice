class Room {
    Room() {
        System.out.println("Room created");
    }

    void showRoom() {
        System.out.println("This is a room");
    }
}

class House {
    private Room room;   // HAS-A (composition)

    House() {
        room = new Room();  // created inside → strong dependency
    }

    void showHouse() {
        System.out.println("This is a house");
        room.showRoom();
    }
}

public class IA13_compostion {
    public static void main(String[] args) {

        House h = new House(); // only House created
        h.showHouse();
    }
}