//DoctorEntity.java
package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
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

@Table(name="MP_JPA_DOCTOR")
@Entity
@Data
@SQLDelete(sql = "UPDATE MP_JPA_DOCTOR SET ACTIVE_SW='inactive' WHERE DID=? AND UPDATE_COUNT=?")
@SQLRestriction("ACTIVE_SW <> 'inactive' ")
public class DoctorEntity {
	//DataProperties
	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "DID_SEQ",initialValue = 10,allocationSize = 1)
    @GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private  Integer  did;
	@Column(length = 30)
	private   String   dname;
	@Column(length = 30)
	private   String    specialization;
	private   Double  fee;
	@Column(length = 30)
	private   String  qlfy;
	
	//meta properties
	@Version
	private   Integer updateCount;
	@CreationTimestamp
	@Column(updatable = false,insertable = true)
	private LocalDateTime createdOn;
	@UpdateTimestamp
	@Column(updatable = true,insertable = false)
	private LocalDateTime lastAccessedOn;
	@Column(length = 30)
	private   String active_SW="active";
	@Column(length = 30,updatable = false)
	private  String createBy;
	@Column(length = 30,insertable = false)
	private  String updatedBy;

}
