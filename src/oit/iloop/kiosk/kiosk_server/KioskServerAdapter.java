package oit.iloop.kiosk.kiosk_server;

import java.util.ArrayList;
import java.util.List;

import oit.iloop.kiosk.kiosk_examination.SubjectData;

public class KioskServerAdapter {

	
	public List<SubjectData> getSubjectData(){
		List<SubjectData> returnData = new ArrayList<SubjectData>();
		
		SubjectData sData = new SubjectData();
		
		sData.setDate("2012-07-27");
		sData.setExamtime(1);
		sData.setSubjectName("物理学基礎");
		sData.setTeacher("藤井研一");
		sData.setLecday("火曜日");
		sData.setLectime(3);
		sData.setDept("IC");
		sData.setRoom("1301教室");
		
		returnData.add(sData);
		
		sData.setDate("2012-07-27");
		sData.setExamtime(1);
		sData.setSubjectName("物理学基礎");
		sData.setTeacher("藤井研一");
		sData.setLecday("火曜日");
		sData.setLectime(3);
		sData.setDept("IC");
		sData.setRoom("1301教室");
		
		returnData.add(sData);
		
		sData.setDate("2012-07-27");
		sData.setExamtime(1);
		sData.setSubjectName("物理学基礎");
		sData.setTeacher("藤井研一");
		sData.setLecday("火曜日");
		sData.setLectime(3);
		sData.setDept("IC");
		sData.setRoom("1301教室");
		
		returnData.add(sData);
		
		
		
		return returnData;
	}
	
	
	
	
	
	
	
}
