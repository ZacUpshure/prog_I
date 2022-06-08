
public class Main {
    public static int width = 60;
    public static int border = 2;       // border must be 2
    public static int padding = 3;
    public static int hight = 9;

    public static String spaceChar = " ";
    public static String altSpaceChar = ".";
    public static String borderHorizontalChar = "-";
    public static String borderVerticalChar = "|";
    public static String cornerChar = "+";
    public static String lineBreak = "\n";

    public static void main(String[] args) {
        printEnvelope(
                "Max Mustermann", "Mustertr. 42", "14242 Musterstadt",
                "Anna Alt", "Spass-Str. 123", "13353 Berlin"
        );
    }

    public static void printEnvelope(String fromName, String fromAddress, String fromZipCodeAndCity, String toName, String toAddress, String toZipCodeAndCity ) {
        // print header line
        barFunction();

        // print content of body
        body("Max Mustermann", "Mustertr. 42", "14242 Musterstadt", "Anna Alt", "Spass-Str. 123", "13353 Berlin");

        // print bottom line
        barFunction();
    }

    public static void body(String fromName, String fromAddress, String fromZipCodeAndCity , String toName, String toAddress, String toZipCodeAndCity) {
        for(int j=0; j < hight; j++){


                if(j==1) {
                    System.out.print(borderVerticalChar);     // println is must be only print in loop[1].
                    paddingLoop();                            // add padding.
                    System.out.print(fromName);               // print information.
                    emptyFrom(fromName);                      // create empty space (using String to optimize formatting).
                    System.out.print(borderVerticalChar);     // print pipe.
                    System.out.print(lineBreak);              // line break.
                }
                else if(j==2){
                    System.out.print(borderVerticalChar);     //  ... same as top description.
                    paddingLoop();
                    System.out.print(fromAddress);
                    emptyFrom(fromAddress);
                    System.out.print(borderVerticalChar);
                    System.out.print(lineBreak);
                }
                else if(j==3){
                    System.out.print(borderVerticalChar);     //  ... same as top description.
                    paddingLoop();
                    System.out.print(fromZipCodeAndCity);
                    emptyFrom(fromZipCodeAndCity);
                    System.out.print(borderVerticalChar);
                    System.out.print(lineBreak);
                }
                else if(j==5){
                    System.out.print(borderVerticalChar);      //  ... same as top description.
                    emptyTo(toName);
                    System.out.print(toName);
                    paddingLoop();
                    System.out.print(borderVerticalChar);
                    System.out.print(lineBreak);
                }
                else if(j==6){
                    System.out.print(borderVerticalChar);       //  ... same as top description.
                    emptyTo(toAddress);
                    System.out.print(toAddress);
                    paddingLoop();
                    System.out.print(borderVerticalChar);
                    System.out.print(lineBreak);
                }
                else if(j==7){
                    System.out.print(borderVerticalChar);       //  ... same as top description.
                    emptyTo(toZipCodeAndCity);
                    System.out.print(toZipCodeAndCity);
                    paddingLoop();
                    System.out.print(borderVerticalChar);
                    System.out.print(lineBreak);
                }
                else{
                    System.out.print(borderVerticalChar);
                    emptyLine();                                // creates intire empty space.
                    System.out.println(borderVerticalChar);     // finish with linebreak.
                }
        }
    }

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    //%%%%%%% SUB METHOD DEFINITIONS %%%%%%%%%%%
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    //method to print horizontal line:
    public static void paddingLoop(){
        for (int k = 0; k < padding; k++){        // print blank " " as much as padding
            System.out.print(altSpaceChar/*+spaceChar*/);
        }
    }

    public static void emptyTo(String Input){

        int lengthOfInput = Input.length();
        //int reversePadding = padding*2;

        for (int k = 0; k <= width-border-padding-lengthOfInput; k++){        // print blank " " as much as
            System.out.print(altSpaceChar/*+spaceChar*/);
        }
    }

    public static void emptyFrom(String Input){

        int lengthOfInput = Input.length();
        //int reversePadding = padding*2;

        for (int k = 0; k <= width-/*2*/border-padding-lengthOfInput; k++){        // print blank " " as much as
            System.out.print(altSpaceChar/*+spaceChar*/);                     // border must be 2
        }
    }

    public static void emptyLine(){

        for (int k = 0; k <= width-2; k++){        // print blank " " as much as
            System.out.print(altSpaceChar/*+spaceChar*/);
        }
    }

    public static void barFunction(){
        System.out.print(cornerChar);               // print corner at beginning.

        for(int i=0; i <= width-2; i++){             // print as many horizontal lines as 'width - 2',
                                                     // to keep the same width including the cornerChar's.

            System.out.print(borderHorizontalChar);
        }
        System.out.println(cornerChar);             // print corner at bottom.
    }
}
