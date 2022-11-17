package studio8;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
public Date(int month, int day, int year, boolean holiday) {
	this.month=month;
	this.day=day;
	this.year=year;
	this.holiday=holiday;
	
}
public String toString() {
	if(holiday==false) {
	return month+ "/" + day + "/" + year;}
	else {
		return month+ "/" + day + "/" + year + "";}
	}



    public static void main(String[] args) {

    }

}
