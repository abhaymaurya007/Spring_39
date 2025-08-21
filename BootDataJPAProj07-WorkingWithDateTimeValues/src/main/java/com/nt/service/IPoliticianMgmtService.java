package com.nt.service;

import java.util.List;

import com.nt.entity.Politician;

public interface IPoliticianMgmtService {
    public  String   regsiterPolitician(Politician politician);
    public  List<Politician>  showAllPoliticianDetails();
    public    double   calculatePoliticianAge(int pid);
    
}
