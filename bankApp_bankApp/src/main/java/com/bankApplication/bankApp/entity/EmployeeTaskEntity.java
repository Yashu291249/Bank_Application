package com.bankApplication.bankApp.entity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TAsk_Details")
@Entity
public class EmployeeTaskEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reference_Number")
    private int RefNum;
    
	@JoinColumn(name = "Task_Id")
	@ManyToOne(fetch = FetchType.LAZY)
    private EmployeeEntity emplentity;
    
	@Column(name = "Task_Description")
    private String TaskDescription;
    
     
}
