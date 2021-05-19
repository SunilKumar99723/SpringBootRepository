package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@Autowired
	CustomerRepo customerRepository;
	@RequestMapping("/")
	public String customerForm()
	{
		return "customers";
	}

	@RequestMapping("/details")
	public String details(Customers customers)
	{
		customerRepository.save(customers);
		return "customers";
	}
	
	@RequestMapping("/getdetails")
	public String getdetails(Customers customers)
	{
		return "ViewCustomers";
	}
	
//	@PostMapping("/getdetails")
//	public String viewDetails(@RequestParam("cid") String cid,
//			@RequestParam("cname") String cname,
//			@RequestParam("cemail") String cemail, 
//			ModelMap modelMap
//			){
//		modelMap.put("cid", cid);
//		modelMap.put("cname", cname);
//		modelMap.put("cemail", cemail);
//		return "ViewCustomers";
//			}
	@PostMapping("/getdetails")
	public ModelAndView getdetails(@RequestParam int cid){
		ModelAndView mv = new ModelAndView("Retrive");
		Customers customers = customerRepository.findById(cid).orElse(null);
		mv.addObject(customers);
		return mv;
			}
//	@PostMapping("/getdetails")
//	public String viewDetails(@RequestParam("cid") String cid,
//			@RequestParam("cname") String cname,
//			@RequestParam("cemail") String cemail, 
//			ModelMap modelMap
//			){
//		modelMap.put("cid", cid);
//		modelMap.put("cname", cname);
//		modelMap.put("cemail", cemail);
//		return "ViewCustomers";
//			}
}
