//DoctorVO.java
package com.nt.vo;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

@Data
public class DoctorVO {
	//DataProperties
	private  Integer  did;
	private   String   dname;
	private   String    specialization;
	private   Double  fee;
	private   String  qlfy="MBBS";
}
