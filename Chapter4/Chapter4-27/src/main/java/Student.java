/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deads
 */
public class Student {
private int id;
private String name;
private char gender;

public Student(int myid, String myName, char myGender){
this.id = myid;
this.name = myName;
this.gender = myGender;
}

public void setId(int myId){
this.id = myId;
}

public void setName(String myName){
this.name = myName;
}

public void setGender(char myGender){
this.gender = myGender;
}

public int getId(){
return this.id;
}

public String getName(){
return this.name;
}

public char getGender(){
return this.gender;
}

@Override
public String toString() {
return this.id + "\t" + this.name + "\t\t" + this.gender;
}
}