import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  List myList = new List(); not allowed because List is abstract and cannot be
        // instanciated

        List randomValues = new ArrayList<>();
        /** randomValues.ensureCapacity();
         is in ArrayList so you cannot access it when you instanciated
         an object of type List
         */

        randomValues.add("Hello");
        randomValues.add(4);
        randomValues.add(5.6f);
        // Instanciatting an ArrayList of Strings
        List<String> carBrands = new ArrayList<>();
        carBrands.add("A brand");
        carBrands.add("A cool brand");

        ArrayList<String> namesList = new ArrayList<>();
        // namesList.add(3); not allowed because 3 is not a String
        namesList.ensureCapacity(4);
        namesList.add("Joy");
        namesList.add("John");
        namesList.add("Eric");
        namesList.add("Nicolas");

        for (String name : namesList) {
            System.out.println(name);
        }
    }
}