public class GameMap {
    private Room current;
        public GameMap(){
            Room room1 = new Room("Room 1.", " Damp walls glisten, echoing with distant water drips.");
            Room room2 = new Room("Room 2.", " Shadows dance, illuminated by a lone candle's glow.");
            Room room3 = new Room("Room 3.", " Sharp stalactites loom, hinting at hidden depths below.");
            Room room4 = new Room("Room 4.", " A cool breeze whispers secrets from a narrow crevice.");
            Room room5 = new Room("Room 5.", " Luminous fungi paint a soft, ethereal glow.");
            Room room6 = new Room("Room 6.", " Echoes of ancient chants resonate in the silent void.");
            Room room7 = new Room("Room 7.", " Ripples disturb a still underground pool's surface.");
            Room room8 = new Room("Room 8.", " Crystals refract light, creating a kaleidoscope of colors.");
            Room room9 = new Room("Room 9.", " The chamber narrows, leading to an uncharted abyss.");

            current = room1;

            room1.setEastRoom(room2);
            room1.setSouthRoom(room4);
            //
            room2.setEastRoom(room3);
            room2.setWestRoom(room1);
            //
            room3.setSouthRoom(room6);
            room3.setWestRoom(room2);
            //
            room4.setNorthRoom(room1);
            room4.setSouthRoom(room7);
            //
            room5.setSouthRoom(room8);
            //
            room6.setNorthRoom(room3);
            room6.setSouthRoom(room9);
            //
            room7.setNorthRoom(room4);
            room7.setEastRoom(room8);
            //
            room8.setNorthRoom(room5);
            room8.setEastRoom(room9);
            room8.setWestRoom(room7);
            //
            room9.setNorthRoom(room6);
            room9.setWestRoom(room8);
        }

            public Room getCurrent() {
                return current;
            }



}
