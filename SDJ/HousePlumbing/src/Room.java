import java.util.Objects;

public abstract class Room {
    private String type;
    private double size;

    public Room(String type, double size){
        this.type=type;
        this.size=size;
    }

    public String getType() {
        return type;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return Double.compare(size, room.size) == 0 && Objects.equals(type, room.type);
    }
    //to add copy()
}
