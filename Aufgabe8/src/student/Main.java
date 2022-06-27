package student;

//include commands for calling from an external package.
//import student.Course;
//import student.Student;
//import student.StudyCourse;
//import student.*;

public class Main{
    public static void main(String[] args){

        Student s1 = new Student("john", "dow", "dowstreet", "43", "13627", "dowcity", "23232323", StudyCourse.MEDIENINFORMATIK, 20);
        Student s2 = new Student("jessi", "pinkman", "doverstreet", "88", "10167", "austin", "4673833", StudyCourse.MEDIENINFORMATIK, 21);

        System.out.println(s1.getBookedCoursesCount());
        //s1.bookCourse(new Course("test1", "test2"));
        s1.bookCourse(new Course("test1", "test2"));

        System.out.println(s2.getBookedCoursesCount());
        s2.bookCourse(new Course("test3", "test4"));
    }
}

