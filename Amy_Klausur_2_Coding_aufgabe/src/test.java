public class test {

    public static String Wohnort = "";                     //attribute
    public static String Versandart = "";
    public static int basisGebuehr = 10;
    public static int Aufschlag = 5;
    public static int expressAufschlag = 20;

        public static void main(String[] args) {           //main
                berechnen();
                //berechnen("Brandenburg", "normal");
            }

            public static int berechnen(){                                          //berechnen 1.
                //System.out.println("gebühren sind "+basisGebuehr+"€");
                berechnen("Berlin");

                return basisGebuehr;
            }

            public static int berechnen(String Wohnort){                            //berechnen 2.
                /*if(Wohnort.equals("Berlin")){
                    System.out.println("gebühren bleiben "+basisGebuehr+"€");
                }
                else if(Wohnort.equals("Brandenburg")){
                    System.out.println("gebühren sind "+basisGebuehr+Aufschlag+"€");
                }*/

                berechnen(Wohnort, "normal");

                return basisGebuehr;
            }

            public static int berechnen(String Wohnort, String Versandart){         //berechnen 3.
                if(Wohnort.equals("Berlin")){
                    if(Versandart.equals("express")){
                        System.out.println("gebühren sind "+basisGebuehr+expressAufschlag+"€");
                        return basisGebuehr+expressAufschlag;
                    }
                    else{
                        System.out.println("gebühren bleiben "+basisGebuehr+"€");
                        return basisGebuehr;
                    }

                }
                else if(Wohnort.equals("Brandenburg")){

                    if(Versandart.equals("express")){
                        System.out.println("gebühren sind "+basisGebuehr+expressAufschlag+"€");
                        return basisGebuehr+expressAufschlag;
                    }
                    else{
                        System.out.println("gebühren sind "+basisGebuehr+Aufschlag+"€");
                        return basisGebuehr+Aufschlag;
                    }
                }
            }
}
