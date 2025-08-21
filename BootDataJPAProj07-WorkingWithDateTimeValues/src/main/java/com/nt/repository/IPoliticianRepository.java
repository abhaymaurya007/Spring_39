package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Politician;

public interface IPoliticianRepository extends JpaRepository<Politician, Long> {

	@Query(nativeQuery = true, value="select (sysdate-dob)/365.25  from  JPA_POLITICIAN_DATE_TIME where pid=:id ")//oracle
	//@Query(nativeQuery = true, value="select (TimestampDiff(DAY,dob,curdate()))/365.25 from JPA_POLITICIAN_DATE_TIME  where pid=:id")//mysql
	 public  Double   getPoliticianAgeById(int id);
}
