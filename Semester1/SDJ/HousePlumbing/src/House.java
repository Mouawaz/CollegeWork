public class House {
    private Room[] rooms;

    public House(Room[] rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfRooms() {
        return rooms.length;
    }

    public double getTotalSize() {
        double d = 0;
        for (int i = 0; i < getNumberOfRooms(); i++) {
            d += rooms[i].getSize();
        }
        return d;
    }

    public Room getRoom(String roomType) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getType() == roomType)
                return rooms[i];
        }
        return null;
    }

    public int getNumberOfBathroomsWithShower() {
        int a = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] instanceof BathRoom && ((BathRoom) rooms[i]).hasShower()) {
                a++;
            }

        }
        return a;
    }

    public void installShowersToBathroomsLargerThan(double size) {
        for (int i = 0; i < rooms.length; i++) {
        if(rooms[i] instanceof BathRoom && ((BathRoom) rooms[i]).getSize()>size)
            ((BathRoom) rooms[i]).installShower();
        }
    }
}

