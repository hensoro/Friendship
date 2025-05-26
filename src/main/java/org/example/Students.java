package org.example;

import java.util.*;

class Student {
     String Name;
     String Movie1;
     String Movie2;
     String Movie3;
     String Movie4;
     ArrayList Movies= new ArrayList();
     String BestFriend;
     ArrayList<Student> Friends=new ArrayList<>();
     ArrayList<Double> Similarities=new ArrayList<Double>();
    Student Self = null;
void Add(){ //creates and arraylist of movies
    Movies.add(Movie1);
    Movies.add(Movie2);
    Movies.add(Movie3);
    Movies.add(Movie4);



}
Student(String Name,String Movie1,String Movie2,String Movie3,String Movie4){//constructor
 this.Movie1 = Movie1;
 this.Movie2 = Movie2;
 this.Movie3 = Movie3;
 this.Movie4 = Movie4;
 this.Name = Name;
 Add();


}
void FriendList(ArrayList list){
    for (int i = 0; i <= list.size()-1; i++) {
        Friends.add(FriendSim.List.get(i));
    }
}
void Friend(){

    int Sim;
ArrayList<Integer> PossFriends= new ArrayList<>();// List of possible friends and their similarities
    int Selfindex = FriendSim.List.indexOf(this);// Placeholder for THIS student class
    Self = FriendSim.List.remove(FriendSim.List.indexOf(this)); //Same placeholder
    FriendList(FriendSim.List);

    for (int i = 0; i <= Friends.size()-1; i++) {// Does basic movie comparisons
        Sim=0;
        for (Object Movie: this.Movies){
            if (Friends.get(i).Movies.contains(Movie)){
                Sim++;
            }
        }

        PossFriends.add(Sim);
    }
    for (int i = 0; i <= PossFriends.size()-1; i++) {// puts each similarity percent into an array with its friend counterpart
       Double sim= (double)PossFriends.get(i);
        Similarities.add((double) Math.round(sim/(8-sim)*100)); //Jaccard formula
    }
 int index = PossFriends.indexOf(Collections.max(PossFriends));// finds the person who has the most similarity with you and makes them your friend+
    BestFriend = FriendSim.List.get(index).Name;//sets up who is your most likely friend
    FriendSim.List.add(Selfindex,Self);// We are done with the method put THIS student back into the array list as it came


}

String FriendAnnounce(){ //shows who are your most likely friend
    Friend();
    for (int i = 0; i <= Friends.size()-1; i++) {//Loop will list off each friend in the Excel sheet and show you their Similarities
        System.out.println( this.Name + " Has a similarity of " + Similarities.get(i)+"% with "+ Friends.get(i).Name);
    }
    return  this.Name +" most compatible friend is "+ BestFriend;
}
String display(){//shows what said student likes
    return Name+ " likes "+ Movie1+"," + Movie2 +"," + Movie3+", and " + Movie4;
}
}

