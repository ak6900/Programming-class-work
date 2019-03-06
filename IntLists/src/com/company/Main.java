package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //Declare a list of Integers called integerList
        ArrayList<Integer> integerList = new ArrayList<>();
        //Declare a list of Integers called listOfInts
        ArrayList<Integer> listOfInts = new ArrayList<>();
        //Declare a list of Integers called testScores
        ArrayList<Integer> testScores = new ArrayList<>();


        //Declare a list of Doubles called dblList
        ArrayList<Double> dblList = new ArrayList<>();
        //Declare a list of Doubles called listOfDoubles
        ArrayList<Double> listOfDoubles = new ArrayList<>();
        //Declare a list of Doubles called playerPoints
        ArrayList<Double> playerPoints = new ArrayList<>();


        //Declare a list of Strings called stringList
        ArrayList<String> stringList = new ArrayList<>();
        //Declare a list of Strings called listOfStrings
        ArrayList<String> listOfStrings = new ArrayList<>();
        //Declare a list of Strings called studentName
        ArrayList<String> studentName = new ArrayList<>();


        //declare a List of integers called intList
        ArrayList<Integer> intList = new ArrayList<>();
        //declare a List of doubles  called dblList
        ArrayList<Double> dblList2 = new ArrayList<>();
        //declare a List of strings  called strList
        ArrayList<String> strList = new ArrayList<>();


//////////////////////Changes to intList///////////////////////////

        //add 12 to intList
        intList.add(12);
        //add 5  to intList
        intList.add(5);
        //add 7  to intList
        intList.add(7);
        //add 3  to intList
        intList.add(3);



        //read the first element (element 0)of intList into a new variable called intElement
        int intElement = intList.get(0);
        //print out intElement
        System.out.println(intElement);
        //read the second element (element 1)of intList into intElement
        intElement = intList.get(1);
        //print out intElement
        System.out.println(intElement);
        //read the third element (element 2)of intList into intElement
        intElement = intList.get(2);
        //print out intElement
        System.out.println(intElement);
        //read the fourth element (element 3)of intList into intElement
        intElement = intList.get(3);
        //print out intElement
        System.out.println(intElement);

        //modify element 0 of intList to be 13
        intList.set(0,13);
        //modify element 3 of intList to be 8
        intList.set(3,8);
        //read the first element (element 0)of intList into intElement
        intElement = intList.get(0);
        //print out intElement
        System.out.println(intElement);
        //read the second element (element 1)of intList into intElement
        intElement = intList.get(1);
        //print out intElement
        System.out.println(intElement);
        //read the third element (element 2)of intList into intElement
        intElement = intList.get(2);
        //print out intElement
        System.out.println(intElement);
        //read the fourth element (element 3)of intList into intElement
        intElement = intList.get(3);
        //print out intElement
        System.out.println(intElement);

///////////////////////////Changes to dblList/////////////////////////////

        //add 12.1 to dblList
        dblList.add(12.1);
        //add 5.2  to dblList
        dblList.add(5.2);
        //add 7.3  to dblList
        dblList.add(7.3);
        //read the first element (element 0)of dblList into a new variable called dblElement
        double dblElement = dblList.get(0);
        //print out dblElement
        System.out.println(dblElement);
        //read the second element (element 1)of dblList into dblElement
        dblElement = dblList.get(1);
        //print out dblElement
        System.out.println(dblElement);
        //read the third element (element 2)of dblList into dblElement
        dblElement = dblList.get(2);
        //print out dblElement
        System.out.println(dblElement);



        //modify element 1 of dblList to be 13.1
        dblList.set(1,13.1);
        //modify element 2 of dblList to be 8.2
        dblList.set(2,8.2);
        //read the first element (element 0)of dblList into dblElement
        dblElement = dblList.get(0);
        //print out dblElement
        System.out.println(dblElement);
        //read the second element (element 1)of dblList into dblElement
        dblElement = dblList.get(1);
        //print out dblElement
        System.out.println(dblElement);
        //read the third element (element 2)of dblList into dblElement
        dblElement = dblList.get(2);
        //print out dblElement
        System.out.println(dblElement);
////////////////////////////Changes to strList/////////////////////////////

        //add "Hi" to strList
        strList.add("Hi");
        //add "How"  to strList
        strList.add("How");
        //add "Are"  to strList
        strList.add("Are");
        //add "You?"  to strList
        strList.add("You?");


        //read the first element (element 0)of strList into a new variable called strElement
        String strElement = strList.get(0);
        //print out strElement
        System.out.println(strElement);
        //read the second element (element 1)of strList into strElement
        strElement = strList.get(1);
        //print out strElement
        System.out.println(strElement);
        //read the third element (element 2)of strList into strElement
        strElement = strList.get(2);
        //print out strElement
        System.out.println(strElement);
        //read the fourth element (element 3)of strList into strElement
        strElement = strList.get(3);
        //print out strElement
        System.out.println(strElement);

        //modify element 1 of strList to be "good"
        strList.set(1,"good");
        //modify element 2 of strList to be "thanks"
        strList.set(2, "thanks");

        //read the first element (element 0)of strList into strElement
        strElement = strList.get(0);
        //print out strElement
        System.out.println(strElement);
        //read the second element (element 1)of strList into strElement
        strElement = strList.get(1);
        //print out strElement
        System.out.println(strElement);
        //read the third element (element 2)of strList into strElement
        strElement = strList.get(2);
        //print out strElement
        System.out.println(strElement);
        //read the fourth element (element 3)of strList into strElement
        strElement = strList.get(3);
        //print out strElement
        System.out.println(strElement);
    }
}