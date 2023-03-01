package hw6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class UserRequest {
    Map<CriteriaName, Object> createMap() {
        Scanner scan = new Scanner(System.in);

        Map<CriteriaName, Object> map = new HashMap<>();
        boolean isReadFromKeyboard = true;
        while (isReadFromKeyboard) {
            System.out.println("""
                    Choose filter:
                     1 - Colour
                     2 - Brand
                     3 - RAM
                     4 - Monitor size
                     5 - Price
                     6 - Video card
                     0 - Finish your filter params""");
            final var s = scan.nextLine();
            switch (s) {
                case "0" -> isReadFromKeyboard = false;
                case "1" -> {
                    System.out.println("Enter colour: ");
                    map.put(CriteriaName.COLOR, scan.nextLine());
                }
                case "2" -> {
                    System.out.println("Enter brand: ");
                    map.put(CriteriaName.BRAND, scan.nextLine());
                }

                case "3" -> {
                    System.out.println("Enter RAM: ");
                    map.put(CriteriaName.RAM, scan.nextInt());
                }
                case "4" -> {
                    System.out.println("Enter Monitor size: ");
                    map.put(CriteriaName.MONITOR_SIZE, scan.nextInt());
                }
                case "5" -> {
                    System.out.println("Enter Price: ");
                    map.put(CriteriaName.PRICE, scan.nextInt());
                }
                case "6" -> {
                    System.out.println("Enter Video card: ");
                    map.put(CriteriaName.VIDEO_CARD, scan.nextLine());
                }
            }

        }
        scan.close();
        return map;
    }
}