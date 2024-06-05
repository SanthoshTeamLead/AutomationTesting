package com.collections.arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(3);
        hset.add(24);
        hset.add(8);
        hset.add(1);
        hset.add(32);

        ArrayList<Integer> arrList = new ArrayList<>(hset);

        System.out.println("hset: " + hset);

        Collections.sort(arrList);

        System.out.println("ArrayList after sorting: " + hset);
    }
}