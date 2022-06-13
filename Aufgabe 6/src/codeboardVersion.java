public class Main {
    public static int width = 60;
    public static int border = 3;       // border must be 3
    public static int padding = 3;
    public static int hight = 9;

    public static String spaceChar = " ";
    //public static String altSpaceChar = " ";
    public static String borderHorizontalChar = "-";
    public static String borderVerticalChar = "|";
    public static String cornerChar = "+";
    public static String lineBreak = "\n";

    public static void main(String[] args) {
        printEnvelope(
                "Max Mustermann", "Mustertr. 42", "14242 Musterstadt",
                "Anna Alt", "Spass-Str. 123", "13353 Berlin"
        );

        printEnvelope(
                "$NAME", "$ADDRESS",                                 //"Max Mustermann", "Mustertr. 42",
                "$NAME", "$ADDRESS"                                  //"Anna Alt", "Spass-Str. 123"
        );

        printEnvelope(
                "$NAME",                                             //"Max Mustermann",
                "$ADRESS"                                            //"Anna Alt"
        );

        printEnvelope();
    }

    public static void printEnvelope() {

        printEnvelope("$NAME", "$ADDRESS", "$ZIP $CITY", "$NAME", "$ADDRESS", "$ZIP $CITY");
    }

    public static void printEnvelope(String fromName, String toName) {
        printEnvelope(fromName, "$ADDRESS", "$ZIP $CITY", toName, "$ADDRESS", "$ZIP $CITY");                    
    }

    public static void printEnvelope(String fromName, String fromAddress, String toName, String toAddress) {
        printEnvelope(fromName, fromAddress, "$ZIP $CITY", toName, toAddress, "$ZIP $CITY");
    }


    public static void printEnvelope(String fromName, String fromAddress, String fromZipCodeAndCity, String toName, String toAddress, String toZipCodeAndCity ) {
    //print headerline
    barFunction();
    //print emptyline
    emptyLine();
    //print senderdata
    senderData(fromName, fromAddress, fromZipCodeAndCity);
    //print emptyline
    emptyLine();
    //print rescieverdata
    rescieverData(toName, toAddress, toZipCodeAndCity);
    //print emptyline
    emptyLine();
    //print bottomline
    barFunction();
    }

    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    //%%%%%%% SUB METHOD DEFINITIONS %%%%%%%%%%%
    //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    
    //Padding
    public static void paddingLoop(){
        for (int k = 0; k < padding; k++){                                        // print blank " " as much as padding
            System.out.print(spaceChar/*+spaceChar*/);
        }
    }

    //Empty for resciever
    public static void emptyTo(String Input){

        int lengthOfInput = Input.length();
        //int reversePadding = padding*2;

        for (int k = 0; k <= width-border-padding-lengthOfInput; k++){            // print blank " " until edge
            System.out.print(spaceChar);
        }
    }

    //Empty for sender
    public static void emptyFrom(String Input){

        int lengthOfInput = Input.length();
        //int reversePadding = padding*2;

        for (int k = 0; k <= width-/*2*/border-padding-lengthOfInput; k++){        // print blank " " until edge
            System.out.print(spaceChar);                                           // border must be 3
        }
    }

    //Empty line
    public static void emptyLine(){
        
        System.out.print(borderVerticalChar);
        for (int k = 0; k <= width-border; k++){                                   // print blank " " for intire line
            System.out.print(spaceChar/*+spaceChar*/);
        }
        System.out.print(borderVerticalChar);
        System.out.print(lineBreak);
    }

    //Bar
    public static void barFunction(){
        System.out.print(cornerChar);                                              // print corner at beginning.

        for(int i=0; i <= width-border; i++){                                      // print as many horizontal lines as 'width - border',
                                                                                   // to keep the same width including the cornerChar's.

            System.out.print(borderHorizontalChar);
        }
        System.out.println(cornerChar);                                            // print corner at bottom.
    }
    
    //to get the longest String
    public static String getLongestString(String[] array) {                        // compares the two str. and returns the largest one 
      int maxLength = 0;                                                           // initialize maxLenght as counter
      String longestString = null;                                                 // initialize a variable for the return value
      for (String s : array) {                                                     // extended for loop for longest string 
          if (s.length() > maxLength) {
              maxLength = s.length();                                              // allocating max lenght to the length of s 
              longestString = s;                                                   // allocating longestString to s 
          }
      }
      return longestString;
  }
    //fill the rest of the empty space to the lenght of the largest str.
    public static void fillToData(String toBeFilled, String fill){
        int lenght1 = toBeFilled.length();                                         // initializing lenght of the smaller str. 
        int lenght2 = fill.length();                                               // initializing lenght of the largest str.   
        int difference = lenght2-lenght1;                                          // initializing difference of both length
        
        for(int i=0; i<=difference-1; i++){                                        // printing as many spaceChar's as the differnece 
            System.out.print(spaceChar);
        }
    }

    public static void senderData(String fromName, String fromAddress, String fromZipCodeAndCity){
                //%%%%%%%%% NAME %%%%%%%%%%%%%%
                System.out.print(borderVerticalChar);     // println is must be only print in loop[1].
                paddingLoop();                            // add padding.
                System.out.print(fromName);               // print information.
                emptyFrom(fromName);                      // create empty space (using String to optimize formatting).
                System.out.print(borderVerticalChar);     // print pipe.
                System.out.print(lineBreak);
                
                //%%%%%%%%% ADDRESS %%%%%%%%%%%%%%
                System.out.print(borderVerticalChar);     //  ... same as top description.
                paddingLoop();
                System.out.print(fromAddress);
                emptyFrom(fromAddress);
                System.out.print(borderVerticalChar);
                System.out.print(lineBreak);
                
                //%%%%%%%%% ZipCode %%%%%%%%%%%%%%
                System.out.print(borderVerticalChar);     //  ... same as top description.
                paddingLoop();
                System.out.print(fromZipCodeAndCity);
                emptyFrom(fromZipCodeAndCity);
                System.out.print(borderVerticalChar);
                System.out.print(lineBreak);
    }

    public static void rescieverData(String toName, String toAddress, String toZipCodeAndCity){
        
        //%%%%%%%%% length of the largest array %%%%%%%%%%%%%%
        String[] InputStrings = {toName, toAddress, toZipCodeAndCity};
        String largestString = getLongestString(InputStrings);
        
                //%%%%%%%%% NAME %%%%%%%%%%%%%%
                System.out.print(borderVerticalChar);      //  ... same as top description.
                emptyTo(largestString);
                System.out.print(toName);
                fillToData(toName, largestString);
                paddingLoop();
                System.out.print(borderVerticalChar);
                System.out.print(lineBreak);
                
                //%%%%%%%%% ADDRESS %%%%%%%%%%%%%%
                System.out.print(borderVerticalChar);       //  ... same as top description.
                emptyTo(largestString);
                System.out.print(toAddress);
                fillToData(toAddress, largestString);
                paddingLoop();
                System.out.print(borderVerticalChar);
                System.out.print(lineBreak);
                
                //%%%%%%%%% ZipCode %%%%%%%%%%%%%%
                System.out.print(borderVerticalChar);       //  ... same as top description.
                emptyTo(largestString);
                System.out.print(toZipCodeAndCity);
                fillToData(toZipCodeAndCity, largestString);
                paddingLoop();
                System.out.print(borderVerticalChar);
                System.out.print(lineBreak);
    }
}
