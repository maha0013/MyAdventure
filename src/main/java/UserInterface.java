import java.util.Scanner;

public class UserInterface {
    private Scanner input = new Scanner(System.in);
    public Adventure adventure = new Adventure();

    public void start() {
        System.out.println("Welcome to the adventure game");
        String userInput = "";
        while (!userInput.equals("exit")) {
            String UserInput = input.nextLine();


            switch (UserInput) {
                case "north", "n", "go north" -> {
                    System.out.println("Going north");
                    adventure.goNorth();
                    System.out.println("You are in " + adventure.getCurrent().getName() + adventure.getCurrent().getDescription());
                }

                case "south", "s", "go south" -> {
                    System.out.println("Going south");
                    adventure.goSouth();
                    System.out.println("You are in " + adventure.getCurrent().getName() + adventure.getCurrent().getDescription());

                }

                case "east", "e", "go east" -> {
                    System.out.println("Going east");
                    adventure.goEast();
                    System.out.println("You are in " + adventure.getCurrent().getName() + adventure.getCurrent().getDescription());

                }

                case "west", "w", "go west" -> {
                    System.out.println("Going west");
                    adventure.goWest();
                    System.out.println("You are in " + adventure.getCurrent().getName() + adventure.getCurrent().getDescription());


                }
                case "look", "l", "look around" -> System.out.println("you are in " + adventure.getCurrent().getName() + adventure.getCurrent().getDescription());

                case "exit" -> System.exit(0);

                case "info" -> System.out.println("""
                        Write north, south, east or west to move in this direction
                        Write look to view your current room 
                        Write exit to exit the game
                        """);
            }
        }
    }
}