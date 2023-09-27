public class Adventure {
    GameMap map = new GameMap();
    Player player = new Player();

    public void setStart() {
        player.setCurrentRoom(map.getCurrent());
    }


    public void goNorth() {
        if (player.getCurrentRoom().getNorthRoom() != null) {
            player.setCurrentRoom(player.getCurrentRoom().getNorthRoom());
        }
        else {
            System.out.println("There is no door in that direction");
        }
    }

    public void goSouth() {
        if (player.getCurrentRoom().getSouthRoom() != null) {
            player.setCurrentRoom(player.getCurrentRoom().getSouthRoom());
        }
        else {
            System.out.println("There is no door in that direction");
        }
    }

    public void goEast() {
        if (player.getCurrentRoom().getEastRoom() != null) {
            player.setCurrentRoom(player.getCurrentRoom().getEastRoom());
        }
        else {
            System.out.println("There is no door in that direction");
        }
    }

    public void goWest() {
        if (player.getCurrentRoom().getWestRoom() != null) {
            player.setCurrentRoom(player.getCurrentRoom().getWestRoom());
        }
        else {
            System.out.println("There is no door in that direction");
        }
    }
    public Room getCurrent() {
        return map.getCurrent();
    }

    public Room getPlayerRoom() {
        return player.getCurrentRoom();
    }

}
