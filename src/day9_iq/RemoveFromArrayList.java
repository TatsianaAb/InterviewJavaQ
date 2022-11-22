package day9_iq;

import java.util.ArrayList;

public class RemoveFromArrayList {

    public static ArrayList<String> removeElement(ArrayList<String> al, String str){
        al.removeIf(p -> p.equals("Ahmed"));
        return al;
    }


    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");

        System.out.println(RemoveFromArrayList.removeElement(names, "Ahmed"));







    }

}
/*
ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */
