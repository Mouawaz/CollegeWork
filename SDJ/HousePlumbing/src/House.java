import java.lang.reflect.Array;

public class House {
    Room rooms[];
    public  House(Room[] rooms){

    }
    public int getNumberOfRooms(){
        return rooms.length;
    }
    public double getTotalSize(){
        double meow=0;
        for (int i = 0; i < rooms.length; i++) {
            meow+=rooms[i].getSize();
        }
        return meow;
    }
    public Room getRoom(String type){
        for (Room room : rooms) {
            if (room.getType() == type) return room;
        }
        return null;
    }
    public int getNumberOfBathroomsWithShower(){
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            //if(rooms[i].hasShower==true) count++;
        }
        return count;
    }

    public void installShowerToBathroomsLargerThan(double size){
        for (Room room : rooms) {
            //if (room.getType() == "bathroom" && room.getSize()>size) room.installShower;
        }
    }
}
