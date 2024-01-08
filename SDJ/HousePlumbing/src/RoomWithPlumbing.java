public class RoomWithPlumbing extends Room{
    private boolean floorDrain;

    public RoomWithPlumbing(String type, double size, boolean hasFloorDrain){
        super(type,size);
        this.floorDrain=hasFloorDrain;
    }

    public boolean hasFloorDrain() {
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
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != getClass())
            return false;
        RoomWithPlumbing other = (RoomWithPlumbing) obj;
        return floorDrain == other.floorDrain;
    }
    public Room copy(){
        return super.copy();
    }
}
