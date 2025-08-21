package com.nt.controller;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ShowHomeController {
	
	/*	@RequestMapping("/home")
		public  String  showHome() {
			System.out.println("ShowHomeController.showHome()");
			//return LVN
			return  "welcome";
		}
	*/
	
	/*@RequestMapping("/")
	public  String  showHome(Map<String,Object> map) {
		System.out.println("share memory obj class name::"+map.getClass()+"..."+map.hashCode());
		// keep  data  in shared memory  as the model attributes
		map.put("name","raja");
		map.put("sysDate",new Date());
		
		//return LVN
		return  "welcome";
	}*/
	
	/*@RequestMapping("/")
	public  String  showHome(BindingAwareModelMap map) {
		System.out.println("share memory obj class name::"+map.getClass());
		// keep  data  in shared memory  as the model attributes
		map.put("name","raja");
		map.put("sysDate",new Date());
		
		//return LVN
		return  "welcome";
	}
	*/
	
	/*@RequestMapping("/")
	public  String  showHome(ExtendedModelMap map) {
		System.out.println("share memory obj class name::"+map.getClass());
		// keep  data  in shared memory  as the model attributes
		//map.put("name","raja");
		//map.put("sysDate",new Date());
		map.addAttribute("name","raja");
		map.addAttribute("sysDate", new Date());		
		//return LVN
		return  "welcome";
	}*/
	
	/*	@RequestMapping("/")
		public  String  showHome(ModelMap map) {
			System.out.println("share memory obj class name::"+map.getClass());
			// keep  data  in shared memory  as the model attributes
			map.addAttribute("name","raja");
			map.addAttribute("sysDate",new Date());
			
			//return LVN
			return  "welcome";
		}
	*/
	
	/*@RequestMapping("/")
	public  String  showHome(Model  model) {
		System.out.println("share memory obj class name::"+model.getClass());
		// keep  data  in shared memory  as the model attributes
		model.addAttribute("name","raja");
		model.addAttribute("sysDate",new Date());
		
		//return LVN
		return  "welcome";
	}*/
	
	/*	@RequestMapping("/home")
		public  Model  showHome() {
			// keep  data  in shared memory  as the model attributes
			Model model=new BindingAwareModelMap();
			model.addAttribute("name","raja");
			model.addAttribute("sysDate",new Date());
			return model;
			}
	*/
	
	/*@RequestMapping("/home")
	public  Map<String,Object>  showHome() {
		// keep  data  in shared memory  as the model attributes
		Map<String,Object>  map=new HashMap<String, Object>();
		map.put("name","raja");
		map.put("sysDate",new Date());
		return map;
		}
	*/
	
	/*	@RequestMapping("/home")
		public ModelAndView  showHome() {
			// keep  data  in shared memory  as the model attributes
			ModelAndView  mav=new ModelAndView();
			mav.addObject("name","raja");
			mav.addObject("sysDate",new Date());
			mav.setViewName("welcome");
			return mav;
			}
	*/	
	
	/*@RequestMapping("/home")
	public String  showHome(Map<String,Object> map) {
		System.out.println("ShowHomeController.showHome()");
		// keep  data  in shared memory  as the model attributes
		map.put("name","raja");
		map.put("sysDate",new Date());
		return "redirect:report?p1=val1&p2=val2";
		}
	
	@RequestMapping("/report")
	  public  String   showReport() {
		  System.out.println("ShowHomeController.showReport()");
		  return "show_report";
	  }
	*/
	
	
	/*@RequestMapping("/home")
	public  String  showHome(Map<String,Object> map,HttpServletRequest  req,HttpServletResponse res) {
		System.out.println("request path ::"+req.getServletPath());
		System.out.println("res content type ::"+res.getContentType());
		
		// keep  data  in shared memory  as the model attributes
		map.put("name","raja");
		map.put("sysDate",new Date());
		
		//return LVN
		return  "welcome";
	}*/
	
	/*@RequestMapping("/home")
	public  String  showHome(HttpSession ses) {
		
		// keep the data  as session attributes
		ses.setAttribute("name", "raja");
		ses.setAttribute("sysDate", new Date());
		
		//return LVN
		return  "welcome";
	}*/
	
	/*@Autowired
	private ServletConfig  cg;
	@Autowired
	private  ServletContext sc;
	
	@RequestMapping("/home")
	public  String  showHome(Map<String,Object> map) {
		System.out.println("DS logical name ::"+cg.getServletName());
		System.out.println(" web application context path ::"+sc.getContextPath());
		// keep the data  as session attributes
		map.put("name", "raja");
		map.put("sysDate", new Date());
		
		//return LVN
		return  "welcome";
	}*/
	
	@RequestMapping("/home")
	public  String  showHome(HttpServletResponse  res)throws Exception {
		 //set response content type 
		res.setContentType("text/html");
		//set  content-disposition response header
		//res.setHeader("content-disposition", "inline");
		  res.setHeader("content-disposition", "attachment;fileName=xyz.html");
	// get PrintWriter object
		PrintWriter pw=res.getWriter();
		//write the output
		pw.println("<b> welcome to  spring boot  MVC </b>");
		//close stream
		pw.close();
	  return null;
	}
	
	
}
