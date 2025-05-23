package org.example;

import java.util.*;

class Student {
     String Name;
     String Movie1;
     String Movie2;
     String Movie3;
     String Movie4;
     ArrayList Movies= new ArrayList();
     String Friend;

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

void Friend(){
    Student Self = null;
    int Sim;
ArrayList<Integer> PossFriends= new ArrayList<>();// List of possible friends and their similarities
    int Selfindex = FriendSim.List.indexOf(this);// Placeholder for THIS student class
    Self = FriendSim.List.remove(FriendSim.List.indexOf(this)); //Same placeholder

    for (int i = 0; i <= FriendSim.List.size()-1; i++) {
        Sim=0;
        for (Object Movie: this.Movies){
            if (FriendSim.List.get(i).Movies.contains(Movie)){
                Sim++;
            }
        }
    PossFriends.add(Sim);
    }
 int index = PossFriends.indexOf(Collections.max(PossFriends));// finds the person who has the most similarity with you and makes them your friend+
    Friend = FriendSim.List.get(index).Name;//sets up who is your most likely friend
    FriendSim.List.add(Selfindex,Self);// We are done with the method put THIS student back into the array list as it came


}

String FriendAnounce(){ //shows who is your most likely friend
    Friend();
    return this.Name +" most compatible friend is "+ Friend;
}
String display(){//shows what said student likes
    return Name+ " likes "+ Movie1+"," + Movie2 +"," + Movie3+", and " + Movie4;
}
}

