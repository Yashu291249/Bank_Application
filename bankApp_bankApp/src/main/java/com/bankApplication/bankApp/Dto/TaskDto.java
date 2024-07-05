package com.bankApplication.bankApp.Dto;

import com.bankApplication.bankApp.entity.EmployeeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Data
public class TaskDto {

	public int getRefNum() {
		return RefNum;
	}

	public void setRefNum(int refNum) {
		RefNum = refNum;
	}

	public String getTaskDescription() {
		return TaskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		TaskDescription = taskDescription;
	}

	private int RefNum;
    
    private String TaskDescription;
}
