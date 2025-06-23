package com.nt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Actor;

public interface IActorRepository extends          JpaRepository<Actor, Integer>{
     public  Iterable<Actor> findByCategoryEquals(String category);
     public  Iterable<Actor> readByCategoryIs(String category);
     public   List<Actor>    getByCategory(String category);
     public  List<Actor>    findByFeeBetween(double start,double end);
     public  List<Actor>   findByAnameStartingWith(String initChars);
     public  List<Actor>   findByAnameEndingWith(String lastChars);
     public  List<Actor>   findByAnameContaining(String chars);
     public  List<Actor>   findByCategoryInOrderByCategoryAsc(Iterable<String> categories); 
     public  List<Actor>  findByFeeBetweenAndAddrsEquals(double start,double end,String addrs);
     public  List<Actor>  findByAnameLikeOrFeeLessThanEqual(String chars,double fee);
     public  Optional<Actor>     findByContactNoEquals(long phone);
     
     
     
     
     
}
