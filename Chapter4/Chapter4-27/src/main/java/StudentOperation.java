/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deads
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentOperation implements Comparator<Student> {
String name;
int noOfStudents;
int maxStudent = 5;
Student student[];
  
public StudentOperation(int noOfStudents){
this.name = name;
this.noOfStudents = noOfStudents;
this.student = new Student[noOfStudents];
}

public void add(){
int id;
String name;
char gender;
  
Scanner input = new Scanner(System.in);
  
int i = 0;
while(true){
System.out.println("Enter an student id or -1 to stop:");
id = input.nextInt();
if(id == -1){
break;
}
System.out.println("Enter student name:");
name = input.next();
System.out.println("Enter student gender:(M/F)");
gender = input.next().charAt(0);
if(i < this.noOfStudents){
this.student[i] = new Student(id, name, gender);
}else{
System.out.println("Sorry, the data set reached it's capacity of students.");
}
i++;
}
}

public void print() {
System.out.println("Students details: ");
Arrays.sort(this.student, new StudentOperation(this.noOfStudents));
if(this.student.length > 0){
System.out.println("id\tname\t\ttgender");
for(int i = 0; i < this.student.length; i++){
if(this.student[i] != null){
System.out.println(this.student[i].toString());
}
}
}else{
System.out.println("No student found");
}
}

public void remove() {
Scanner input = new Scanner(System.in);
System.out.println("Enter the id of the student you want to remove");
int id = input.nextInt();
String name = null;
Student[] arrayData = new Student[this.noOfStudents];
for(int i = 0, k = 0; i < this.student.length; i++){
if(this.student[i] != null){
if(this.student[i].getId() == id){
name = this.student[i].getName();
continue;
}
arrayData[k++] = this.student[i];
}
}
this.student = arrayData;
if(name != null)
System.out.println("Student " + name + " has been removed.");
else
System.out.println("Sorry the student with id "+ id +" does not exist and cannot be removed.");
}

public void update() {
Scanner input = new Scanner(System.in);
System.out.println("Enter the id of the student you want to update");
int id = input.nextInt();
String name = null;
char gender;
Student[] arrayData = new Student[this.noOfStudents];
for(int i = 0, k = 0; i < this.student.length; i++){
if(this.student[i] != null){
if(this.student[i].getId() == id){
System.out.println("Enter the updated name: ");
name = input.next();
this.student[i].setName(name);
System.out.println("Enter the updated gender: ");
gender = input.next().charAt(0);
this.student[i].setGender(gender);
break;
}
}
}
if(name != null)
System.out.println("Student with id "+ id +" has been update.");
else
System.out.println("Sorry the student with id "+ id +" does not exist and cannot be removed.");
}

public void search() {
Scanner input = new Scanner(System.in);
System.out.println("Enter the id of the student you want to search");
int id = input.nextInt();
System.out.println("id\tname\tgender");
for(int i = 0; i < this.student.length; i++){
if(this.student[i] != null && this.student[i].getId() == id){
System.out.println(this.student[i].toString());
}
}
}

@Override
public int compare(Student a, Student b) {
return a.getId() - b.getId();
}
}