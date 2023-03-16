package week4;

public class week4exception {
	private int hour;
	private int minutes;
	private int seconds;
	
	
	void setHour(int hour) {
		if(hour<0 || hour >23) {
			throw new IllegalArgumentException("Wrong Hour");
		}
		this.hour=hour;
	}
	
	void setMinutes(int minutes) {
		if(minutes<0 || minutes>59) {
			throw new IllegalArgumentException("Wrong minutes");
			}
		this.minutes=minutes;
	}
	void setSeconds(int seconds) {
		if(seconds<0 || seconds>59) {
			throw new IllegalArgumentException("Wrong seconds");
		}
		this.seconds=seconds;
	}
	public String trueTime() {
		return String.format("%02d:%02d:%02",hour,minutes,seconds);
	}
	week4exception(int hour,int minutes,int seconds){
		setHour(hour);
		setMinutes(minutes);
		setSeconds(seconds);
	}
}
