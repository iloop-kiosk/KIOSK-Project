package oit.iloop.kiosk.test;

import java.util.Calendar;

import oit.iloop.kiosk.kiosk_examination.SubjectData;

public class TestClass {

	
	
	public static void main(String[] args){
		
		SubjectData sData = new SubjectData();
		
		sData.setDate("2012-07-27");
		sData.setExamtime(1);
		sData.setSubjectName("物理学基礎");
		sData.setTeacher("藤井研一");
		sData.setLecday("火曜日");
		sData.setLectime(3);
		sData.setDept("IC");
		sData.setRoom("1301教室");
		
		
		
		System.out.println("Date,year:"
		+sData.getDate().get(Calendar.YEAR)+"\n" +
				"month:"+(sData.getDate().get(Calendar.MONTH)+1)+"\n" 
		+"day:"+sData.getDate().get(Calendar.DATE));
		
		
		
		
		
		
		
		
		
		
	}
}
