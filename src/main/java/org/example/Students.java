package org.example;

import java.util.*;

class Student {
     String Name;
     String Movie1;
     String Movie2;
     String Movie3;
     String Movie4;
     ArrayList Movies= new ArrayList();

void Add(){ //creats and arraylist of movies
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

String display(){//shows what said student likes
    String Sentence = Name+ " likes "+ Movie1+"," + Movie2 +"," + Movie3+", and " + Movie4;
    return Sentence;
}
}

