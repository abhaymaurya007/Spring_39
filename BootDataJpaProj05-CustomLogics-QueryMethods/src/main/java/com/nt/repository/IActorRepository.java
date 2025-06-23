package com.nt.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Actor;

import jakarta.transaction.Transactional;

public interface IActorRepository extends          JpaRepository<Actor, Integer>{
     
  // @Query("from Actor  where fee>=?1 and fee<=?2")
	//@Query("from Actor  where fee>=:min and fee<=:max")
	//public   List<Actor>  showActorsByFeeRange(@Param("min") double start, @Param("max") double end);
     
	//@Query("from Actor  where fee>=:min and fee<=:max")
	//@Query("from Actor  where fee>=? and fee<=?")
	 //@Query("from ?1  where fee>=?2 and  fee<=?3")  //invalid
	@Query("from  Actor  where fee>=?1 and  fee<=:max")  //invalid
	public   List<Actor>  showActorsByFeeRange(double min,  double max);
	
	
	// bulk select  entity query
	@Query("from  Actor  where category in(:cat1,:cat2,:cat3)") 
	public List<Actor> showActorsByCategories(String cat1,String cat2,String cat3 );
	
	//bulk  select  scalry query (selecting specific multiple col values)
	@Query("select  aid,aname,addrs from  Actor where addrs=:city") 
	public  List<Object[]>  showActorsDataByAddrs(String city);
	
	//bulk  select  scalry query (selecting specific single col values)
	@Query("select  aname from  Actor where fee between :start and :end order by aname asc") 
	public   List<String>  showActorNamesByFeeRange(double start,double end);
	
	
	// single row  select Entity Query
	@Query("from  Actor  where  contactNo=:mobile")
	public    Optional<Actor>   showActorByMobileNo(Long  mobile);

	//single row  select  scalar query  giving  multiple specific col valus
	@Query("select  aid,aname,contactNo from  Actor where  contactNo=:mobile")
	public    Object    showActorDataByMobileNo(Long  mobile);
	
	//single row  select  scalar query  giving  multiple specific col valus
	@Query("select  aname from  Actor where  contactNo=:mobile")
	public    String   showActorNameByMobileNo(long mobile);
	
	
	//aggregate operations
	@Query("select count(distinct aname)  from Actor")
	public  long    countUniqueActors();
	
	@Query("select count(*), max(fee), min(fee) ,avg(fee), sum(fee)  from Actor")
	public   Object   showActorsAggregateData();
	
	@Query("update  Actor   set fee=fee+(fee* :hikePercent/100.0) where category=:cat")
	@Modifying
	@Transactional
	public  int  hikeActorFeeByCategory(String cat,double hikePercent);
	
	@Query("delete  from Actor  where addrs=:city")
	@Modifying
	@Transactional
	public   int  removeActorsByAddrs(String city);
	
     
	//========= Native SQL Queries ================
	@Query(value="select  sysdate from dual",nativeQuery = true)
	public   LocalDateTime   showSystemDateTime();
     
     
}
