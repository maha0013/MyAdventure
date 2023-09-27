public class Room {
    private String name;
    private String description;
    private Room northRoom;
    private Room southRoom;
    private Room eastRoom;
    private Room westRoom;


    public Room(String name, String description){
        this.name = name;
        this.description = description;
        this.eastRoom = null;
        this.northRoom = null;
        this.westRoom = null;
        this.southRoom = null;
    }
    public String getName (){
        return name;
    }

    public String getDescription() {
        return description;

    }
    public Room getNorthRoom() {
        return northRoom;

    }
    public void setNorthRoom(Room northRoom) {
        this.northRoom = northRoom;

    }

    public Room getSouthRoom() {
        return southRoom;

    }

    public void setSouthRoom(Room southRoom) {
        this.southRoom = southRoom;

    }

    public Room getEastRoom() {
        return eastRoom;
    }

    public void setEastRoom(Room eastRoom) {
        this.eastRoom = eastRoom;
    }

    public Room getWestRoom() {
        return westRoom;
    }

    public void setWestRoom(Room westRoom) {
        this.westRoom = westRoom;

    }

}

