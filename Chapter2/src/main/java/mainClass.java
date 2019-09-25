import java.util.Collections;
import java.util.Scanner;

class mainClass
        
{
Scanner scan = new Scanner(System.in);

mainClass()

        {

        System.out.println

        ("Enter the maximum dataset size? ");

        DriverClass.setDatasetSize(scan.nextInt());

        System.out.println

        ("Enter the initial size of the data set? ");

        DriverClass.setInitialSize(scan.nextInt());

        int size = DriverClass.getInitialSize();

        while(size > 0)

                {

                System.out.print("Enter Student Name: ");

                scan.nextLine();

                String name = scan.nextLine();

                System.out.print

                ("Enter Student identification: ");

                int id_num = scan.nextInt();

                System.out.print("Enter Grade point: ");

                double grade =

                Double.parseDouble(scan.next());

                StudentListings temp =

                new StudentListings

                (name,id_num,grade);

                DriverClass dv = new DriverClass();

                dv.addData(temp);

                size--;

                }

        }

static void DisplaySortedList()

        {

                Collections.sort(DriverClass.studentList,

                StudentListings .StuNameComparator);

                System.out.println

                ("Names\t\tId_Number\tGradePointAverage");


                for(StudentListings str:

                DriverClass.studentList)

                        {

                        System.out.println(str.getName()

                        +"\t\t"+str.getId_num()+"\t\t"+

                        str.getGrade_point());

                        }

        }

}