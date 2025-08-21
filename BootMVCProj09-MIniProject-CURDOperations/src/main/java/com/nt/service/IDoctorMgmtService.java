//IDoctorMgmtService.java
package com.nt.service;

import java.util.List;

import com.nt.vo.DoctorVO;

public interface IDoctorMgmtService {
    public  List<DoctorVO>   findAllDoctors();
    public   String   registerDoctor(DoctorVO vo);
    public    DoctorVO   showDoctorById(int id);
    public   String  editDoctor(DoctorVO vo);
    public   String   removeDoctor(int did)throws Exception;
}
