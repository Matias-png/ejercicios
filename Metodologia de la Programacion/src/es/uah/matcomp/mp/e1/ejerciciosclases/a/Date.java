package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class Date {

    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {

        String textoday = String.valueOf(day);
        String textomonth = String.valueOf(month);

        if ( 9 >= day){
            textoday = "0" + textoday;
        }
        if ( 9 >= month){
            textomonth = "0" + textomonth;
        }

        return textoday + "/" + textomonth + "/" + year;
    }
}
