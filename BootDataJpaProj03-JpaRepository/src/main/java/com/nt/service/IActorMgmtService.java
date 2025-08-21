package com.nt.service;

import java.util.List;

import com.nt.entity.Actor;

public interface IActorMgmtService {
	public  String   removeActorsByIds(Iterable<Integer> ids);
	public  String  removeAllActorsInBatch();
	public  List<Actor>  showActorsByData(Actor actor,boolean ascOrder ,String ...props);
	public   Actor    showActorById(int id);
	public   Actor    fetchActorById(int id);
  }
