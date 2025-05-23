package org.example;

import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.LinkedList;

public class FriendSim {
    static LinkedList<Student> List=new LinkedList<>();
    static double FindSim(){//Find the similarity between friends
        ArrayList<Double> SimCom= new ArrayList();
        Double sim;
        int Friend=0;
        for (int row = 0; row < List.size()-2; row++) {// This runs through the row
            sim=0.0;
            for (int col = 0; col < List.get(row).Movies.size()-1 ; col++) { //this runs through the
                if (List.get(row+1).Movies.contains(List.get(row).Movies.get(col))){//Checks for similarity
                    sim++;
                    System.out.println(List.get(row).Movies.get(col));
                }
            }
            SimCom.add(sim);//adds the current similarity count into an arraylist
        }
        sim=0.0;
        for (int i = 0; i <=SimCom.size()-1 ; i++) {//compares each arraylist to eachother and sees which one is the biggest
            if (SimCom.get(i)>=sim){
                sim=SimCom.get(i);//biggest array gets set
                Friend=i;
                System.out.print(List.get(Friend).Name+" has ");
                System.out.println(sim);
            }
        }
        System.out.print("this "+List.get(Friend).Name+" has a similarity of ");
        return Math.round(sim/(8-sim)*100);
    }
}
