package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here




        Boolean check;
        ArrayList<String> test = new ArrayList<>();
        test.add("test 1");
        test.add("test 2");
        test.add("test 3");
        test.set(0,"test 3");
        int k = 0;

        while (k<test.size()){
            System.out.println(test.get(k));
            k++;
        }














    }
}
