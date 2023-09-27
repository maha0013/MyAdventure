public class Adventure {
    GameMap map = new GameMap();


    public void goNorth() {
        if (map.getCurrent().getNorthRoom() != null) {
            map.setCurrent(map.getCurrent().getNorthRoom());        }
        else {
            System.out.println("There is no door in that direction");
        }
    }

    public void goSouth() {
        if (map.getCurrent().getSouthRoom() != null) {
            map.setCurrent(map.getCurrent().getSouthRoom());
        }
        else {
            System.out.println("There is no door in that direction");
        }
    }

    public void goEast() {
        if (map.getCurrent().getEastRoom() != null) {
            map.setCurrent(map.getCurrent().getEastRoom());        }
        else {
            System.out.println("There is no door in that direction");
        }
    }

    public void goWest() {
        if (map.getCurrent().getWestRoom() != null) {
            map.setCurrent(map.getCurrent().getWestRoom());        }
        else {
            System.out.println("There is no door in that direction");
        }
    }
    public Room getCurrent() {
        return map.getCurrent();
    }
}
