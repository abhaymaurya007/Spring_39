package com.nt.entity;

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

@Entity
@Table(name="JPA_BANK_ACCOUNT_VER_TS")
@Data
public class BankAccount {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "ACCNO_SEQ",initialValue = 100000000 , allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long accno;
	@Column(length = 30)
	private  String holderName;
	private  Double  balance;
	@Column(length=30)
	private  String  type;
	
	//MetaData properties
	@Version
	private   Integer   updateCount;
	@CreationTimestamp
	@Column(updatable = false)
	private   LocalDateTime  openedOn;
	@UpdateTimestamp
	@Column(insertable = false)
	private  LocalDateTime   lastOperatedOn;
	
	

}
