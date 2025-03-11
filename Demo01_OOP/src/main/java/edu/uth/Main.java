package edu.uth;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Jane");
        names.add("Bob");
        for(String name:names){
            System.out.println(name);
        }
        //tao ds tranh trung lap...
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("John");
        uniqueNames.add("Jane");
        uniqueNames.add("Jane");//Bi loai bo vi Set
        uniqueNames.add("Bob");
        System.out.println(uniqueNames);
        //Su dung Map- Luu tru key-value
        Map<Integer, String > students = new HashMap<>();
        students.put(1, "John");
        students.put(2, "Jane");
        students.put(4, "Jane-4");
        students.put(3, "Bob");
        System.out.println(students);
    }
    //Java Collection
    //List , Set, Queue, Map
    //Collection Interface
        //List - Danh sach co thu tu (ArrayList, LinkedList, Vector)
        //Set - Tap hop khong trung lap (HashSet, TreeSet, LinkedHashSet)
        //Queue - Hang doi (PriorityQueue, Deque, LinkedList)
    //Map Interface
        //HashMap : Bang bam luu key-value, khong co thu tu
        //TreeMap- Sap xep key theo thu tu, tu nhien
        //LinkedHashMap --Giu thu tu chen
        //Hashtable Giong nhu HashMap nhung dong bo..
}