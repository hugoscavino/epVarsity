package com.ep.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
/*
        ArrayList<String> list = new ArrayList<String>() {{
            add("red");
            add("red");
            add("green");
        }};

        String element = "red";
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).equals(element)) {
                list.remove(element);
                i--;
            }

        System.out.println(list);
*/
        double[] array = {1, 2, 3};
    ArrayList list2 = new ArrayList<>(Arrays.asList (array)) ;
        for (int i = 0; i < list2.size(); i++){
            System.out.println(list2.get(i));
        }
    }
    //double[] x = new double[4][5].
}
