import java.util.Scanner;

public class UserInterface {
    private Scanner input = new Scanner(System.in);
    public Adventure adventure = new Adventure();

    public void start() {
        adventure.setStart();
        System.out.println("Welcome to My Adventure");
        boolean run = true;

        while (run) {
            String userInput = input.nextLine();

            switch (userInput) {
                case "north", "n", "go north" -> {
                    System.out.println("Going north");
                    adventure.goNorth();
                    System.out.println("You are in " + adventure.getPlayerRoom().getName() + adventure.getPlayerRoom().getDescription());
                    adventure.getPlayerRoom().printitems();
                }

                case "south", "s", "go south" -> {
                    System.out.println("Going south");
                    adventure.goSouth();
                    System.out.println("You are in " + adventure.getPlayerRoom().getName() + adventure.getPlayerRoom().getDescription());
                    adventure.getPlayerRoom().printitems();
                }

                case "east", "e", "go east" -> {
                    System.out.println("Going east");
                    adventure.goEast();
                    System.out.println("You are in " + adventure.getPlayerRoom().getName() + adventure.getPlayerRoom().getDescription());
                    adventure.getPlayerRoom().printitems();
                }

                case "west", "w", "go west" -> {
                    System.out.println("Going west");
                    adventure.goWest();
                    System.out.println("You are in " + adventure.getPlayerRoom().getName() + adventure.getPlayerRoom().getDescription());
                    adventure.getPlayerRoom().printitems();

                }
                case "look", "l", "look around" -> {
                    System.out.println("Looking around");
                    System.out.println("You are in " + adventure.getPlayerRoom().getName() + adventure.getPlayerRoom().getDescription());
                    adventure.getPlayerRoom().printitems();
                }

                case "exit" ->
                    run = false;


                case "help" -> System.out.println("""
                        Write north, south, east or west to move in this direction
                        Write look to view your current room 
                        Write exit to exit the game
                        """);
            }
        }
    }

}