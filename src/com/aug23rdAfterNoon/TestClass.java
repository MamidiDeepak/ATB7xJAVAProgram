package com.aug23rdAfterNoon;

import java.util.*;

public class TestClass {
    public static void main(String[] args) {

        List l = new ArrayList<Integer>();
        l.add(89);
        l.add(43);
//        l.add("Deepak");
        System.out.println(l);
        Collections.sort(l,Comparator.reverseOrder());
        System.out.println(l);
        System.out.println("_______________");

        List<String> ls = new ArrayList<>();
        ls.add("Deepak");
        ls.add("Mamidi");
        ls.add("kane");

        System.out.println("_______-for each loop");
        for(String o : ls){
            System.out.println(o);
        }
        System.out.println("_____________ for loop");
        for (int i =0; i<ls.size(); i++){
            System.out.println(ls.get(i));
        }

        System.out.println("____Iterator");
       Iterator<String> er = ls.iterator();
       while (er.hasNext()){
           System.out.println(er.next());
       }



    }
}
