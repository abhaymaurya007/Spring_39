//Artist.java
package com.nt.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name="JPA_MTM_ARTIST")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Artist {
  @Id
  @SequenceGenerator(name="gen1",sequenceName = "AID_SEQ",initialValue = 1000,allocationSize = 1)
  @GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
  private Integer aid;
  @NonNull
  @Column(length = 30)
  private String  aname;
  
  @Column(length = 30)
  @NonNull
  private  String  addrs;
  
  @NonNull
  @Column(length = 30)
  private   String category;
  @ManyToMany(targetEntity = Movie.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "artistsInfo")
  private  Set<Movie> moviesInfo=new HashSet<Movie>();
  
  //toString() (alt+shift+s,s)
  @Override
  public String toString() {
  	return "Artist [aid=" + aid + ", aname=" + aname + ", addrs=" + addrs + ", category=" + category + "]";
  }
  
  
}
