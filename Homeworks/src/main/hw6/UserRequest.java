package hw6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserRequest {

    public Map<CriteriaName, Object> createMap() {
        Scanner scan = new Scanner(System.in);

        Map<CriteriaName, Object> map = new HashMap<>();
        while (true) {
            System.out.println("Choose filter:\n 1 - Colour\n 2 - Brand\n 3 - RAM\n " +
                    "4 - Monitor size\n 5 - Price 6\n - Video card\n 0 - Finish your filter params");
            final var s = scan.nextLine();
            if (s.equals("0")) {
                break;
            }
            if(s.equals("1")){
                System.out.println("Enter colour: ");
                map.put(CriteriaName.COLOR,scan.nextLine());
            }if(s.equals("2")){
                System.out.println("Enter brand: ");
                map.put(CriteriaName.BRAND,scan.nextLine());
            }if(s.equals("3")){
                System.out.println("Enter RAM: ");
                map.put(CriteriaName.RAM,scan.nextInt());
            }if(s.equals("4")){
                System.out.println("Enter Monitor size: ");
                map.put(CriteriaName.MONITOR_SIZE,scan.nextInt());
            }if(s.equals("5")){
                System.out.println("Enter Price: ");
                map.put(CriteriaName.PRICE,scan.nextLine());
            }if(s.equals("6")){
                System.out.println("Enter Video card: ");
                map.put(CriteriaName.VIDEO_CARD,scan.nextLine());
            }

        }
        scan.close();
        return map;
    }

}
