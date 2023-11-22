public class BathRoom extends RoomWithPlumbing{
    private boolean hasShower;

    public BathRoom(double size,boolean hasShower){
        super("bathroom",size,true);
        this.hasShower=hasShower;
    }

    public boolean hasShower(){
        return hasShower;
    }
    public void installShower(){
        this.hasShower=true;
    }

    @Override
    public String toString() {
        return "BathRoom{" +
                "hasShower=" + hasShower +
                '}';
    }
    // equals + copy
}
