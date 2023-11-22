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
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].getType()==type) return rooms[i];
        }
        return null;
    }
    public int getNumberOfBathroomsWithShower(){
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            //if(rooms[i].==true) count++;
        }
        return count;
    }

}
