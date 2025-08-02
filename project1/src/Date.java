public class Date {
    private int year ;
    private int month ;
    private int day ;
    
    //private int year , month , day;

    //Constructor 
    public Date(int year , int month , int day ){
        this.year = year;
        this.month = month;
        this.day = day;

    }


    //Setter
    public void setYear(int yaer){
        this.year = year;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day){
        this.day = day;
    }

    //Getter
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }        
    public int getDay(){
        return this.day;
    }    


    public String toString(){
        return String.format("Date is "+"%02d%02d%4d" , month , day ,year);
    }

    public void setDate(int year , int month , int day ){
        this.year = year;
        this.month = month;
        this.day = day;

    }


}