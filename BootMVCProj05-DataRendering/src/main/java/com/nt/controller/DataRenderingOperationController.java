package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Artist;

@Controller
public class DataRenderingOperationController {
	
	@GetMapping("/process")
	public  String  showData(Map<String,Object> map) {
		// add simple model  attributes
		map.put("name", "raja");
		map.put("age",30);
		//add arrays and collections as the model attributes
		map.put("favColors", new String[] {"red","yellow","green"});
		map.put("friends", List.of("raja", "rani", "chary"));
		map.put("phones",Set.of(999999L,54545454L,54554544L));
		map.put("idDetails",Map.of("aadhar",565656,"voterid",5464646,"panNo",565656));
	    // keeping  Model class obj as the model attribute values
		Artist artist1=new Artist(1001, "rajesh","hyd", 89991.0);
		map.put("artistData",artist1);
		// keeping   List of Model class objs as the model attribute values
		Artist artist2=new Artist(1004, "suresh","vizag", 89991.0);
		Artist artist3=new Artist(1002, "mukesh","delhi", 19991.0);
		map.put("artistList",List.of(artist1,artist2,artist3));
		//return LVN
		return "show_report";
		
	}

}
