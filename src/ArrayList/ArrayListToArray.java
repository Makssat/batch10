package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String>cars=new ArrayList<>();
        cars.add("Honda");
        cars.add("Tofas");
        cars.add("Lada");
        Object[]cars1=cars.toArray();
    }
}
