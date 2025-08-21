//ActorDetails.java
package com.nt.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorDetails {
	private Integer aid;
	private  String aname;
	private  Address addrs;
	private boolean single;  
	private  LocalDate dob;
	private  LocalTime tob;
	private  LocalDateTime launchDateTime;
	private  String[]  favColors;
	private   List<String> friends;
	private   Set<Long>  phones;
	private  Map<String,Long>  idDetails;

}
