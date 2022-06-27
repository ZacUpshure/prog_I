package student;

public class Student {
    private String prename = " ";
    private String surname = " ";
    private String street = " ";
    private String houseNumber = " ";
    private String zipCode = " ";
    private String city = " ";
    private String registrationNumber = " ";
    private StudyCourse studyCourse;
    private int age=0;
    private Course[] bookedCourses = new Course[5];

    /*public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city, String registrationNumber, StudyCourse studyCourse) {
        this.prename = prename;
        this.surname = surname;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.city = city;
        this.registrationNumber = registrationNumber;
        this.studyCourse = studyCourse;
    }*/

    //%%%%%%%%%%%%% Constructors %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    //StudyCourse myStudyCourse = StudyCourse.MEDIENINFORMATIK;

    //%%%%%%%%%%%%% Constructor 1 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city, String registrationNumber){
        this(prename, surname, street, houseNumber, zipCode, city, registrationNumber, 20);     //age = 20; innerhalb vom constructor-aufruf.
        //this(..., registrationNumber, age=20); <-- innerhalb kann der default wert gesetzt werden.

    }
    //%%%%%%%%%%%%% Constructor 2 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city, String registrationNumber, int age){
        this(prename, surname, street, houseNumber, zipCode, city, registrationNumber, StudyCourse.MEDIENINFORMATIK, age);
        //this(prename,..., studyCourse.MEDIENINFORMATIK, age); <-- studyCourse.MEDIENINFORMATIK um auf elemente vom enum zuzugreifen.
    }

    //%%%%%%%%%%%%% Constructor 3 main %%%%%%%%%%%%%%%%%%%%%%%%%%%
    public Student(String prename, String surname, String street, String houseNumber, String zipCode, String city, String registrationNumber, StudyCourse studyCourse, int age, Course[] bookedCourses) {
        this.setPrename(prename);
        this.setSurname(surname);
        this.setStreet(street);
        this.setHouseNumber(houseNumber);
        this.setZipCode(zipCode);
        this.setCity(city);
        this.setRegistrationNumber(registrationNumber);
        this.setStudyCourse(studyCourse);
        this.setAge(age);
        //this.setbookedCourses(bookedCourses);



        bookedCourses[0] = null;
        bookedCourses[1] = null;
        bookedCourses[2] = null;
        bookedCourses[3] = null;
        bookedCourses[4] = null;
    }

    //%%%%%%%%%%%%% Constructors %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    //%%%%%%%%%%%%% getter %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public Student(String string, String string2, String string3, String string4, String string5, String string6,
            String string7, StudyCourse medieninformatik, int i) {
    }
    public String getPrename(){
        return prename;
    }

    public String getSurname(){
        return surname;
    }

    public String getStreet(){
        return street;
    }

    public String getHouseNumber(){
        return houseNumber;
    }

    public String getZipCode(){
        return zipCode;
    }

    public String getCity(){
        return city;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public StudyCourse getCourse(){
        return studyCourse;
    }

    public int getAge(){
        return age;
    }

    public Course[] getBookedCourses(){
        return bookedCourses;
    }

    //%%%%%%%%%%%%% setter %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public void setPrename(String prename){
        this.prename = prename;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public void setHouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }

    public void setStudyCourse(StudyCourse studyCourse){
        this.studyCourse = studyCourse;
    }

    public void setAge(int age){
        this.age = age;
    }

    /*public void setBookedCourses(Course[] bookedCourses){
        this.bookedCourses = bookedCourses;
    }*/

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public String toString(){
        return prename+" "+surname+" "+"("+registrationNumber+"), "+studyCourse;
    }

    public void bookCourse(Course course){
        for(int i=0; i<bookedCourses.length; i++){
            if(bookedCourses[i] == null){
                bookedCourses[i] = course;
            }
        }
        for(int i=0;i<bookedCourses.length; i++){
            System.out.println(bookedCourses[i]);
        }
    }

    public int getBookedCoursesCount(){
        int freeSlots=0;
        for(int i=0; i<bookedCourses.length; i++){
            if(bookedCourses[i] == null){
                freeSlots++;
            }
        }
        return freeSlots;
    }


}