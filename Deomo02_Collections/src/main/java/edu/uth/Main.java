package edu.uth;
import  java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Java Collection
        //Framework -> quản lý tập hợp các đối tượng
        // List, Set , Queue, Stack, Map
        //Collection interface
            //List :(ArrayList, LinkedList, Vector)
            //Set: (HashSet, TreeSet, LinkedHashSet)
            //Queue: Hang doi(PriorityQueue, Deque, LinkedList)
        //Map Interface
            //HashMap: bang bam luu Key-Value (khong co STT)
            //TreeMap: Sap xep Key theo thu tu
            //LinkedHashMap: du nguyen thu tu chen
            //Hashtable: giong HashMap (--Thread)
        List<Nhanvien> employees = new ArrayList<>();
        employees.add(
                new Nhanvien("0001","Nguyen Van A",18)
        );
        employees.add(
                new Nhanvien("0002","Nguyen Van b",20)
        );
        employees.add(
                new Nhanvien("0002","Nguyen Van C",20)
        );
//        for(Nhanvien employee : employees) {
//            System.out.println("employee: " + employee.toString());
//        }
        //use Set
        Set<String> codes = new HashSet<>();
        for(Nhanvien employee : employees) {
            codes.add(employee.getCode());
        }
//        System.out.println(codes);

        Map<String,String> mapNhanvien = new HashMap<>();
        for(Nhanvien employee : employees) {
            mapNhanvien.put(employee.getCode(), employee.getFullName());
        }
        //Select code, fullName from Nhanvien
        //Where code  = "002"
        System.out.println(mapNhanvien.get("0002"));

    }
}