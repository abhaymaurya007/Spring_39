//DoctorOperationsController.java
package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.service.IDoctorMgmtService;
import com.nt.vo.DoctorVO;

import jakarta.servlet.http.HttpSession;

@Controller
public class DoctorOperationsController {
	@Autowired
	private  IDoctorMgmtService  docService;
	
	
	@GetMapping("/pagination_report")
	public    String   showReportByPagination(@PageableDefault(page=0,size=3,sort="dname",
			                                                                                                          direction =Sort.Direction.ASC) Pageable pageable,
			                                                                   Map<String,Object> map) {
		//use  service
		Page<DoctorVO>  pageVO= docService.showAllDoctorsByPagination(pageable);
		//add Page obj in the shared memory
		map.put("pageData", pageVO);
		
		return "show_report_pagination";
	}
	
	@GetMapping("/")   //for  home page
	public String   ShowHome() {
		//return lvn
		return  "welcome";
	}
	
	@GetMapping("/report")
	public  String  showReport(Map<String,Object> map) {
		System.out.println("DoctorOperationsController.showReport()");
		//use service
	  List<DoctorVO>  listVO=docService.findAllDoctors();
	  //keep the results in shared Memory
	  map.put("doctorsList", listVO);
	  //return LVN
	  return  "show_report";
	}
	
	@GetMapping("/register")  //for  register Doctor Form Page launching
	public  String     showRegisterDoctorForm(@ModelAttribute("docVO") DoctorVO vo) {
	  //return LVN (register Doctor form page)
	 return "register_doctor_form";
	}
	
	/*@PostMapping("/register")
	public  String   regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, Map<String,Object> map) {
		//use  service
		String msg=docService.registerDoctor(vo);
		List<DoctorVO> listVO=docService.findAllDoctors();
		//keep the results in Model Attribute
		map.put("resultMsg", msg);
		map.put("doctorsList", listVO);
		//return LVN'
		return "show_report";
	}*/
	
	/*@PostMapping("/register")  //solution 1
	public  String   regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, Map<String,Object> map) {
		System.out.println("DoctorOperationsController.regsiterDcotor()");
		//use  service
		String msg=docService.registerDoctor(vo);
		//keep the results in Model Attribute
		map.put("resultMsg", msg);
		//return LVN'
		return "redirect:report";
	}
	*/
	
	/*	@PostMapping("/register")  //solution 1
		public  String   regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, 
				                                                                                            Map<String,String> map) {
			System.out.println("DoctorOperationsController.regsiterDcotor()");
			//use  service
			String msg=docService.registerDoctor(vo);
			//keep the results as  Model Attribute
		     map.put("resultMsg",msg);   // these flash attributes are having  redirectio  scope
			//return LVN'
			return "redirect:report";
		}
	*/	
	/*@PostMapping("/register")  //solution 2
	public  String   regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, 
			                                                                                         RedirectAttributes attrs) {
		System.out.println("DoctorOperationsController.regsiterDcotor()");
		//use  service
		String msg=docService.registerDoctor(vo);
		//keep the results as flash Model Attribute
	     attrs.addFlashAttribute("resultMsg",msg);   // these flash attributes are having  redirectio  scope
		//return LVN'
		return "redirect:report";
	}*/
	
	
	@PostMapping("/register")  //solution 3  // register Dcotor form submission
	public  String   regsiterDcotor(@ModelAttribute("docVO") DoctorVO vo, 
			                                                                                         HttpSession  ses) {
		System.out.println("DoctorOperationsController.regsiterDcotor()");
		//use  service
		String msg=docService.registerDoctor(vo);
		//keep the results as flash Model Attribute
	     ses.setAttribute("resultMsg",msg);   // these flash attributes are having  redirectio  scope
		//return LVN'
		return "redirect:report";
	}
	
	@GetMapping("/edit")
	public  String   showEditDoctorFormPage(@RequestParam("no") int no,
			                                                                     @ModelAttribute("docVO") DoctorVO  vo) {
		//use service
		DoctorVO  vo1=docService.showDoctorById(no);
		//copy  vo obj data to vo1
		BeanUtils.copyProperties(vo1, vo);
		//return LVN
		return  "edit_doctor_form";
		
	}
	
	@PostMapping("/edit")
	public  String   editDoctor(@ModelAttribute("docVO") DoctorVO  vo,
			                                      RedirectAttributes attrs) {
		System.out.println("DoctorOperationsController.editDoctor()");
		//use service
		String msg=docService.editDoctor(vo);
		//keep the results as flash Model attribute
		attrs.addFlashAttribute("resultMsg", msg);
		//redirect the request
		return "redirect:report";
		
	}

	@GetMapping("/delete")
	public  String   removeDoctor(@RequestParam("no") int no,
			                                                 RedirectAttributes attrs)throws Exception {
		System.out.println("DoctorOperationsController.removeDoctor()");
		//use service
		String  msg=docService.removeDoctor(no);
		//keep the result as model attribute
	    attrs.addFlashAttribute("resultMsg", msg);
		//forward the request
		return  "redirect:report";
		
	}
}
