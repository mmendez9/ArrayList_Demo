package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("New York");
        cityList.add("Baltimore");
        cityList.add("Rockford");
        cityList.add("Newark");

        cityList.remove("Baltimore");

        System.out.println("First city = " + Collections.min(cityList));

        //Confirm remove
        System.out.println("Newark is in the list " + cityList.contains("Newark"));

        Collections.sort(cityList);

        System.out.println(cityList);

        System.out.println("Size of the array list = " + cityList.size());
    }
}
