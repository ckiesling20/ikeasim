import java.util.Scanner;
import java.util.Random;

public class maingame {

    Scanner input = new Scanner(System.in);

    public int HoursUntilStarvation = 36;
    public int HoursUntilExhaustation = 48;

    public int totalHours = 0;

    private Random rand = new Random();
    


    public static void main(String[] args) {

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



    }
}


