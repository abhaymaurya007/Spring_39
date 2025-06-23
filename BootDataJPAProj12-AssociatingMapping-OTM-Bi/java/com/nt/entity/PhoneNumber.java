//PhoneNumber.java (child class)
package com.nt.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="JPA_OTM_PHONENUMBER")
@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {
	@Id
	@SequenceGenerator(name="gen1",sequenceName = "REGNO",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private  Integer regno;
	@NonNull
	private  Long  mobileno;
	
	@NonNull
	@Column(length = 30)
	private  String provider;

	@NonNull
	@Column(length = 30)
	private   String type;
	
	//special property
	@ManyToOne(targetEntity = Customer.class,cascade =CascadeType.ALL,fetch = FetchType.EAGER )
	@JoinColumn(name = "CUST_NO",referencedColumnName = "CNO")
	private  Customer cust;

	
	public  PhoneNumber() {
		System.out.println("PhoneNumber:: 0-param constructor::"+this.getClass());
	}
	
	//toString() (alt+shift+s,s)
	@Override
	public String toString() {
		return "PhoneNumber [regno=" + regno + ", mobileno=" + mobileno + ", provider=" + provider + ", type=" + type
				+ "]";
	}

}
