package oit.iloop.kiosk.kiosk_bus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BusData {
	private String to;
	private String from;
	private String type;
	private Calendar time;
	private int weekcode;
	
	public String getTo(){
		return to;
	}
	
	public void setTo(String to){
		this.to = to;
	}
	
	public String getFrom(){
		return from;
	}
	
	public void setFrom(String from){
		this.from = from;
	}

	public String getType(){
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Calendar getTime() {
		return time;
	}
	
	public void setTime(Calendar time) {
		this.time = time;
	}
	
	public void setTime(String time){
		SimpleDateFormat sdFormat = new SimpleDateFormat("HH:mm:ss");
	
		try{
			Date formatDate = sdFormat.parse(time);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(formatDate);
			
			System.out.println("time : "+formatDate.toString());
			this.time = calendar;
			
		}catch (ParseException e){
			e.printStackTrace();
			
			this.time = Calendar.getInstance();
		}
		
	}
	
	public int getWeekcode() {
		return weekcode;
	}

	public void setWeekcode(int weekcode) {
		this.weekcode = weekcode;
	}

}



