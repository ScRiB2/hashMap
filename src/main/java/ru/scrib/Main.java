package ru.scrib;

public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer,String> map = new MyHashMap<>();
        map.insert(1, "Привет");
        map.insert(2, "Пока");
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.find(1));
        System.out.println(map.find(2));
        System.out.println(map.find(3));
        map.delete(1);
        System.out.println(map.size());
        map.clear();
        System.out.println(map.isEmpty());
    }
}
