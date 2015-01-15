package ex1_9;

public class MyTime {

	private int hour;
	private int minute;
	private int second;
	
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//setTime(int hour, int minute, int second): It shall check if the given hour, minute and second are valid before setting the instance variables.
	//(Advanced: Otherwise, it shall throw an IllegalArgumentException with the message "Invalid hour, minute, or second!".)
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
/*	
	public Mytime nextSecond() {
		
	}
	
	public Mytime nextMinute() {
		
	}
	
	public Mytime nextHour() {
		
	}
	
	public Mytime previousSecond() {
		
	}
	
	public Mytime previousMinute() {
		
	}
	
	public Mytime previousHour() {
		
	}
*/	
	
	
}
