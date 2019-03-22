package com.itz.school.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course {
	@Id
	int cId;
	String cName;
	String cCode;
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcCode() {
		return cCode;
	}
	public void setcCode(String cCode) {
		this.cCode = cCode;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cCode=" + cCode + "]";
	}
	
}//EndOfClass
