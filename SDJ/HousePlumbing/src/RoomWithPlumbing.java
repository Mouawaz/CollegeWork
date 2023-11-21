import java.util.Objects;

public abstract class RoomWithPlumbing extends Room {
    private boolean floorDrain;

    public RoomWithPlumbing(String type, double size,boolean hasFloorDrain){
        super(type,size);
        this.floorDrain=hasFloorDrain;
    }
    public boolean hasFloorDrain(){
        return floorDrain;
    }
    public void addFloorDrain(){
        this.floorDrain=true;
    }

    @Override
    public String toString() {
        return "RoomWithPlumbing{" +
                "floorDrain=" + floorDrain +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoomWithPlumbing that = (RoomWithPlumbing) o;
        return floorDrain == that.floorDrain;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floorDrain);
    }

    //to add copy
}
