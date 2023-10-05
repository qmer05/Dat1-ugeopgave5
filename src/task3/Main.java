package task3;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Room livingroom = new Room(3, 4, 6);
        Room diningroom = new Room(1, 2, 1);
        Room bedroom = new Room(1, 3, 2);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(livingroom);
        rooms.add(diningroom);
        rooms.add(bedroom);

        Building building = new Building(rooms, 2, 2, true);

        int i = countLampsInBuilding(building);
        System.out.println("Number of lamps in building: " + i);

        printResult(isNormal(building));

        }


    public static int countLampsInBuilding(Building building) {

        int countLamps = 0;
        ArrayList<Room> rooms = building.getRooms();
        for (Room r : rooms) {
            countLamps += r.getNumberOfLamps();
        }
        return countLamps;

            /* alternativt:
        int countLamps = 0;
        for (Room r : building.getRooms()) {
            countLamps += r.getNumberOfLamps();
        }
        return countLamps;
             */
    }

    public static boolean isNormal(Building building){
        return building.getNumberOfFloors() > building.getRooms().size();
    }

    public static void printResult(boolean result) {
        if(result) {
            System.out.println("true");
        } else {
            System.out.println("This is an odd building");
        }
    }
}
