public class Player {
    private Room currentRoom; // This is where the player is now

    public Player() {

    }
    public Room getCurrentRoom() {
        return currentRoom; // Where in the cave is your player
    }
    public void setCurrentRoom(Room room) {
        this.currentRoom = room; // Moves the player to a new room
    }
}