package dictionaryexample;

import java.util.HashMap;
import java.util.Map;

public class DictionaryExample {

    public static void main(String[] args) {
        //Create the Dictionary
        Map<String, String> dictionary = new HashMap<String, String>();

        //Adding elements to the dictionary
        dictionary.put("L-CSA-1A", "A-Level Computing");
        dictionary.put("L-CSA-2B", "A-Level Computing");
        dictionary.put("L-CSA-3C", "A-Level Computing");
        dictionary.put("L-CSA-6F", "A-Level Computing");
        dictionary.put("U-CSA-3C", "A-Level Computing");
        dictionary.put("U-CSA-5E", "A-Level Computing");
        dictionary.put("U-CSA-6F", "A-Level Computing");
        dictionary.put("P-ITW-1A", "Level 2 IT");
        dictionary.put("P-ITW-3A", "Level 2 IT");
        
        //Getting a value from the dictionary and printing it out
        String value = dictionary.get("U-CSA-5E");
        System.out.println(value);
    }

}
