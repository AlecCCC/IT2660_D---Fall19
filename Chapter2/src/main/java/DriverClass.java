
import java.util.ArrayList;

import java.util.Scanner;

public class DriverClass

{

static Scanner sc = new Scanner(System.in);

private static int datasetSize;

private static int initialSize;

public static int getInitialSize()

        {

        return initialSize;

        }

public static void setInitialSize(int initialSize)

        {

        DriverClass.initialSize = initialSize;

        }

public static int getDatasetSize()

        {

        return datasetSize;

        }

public static void setDatasetSize(int datasetSize)

        {

        DriverClass.datasetSize = datasetSize;

        }


static ArrayList<StudentListings > studentList = new ArrayList<StudentListings >();

public static int search

        (ArrayList<StudentListings > std, String name)

{

        for (int i = 0; i < std.size(); i++)

        {


        if (std.get(i).getName().

        compareTo(name) == 0)

        return i;

        }


        return -1;

}

/////////// MAIN METHOD ////////// 
public static void main(String[] args)

{

mainClass m = new mainClass();

Start: while (true)

{

        System.out.println("1 to insert a new student's information");

        System.out.println("2 to fetch and output a student's information");

        System.out.println("3 to delete a student's information");

        System.out.println("4 to update a student's information");

        System.out.println("5 to output all the student information in sorted order");

        System.out.println("6 to exit the program.");

int n = sc.nextInt();
switch(n)

{
//////////////////////////////////////////////////////////////////////
    case 1:

    {

    if (studentList.size() >= datasetSize)

        {

        System.out.println("Can not add the item in the list the size is exceeding");

        continue;

        }

System.out.print("Enter Student Name : ");

sc.nextLine();

String name = sc.nextLine();

System.out.print("Enter Student identification : ");

int id_num = sc.nextInt();

System.out.print("Enter Grade point : ");

double grade =

Double.parseDouble(sc.next());

boolean key = false;

for(StudentListings str:

DriverClass.studentList)

        {

        if(str.getName().equals(name))

                {

                key =true;

                break;

                }

        }

if(key)

        {

        System.out.println("student already present in the data set");

        break;

        }

else

        {

        StudentListings temp =

        new StudentListings

        (name,id_num,grade);

        studentList.add(temp);

        }

break;

}
//////////////////////////////////////////////////////////////////////
    
case 2:

{

System.out.print("Enter Student Name : ");

sc.nextLine();

String name = sc.nextLine();

int index = search(studentList, name);

if (index == -1)

System.out.println("NO SUCH STUDENT IS THERE");

else

{

        System.out.println("----- STUDENT INOFRMATION ----");

        System.out.println("NAME : "+studentList.get(index).getName());

        System.out.println("identification : "+studentList.get(index).getID());

        System.out.println("GRADES : "+studentList.get(index).getGrade());

}

break;

}
//////////////////////////////////////////////////////////////////////
case 3:

{

System.out.print("Enter Student Name : ");

sc.nextLine();

String name = sc.nextLine();

int index = search(studentList,name);

if (index == -1)

System.out.println("NO SUCH STUDENT IS THERE");

else

        {

        studentList.remove(index);

        System.out.println("REMOVED SUCESSFULLY");

        }

break;

}
//////////////////////////////////////////////////////////////////////
case 4:

{

System.out.print("Enter Student Name : ");

sc.nextLine();

String name = sc.nextLine();

int index = search(studentList,name);

if (index == -1)

System.out.println("Student does not exist.");

        else

        {

        System.out.print("Enter Student identification : ");

        int id_num =

        Integer.parseInt(sc.nextLine());

        System.out.print("Enter Grade point: ");

        double grade =

        Double.parseDouble(sc.nextLine());

        studentList.get

        (index).setName(name);

        studentList.get

        (index).setID(id_num);

        studentList.get

        (index).setGrade(grade);

        }

break;

}

//////////////////////////////////////////////////////////////////////
case 5:

        {

        mainClass.DisplaySortedList();

        break;

        }

default:

break Start;

}

}

}

public void addData(StudentListings temp)

{

studentList.add(temp);

}

}