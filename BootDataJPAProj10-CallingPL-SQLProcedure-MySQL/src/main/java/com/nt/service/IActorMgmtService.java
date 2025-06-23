package com.nt.service;

import java.util.List;

import com.nt.entity.Actor;

public interface IActorMgmtService {
    public  List<Actor>   showActorsByFeeRange(double start,double end);
}
