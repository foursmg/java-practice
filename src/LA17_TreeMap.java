import java.util.Map;
import java.util.TreeMap;

public class LA17_TreeMap {
    public static void main(String[]args){

        TreeMap<String, Integer> myMap = new TreeMap();

        myMap.put("Rahul",354);
        myMap.put("Zyan",384);
        myMap.put("Anand",432);
        myMap.put("Deepankar",323);

        System.out.println(myMap);  // {Anand=432, Deepankar=323, Rahul=354, Zyan=384}

        for(Map.Entry<String, Integer> e : myMap.entrySet()){
            System.out.println(e.getKey()+ " = "+ e.getValue());
        }


        System.out.println("-----------------------");

        TreeMap tMap = new TreeMap();


        tMap.put(102,"Rahim");
        tMap.put(105,"Katy");
        tMap.put(104,"Zoe");
        tMap.put(103,"Mukesh");
        tMap.put(101,"Karim");


        System.out.println(tMap);  // {101=Karim, 102=Rahim, 103=Mukesh, 104=Zoe, 105=Katy}
                                    // Sorted Automatically Based on Key

        // Navigable Methods

        // .firstKey()
        System.out.println(tMap.firstKey());     //    101

        // .lastKey()
        System.out.println(tMap.lastKey());      //     105

        // .firstEntery()
        System.out.println(tMap.firstEntry());  // 101=Karim

        // .lastEntry()
        System.out.println(tMap.lastEntry());   // 105=Katy

        //  .higherKey()   -   Strictly greater
        System.out.println(tMap.higherEntry(103));  // 104=Zoe

        // .lowerKey()     -    Strictly less
        System.out.println(tMap.lowerEntry(103));     //  102=Rahim

        // .higherKey()
        System.out.println(tMap.higherKey(103));    // 104

        // .lowerKey()
        System.out.println(tMap.lowerKey(103));    //  102

        // .ceilingKey()
        System.out.println(tMap.ceilingKey(103));   // 103

        // .floorKey()
        System.out.println(tMap.floorKey(103));     // 103

        // .pollFirstEntry()   -   Remove first element and returns
        System.out.println(tMap.pollFirstEntry());   // 101=Karim
        // .pollLastEntry()   -   Remove Last element and returns
        System.out.println(tMap.pollLastEntry());    // 105=katy

        System.out.println(tMap);   // {102=Rahim, 103=Mukesh, 104=Zoe}

        tMap.put(101,"Faye");
        tMap.put(105,"Spike");
        System.out.println(tMap);   // {101=Faye, 102=Rahim, 103=Mukesh, 104=Zoe, 105=Spike}


        // Range views
        System.out.println(tMap.headMap(104));  // {101=Faye, 102=Rahim, 103=Mukesh}   - (Keys < 104)
        System.out.println(tMap.headMap(104,true));  // {101=Faye, 102=Rahim, 103=Mukesh, 104=Zoe}  - (inclusive)
        System.out.println(tMap.tailMap(104)); // {104=Zoe, 105=Spike}    - (Keys >= 104)
        System.out.println(tMap.subMap(102,104));    //  {102=Rahim, 103=Mukesh}   -  [102,104)
        System.out.println(tMap.subMap(102,true,104,true));  // {102=Rahim, 103=Mukesh, 104=Zoe}  - Includes both ends

        System.out.println(tMap.descendingMap());  // {105=Spike, 104=Zoe, 103=Mukesh, 102=Rahim, 101=Faye}

        System.out.println(tMap.descendingKeySet());  // [105, 104, 103, 102, 101]

        // TreeMap doesn't allow null keys(throws NullPointerException), It allows multiple null Values.

        //myMap.put(null,23);   Exception

        tMap.put(106,null);
        System.out.println(tMap); // {101=Faye, 102=Rahim, 103=Mukesh, 104=Zoe, 105=Spike, 106=null}
    }
}
