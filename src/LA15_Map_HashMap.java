import java.util.HashMap;
import java.util.Map;
public class LA15_Map_HashMap {
    public static void main(String[]args){

        Map myMap = new HashMap();

        myMap.put(101,"John");
        myMap.put(102,"Johnny");
        myMap.put(103,"Johnathan");
        myMap.put(104,"Johan");

        System.out.println(myMap);   // {101=John, 102=Johnny, 103=Johnathan, 104=Johan}

        System.out.println(myMap.get(101));  // John

        myMap.remove(103);
        System.out.println(myMap);  //  {101=John, 102=Johnny, 104=Johan}

        System.out.println(myMap.get(103));  // null

        System.out.println(myMap.containsKey(101));   //true

        System.out.println(myMap.containsKey(103));   // false

        System.out.println(myMap.containsValue("John"));  //true
        System.out.println(myMap.containsValue("Kelly"));  // false

        System.out.println(myMap.size());   // 3

        System.out.println(myMap.isEmpty());  // false

        // insert/update, returns old value or null
        myMap.put(101,"Chris");  // This will replace the value of preexisting Key 101 with value "chris"

        System.out.println(myMap); // {101=Chris, 102=Johnny, 104=Johan}

        myMap.put(null,null);
        System.out.println(myMap);   // {null=null, 101=Chris, 102=Johnny, 104=Johan}

        myMap.clear();

        System.out.println(myMap);   // {}
    }
}
