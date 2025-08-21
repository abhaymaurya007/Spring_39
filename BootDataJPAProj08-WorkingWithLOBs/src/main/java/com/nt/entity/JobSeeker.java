//JobSeeker.java
package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_JOBSEEKER_LOB")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class JobSeeker {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "JSID_SEQ",initialValue = 100 ,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer jsid;
	
	@Column(length = 30)
	@NonNull
	private String jsname;
	
	@Column(length = 30)
	@NonNull
	private  String jsaddrs;
	
	@NonNull
	private   Boolean  indian;
	@Lob
	@Column(length = 20000) //to get largeBLOB in mysql db
	@NonNull
	private  byte[]  photo;
	
	@Lob
	@Column(length = 20000)  ////to get largeText in mysql db
	@NonNull
	private  char[]  resume;
	

}
