import java.util.Scanner;
import java.util.Random;

public class maingame {

    public static void main(String[] args) {

        int HoursUntilStarvation = 36;
        int HoursUntilExhaustation = 48;
        int totalHours = 0;

        Random rand = new Random();
        int random;

        String[] name = {
                "bedroom",
                "cafe",
                "kitchen",
                "living room",
                "warehouse",
                "bathroom",
                "dining room"
        };

        int[] foodHours = {
                0,
                12,
                6,
                0,
                0,
                0,
                3
        };

        int[] sleepHours = {
                18,
                2,
                1,
                9,
                -2,
                0,
                1,
        };

        String[] textBoxes = {
               "bed",
               "cafe",
               "kitchen",
                "living room",
               "warehouse",
               "bathroom",
               "dining room"
        };

        ikeaRoom[] rooms = new ikeaRoom[7];

        for(int i = 0; i < rooms.length; i++){
            rooms[i] = new ikeaRoom(foodHours[i], sleepHours[i], name[i], textBoxes[i]);
        }

        while(true) {
            random = rand.nextInt(6);

            System.out.println(rooms[random].text);

            System.out.println("Would you like to sleep, eat or leave? Remember you can only perform one action per room, so pick wisely!");
            System.out.println("Please spell correctly, otherwise nothing will happen this turn.");
            System.out.println("Remember, the only way to escape the Ikea is to quit the game");

            Scanner input = new Scanner (System.in);
            String choice = input.nextLine();

            if (choice.equals("eat")){
                System.out.println("You have decided to eat. You search the " + rooms[random].name + "to see what is edible.");
                HoursUntilStarvation += rooms[random].foodThere;
                if (rooms[random].foodThere == 0) {
                    System.out.println("You fail to find any food. You continue through the Ikea, hungry.");
                    totalHours += 2;
                } else {
                    System.out.println("Having eaten, you continue ");
                    totalHours += 3;
                }
            }

            if (choice.equals("sleep")){
                System.out.println("You decide to sleep. You curl up on a " + "and close your eyes.");
                HoursUntilExhaustation += rooms[random].hoursThere;
                totalHours += rooms[random].hoursThere;
                System.out.println("You awake feeling " + "and continue through the Ikea.");

            }

            if (choice.equals("leave")) {
                System.out.println("You leave the room, continuing your journey through the endless Ikea. ");
                totalHours += 1;
            }

            System.out.println("Here are your stats at the end of this run cycle");
            System.out.println("Hours until you collapse of exhaustion: " + HoursUntilExhaustation);
            System.out.println("Hours until you starve to death: " + HoursUntilStarvation);
            System.out.println("Hours you have been in the Ikea: " + totalHours);

        }



    }

}



