package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.DoctorEntity;


public interface IDoctorRepository extends JpaRepository<DoctorEntity, Integer> {
	
	@Query("from DoctorEntity  where fee>=:start and fee<=:end")
	public  List<DoctorEntity>  showDoctorsByFeeRange(double start,double end);
	
	@Query("delete from  DoctorEntity  where  fee>=:start and fee<=:end")
	@Modifying
	@Transactional
	public   int    deleteDoctorsByFeeRange(double start,double end);
}
