package oit.iloop.kiosk.kiosk_examination;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SubjectData {
	private Calendar date;
	private int examtime;
	private String subjectName;
	private String teacher;
	private String lecday;
	private int lectime;
	private String dept;
	private String room;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public void setDate(String date) {

		SimpleDateFormat sdFormater
		= new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date formatedDate = sdFormater.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(formatedDate);
			
			System.out.println("date : " + formatedDate.toString());
			this.date = calendar;
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			this.date = Calendar.getInstance();
			
			
			
		}
		
		
		
		

	}

	public int getExamtime() {
		return examtime;
	}

	public void setExamtime(int examtime) {
		this.examtime = examtime;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getLecday() {
		return lecday;
	}

	public void setLecday(String lecday) {
		this.lecday = lecday;
	}

	public int getLectime() {
		return lectime;
	}

	public void setLectime(int lectime) {
		this.lectime = lectime;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
