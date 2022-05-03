package com.lc101.jasmine.exercises;

import java.util.ArrayList;

public class ArrayListChallenge {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //Input - 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15
        //Output - 8, 1, 15, 10, 6, 3, 13, 12, 4, 5, 11, 14, 2, 7, 9
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        System.out.println(list1);

            for(int i = 0; i < list1.size()-1; i++) {
                int addNearestNo = list1.get(i) + list1.get(i+1);
                Double squareNo = Math.sqrt(addNearestNo);
                System.out.println();
                if((squareNo - Math.floor(squareNo)) == 0) {
                    list2.add(list1.get(i));
                    list2.add(list1.get(i+1));
                } else {
                    System.out.println("Not a square no");
                }
            }
        System.out.println("Square no's are: " + list2);
    }
}
