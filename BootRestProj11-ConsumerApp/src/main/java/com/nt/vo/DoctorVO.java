//DoctorVO.java
package com.nt.vo;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class DoctorVO {
	//DataProperties
	private  Integer  did;
	@NonNull
	private   String   dname;
	@NonNull
	private   String    specialization;
	@NonNull
	private   Double  fee;
	@NonNull
	private   String  qlfy="MBBS";
}
