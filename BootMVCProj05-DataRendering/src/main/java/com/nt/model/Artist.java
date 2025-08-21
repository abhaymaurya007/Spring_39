package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist {
	private Integer aid;
	private  String  aname;
	private  String  addrs;
	private   Double fee;
	

}
