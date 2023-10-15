package com.adithya.assement.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println("list before shuffle");
        for(Integer num : list)
            System.out.println(num);
        Collections.shuffle(list);
        System.out.println("list after shuffle");
        for(Integer num : list)
            System.out.println(num);
    }

}
