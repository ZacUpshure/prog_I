public class Main {

    public static void main(String[] args) {
        
        Envelope envelope = new Envelope(); //call constructor.

        //array of objects / array of refernce types.
        Student s1 = new Student("John", "Doe", "Doestreet", "42", "12212", "Fancytown", "2323232", "Medieninformatik");    
        Student s2 = new Student("Bessie", "Clemente", "Wilson Avenue", "40", "75081", "Texas", "63453", "Medieninformatik");

        envelope.printEnvelope(new Student[] { s1 });   //reference to s1 of Student class.

        System.out.println("--------------------------------------");

        envelope.printEnvelope(new Student[] { s1, s2 });   //reference to both s1, s2 of Student class.
    }
}
