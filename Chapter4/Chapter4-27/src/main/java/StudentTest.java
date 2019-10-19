/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deads
 */
import java.util.Scanner;

public class StudentTest {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int noOfStudents = 5;
System.out.println("Input the maximum size of the data set:");
noOfStudents = input.nextInt();
int option;
StudentOperation s = new StudentOperation(noOfStudents);
do{
System.out.println("Choose one of the following:");
System.out.println("----------------------------");
System.out.println("1) Insert a new student's information");
System.out.println("2) Fetch and output a student's information");
System.out.println("3) Delete a student's information");
System.out.println("4) Update a student's information");
System.out.println("5) Output all the student information in sorted order");
System.out.println("6) Exit");
option = input.nextInt();
switch(option){
case 1:
s.add();
break;
case 2:
s.search();
break;
case 3:
s.remove();
break;
case 4:
s.update();
break;
case 5:
s.print();
break;
}
}while(option < 6);
System.out.println("Done");
}
}