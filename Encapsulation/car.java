public class car {

    private String manufracturer="";
    private String model="";
    private int year=0;

    public car(String manufracturer, String model, int year){

        this.manufracturer = manufracturer;
        this.model = model;     //getter interface
        this.setYear(year);     //setter interface
    }

    public String getManufracturer(){   //getter method
        return manufracturer;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){       //setter method
        this.year = year;
    }
}
