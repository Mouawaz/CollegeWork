public class BathRoom extends RoomWithPlumbing{
    private boolean hasShower;

    public BathRoom(double size, boolean hasShower){
        super("bathroom", size, true);
        this.hasShower=hasShower;
    }

    public boolean hasShower() {
        return hasShower;
    }

    public void installShower() {
        this.hasShower = true;
    }

    @Override
    public String toString() {
        return "BathRoom{" +
                "hasShower=" + hasShower +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass()!=getClass())
            return false;
        BathRoom other =  (BathRoom) obj;
        return getSize()== other.getSize()&&hasShower== other.hasShower();
    }

    @Override
    public Room copy() {
        return super.copy();
    }
}
