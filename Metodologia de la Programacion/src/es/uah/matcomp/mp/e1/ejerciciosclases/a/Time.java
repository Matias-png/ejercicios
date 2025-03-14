package es.uah.matcomp.mp.e1.ejerciciosclases.a;

public class Time {


    private int hour;
    private int minute;
    private int second;


    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public String toString() {
        String textohora = String.valueOf(hour);
        String textominute = String.valueOf(minute);
        String textosecond = String.valueOf(second);
         if(9>=hour){
             textohora = "0" + textohora ;
         }
         if(9>=minute){
             textominute = "0" + textominute;
         }
         if(9>=second){
             textosecond = "0" + textosecond;
         }
         return textohora + ":" + textominute + ":" + textosecond;
    }
    public Time nextSecond(){
        setSecond(second+1);
        if (second == 60){
            minute += 1;
            second = 0;
        }
        if (minute == 60){
            hour += 1;
            minute = 0;
        }
        if (hour == 24){
            hour = 0;
        }

        return this;

    }
    public Time previousSecond(){
        setSecond(second-1);
        if (second == -1){
            minute -= 1;
            second = 59;
        }
        if (minute == -1){
            hour -= 1;
            minute = 59;
        }
        if (hour == -1){
            hour = 23;
        }

        return this;
    }
}
