package com.nt.service;

import java.util.List;

import com.nt.vo.DoctorVO;

public interface IDoctorMgmtService {
    public  String  registerDoctor(DoctorVO  vo);
    public   List<DoctorVO>  showAllDoctors();
    public  List<DoctorVO>   fetchDoctorsByFeeRange(double start,double end);
    public    DoctorVO   fetchDoctorById(int id);
    public   String     updateDoctorFeeById(int id , double percent);
    public   String   updateDoctor(DoctorVO doctor);
    public    String  removeDoctorsByFeeRange(double  start,double end);
}
