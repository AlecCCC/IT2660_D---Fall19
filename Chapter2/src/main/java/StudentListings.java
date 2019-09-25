
import java.util.Comparator;

class StudentListings

{

private String name;

private int id_num;

private double grade_point;

StudentListings()

        {

        this.name = " ";

        this.id_num = 0;

        this.grade_point= 0.0;

        }

public StudentListings(String n,int id,double g)

        {

        this.name = n;

        this.id_num = id;

        this.grade_point = g;

        }


String getName()

        {

        return name;

        }

void setName(String n)

        {

        name = n;

        }

int getID()

        {

        return getId_num();

        }

void setID(int id)

        {

        setId_num(id);

        }

double getGrade()

        {

        return getGrade_point();

        }

void setGrade(double g)

        {

        setGrade_point(g);

        }

public int getId_num()

        {

        return id_num;

        }

public void setId_num(int id_num)

        {

        this.id_num = id_num;

        }

public double getGrade_point()

        {

        return grade_point;

        }

public void setGrade_point(double grade_point)

        {

        this.grade_point = grade_point;

        }

public static Comparator<StudentListings>

StuNameComparator = new Comparator<StudentListings >()

        {

        public int compare(StudentListings s1, StudentListings s2)

                {

                String StudentName1 =

                s1.getName().toUpperCase();

                String StudentName2 =

                s2.getName().toUpperCase();

                return StudentName1.compareTo(StudentName2);

                }

        };

}