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
            System.out.println("Would you like to sleep, eat or leave? Remember you can only perform one action, so pick wisely!");

            Scanner input = new Scanner (System.in);
            String choice = input.nextLine();

            if (choice.equals("eat")){
                //munchies
                return;
            }

            if (choice.equals("sleeep")){
                //slep
                return;
            }

            if (choice.equals("leave")) {
                return;
            }

        }



    }
}


