public class Room {
    private String type;
    private double size;

    public Room(String type, double size){
        this.type=type;
        this.size=size;
    }

    public double getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
    public String toString(){
        return "Size: " + size + " Type: "+type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass()!= getClass())
            return false;
        Room other = (Room) obj;
        return type.equals(other.type)&&size==other.size;
    }
    public Room copy(){
        return new Room(type,size);
    }
}
