import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Creation of Element by using List Interface of Collection.............................................................................
        // By Using Vector Class
        Vector<String> v1 = new Vector<>();

        // By using ArrayList Class
        ArrayList<String> a1 = new ArrayList<>();

        // By using Linkedlist Class
        LinkedList<String> l1 = new LinkedList<>();

        // By using Stack Class
        Stack<Integer> s1 = new Stack<>();

        // Addition of elements into the list
        v1.add("nihar");
        v1.add("venkata");// By using Vector
        v1.add("Madhu");

        a1.addAll(v1);// By using Array

        l1.add("Link1");
        l1.add("Link2");// By using Linkedlist
        l1.add("Link3");

        s1.add(23);
        s1.add(45);// By using Stack
        s1.add(56);

        // Retrieval the element form the list
        System.out.println(v1.get(1)); // Vector

        System.out.println(a1.get(0)); // Array

        System.out.println(l1.get(1)); // Linkedlist

        System.out.println(s1.search(56)); // Stack

        // Deletion of element in the list
        // v1.remove(2); // vector

        // a1.removeAll(a1); // arraylist

        // l1.clear(); // linkedlist

        // s1.pop(); // stack

        // Creation of elements by using Map................................................................................................
        // Creation of a map Hashtable, Hashmap, LinkedinHashmap all are having the same
        // operations
        Map<Integer, String> m1 = new Hashtable<>();

        m1.put(50003, "kondapur");
        m1.put(50000, "hyd");
        m1.put(53002, "rjy");

        // Retrieval of keys from the map
        Set<Integer> keys = m1.keySet();
        for (Integer key : keys) {
            System.out.println(key); // or we retrieval by using the values also (m1.values())
        }

        // Deletion of element from the map
        // m1.remove(50003);
        // System.out.println(m1);

        // Creation of element by using set..................................................................................................
        // Hashset -> HashMap -> Array of nodes(key, values)
        Set<Integer> set1 = new HashSet<>();

        // LinkedHashset -> LinkedHashMap -> Link of nodes(key, values)
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        // treeset is used for the ascending order to print the element
        TreeSet<Integer> set3 = new TreeSet<>();

        set1.add(10);// duplicate value are not a added into the set
        set1.add(20);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        set2.add(10);// duplicate value are not a added into the set
        set2.add(20);
        set2.add(30);
        set2.add(40);
        set2.add(40);

        set3.add(80);// duplicate value are not a added into the set
        set3.add(60);
        set3.add(50);
        set3.add(70);

        // In set we can print the between element of the two elements
        System.out.println(set3.subSet(50, 70));
        System.out.println(set3.descendingSet());

        // Deletion of element from the map
        // set3.remove(80);
        // System.out.println(set3);

        for (Integer e : set1) {
            System.out.println(e);
        }

        System.out.println(set2.isEmpty()); // false
    }
}