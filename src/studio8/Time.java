package studio8;


public class Time {
	private int hour;
	private int minute;
	private  boolean is12;
	
public Time(int hour, int minute, boolean is12) {
	this.hour=hour;
	this.minute=minute;
	this.is12=is12;
}
public String toString() {
	if(is12==false) {
		return hour+ ":" + minute;}
	else  {
		if(hour>=12) {
			return (hour-12)+ ":" + minute + " PM";}
		else {
			return hour+ ":" + minute + "AM";}
		}	
	}
	

	public static void main(String[] args) {
		//creating a new object based off of class 
		Time result= new Time(15,23,true);
		System.out.println(result.toString());
		
 
    	
    }

}