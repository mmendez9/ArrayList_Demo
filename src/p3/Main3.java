package p3;

import java.util.ArrayList;

/*
 * Created by mmendez9 on 2/25/2016.
 */
public class Main3 {
    public static void main(String[] args) {
        ArrayList<Balloon> list = new ArrayList<>();

        Balloon b1 = new Balloon(14, "yellow");
        list.add(b1);
        list.add(new Balloon(10, "red"));
        list.add(new Balloon(12, "blue"));

        System.out.println(list);

        list.forEach(System.out::println);

        // Check if the balloon is in inventory
        String searchColor = "red";
        int searchDiameter = 12;
        boolean found = isFound(searchDiameter, searchColor, list);
        System.out.printf("%d inch %s balloon %s", searchDiameter, searchColor, found ? "was found" : "was not found");
    }

    public static boolean isFound(int d, String c, ArrayList<Balloon> l) {
        for (Balloon each : l) {
            if(each.size == d && each.color.equals(c))
                return true;
        }
        return false;
    }
}

class Balloon {
    int size;
    String color;

    Balloon (int s, String c) {
        size = s;
        color = c;
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}