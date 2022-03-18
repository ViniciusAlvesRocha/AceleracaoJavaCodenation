package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(isFibonnaci(3));
    }

    static List Fibonnaci() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        for (Integer i=2; i<350; i++){
            list.add(list.get(i-1) + list.get(i-2));
        }

        return list;
    }

    static boolean isFibonnaci(Integer number) {
        List<Integer> list = Fibonnaci();
        try {
            list.get(number - 1);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
