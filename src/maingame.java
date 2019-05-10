import java.util.Scanner;
import java.util.Random;


public class maingame {

    Scanner input = new Scanner(System.in);

    private int HoursUntilStarvation = 36;
    private int HoursUntilExhaustation = 48;

    private int totalHours = 0;

    private String[] name = {
            "bedroom",
            "cafe",
            "kitchen",
            "living room",
            "warehouse",
            "bathroom",
            "dining room"
    };

    private int[] foodHours = {
            0,
            12,
            6,
            0,
            0,
            0,
            3
    };

    private int[] sleepHours = {
            18,
            2,
            1,
            9,
            -2,
            0,
            1,
    };

    public class Room {
        String roomType;
        int foodThere;
        int sleepPossible;
    }

    private Room[] roomArray = new Room[7];

    for (int i = 0; i < roomArray.length; i++) {
        roomArray[i] = new Room();
        roomArray[i].roomType = name[i];
        roomArray[i].foodThere = foodHours[i];
        roomArray[i].sleepPossible = sleepHours[i];
    }

    private Random rand = new Random();

    public static void main (String[] args) {


    }
}

