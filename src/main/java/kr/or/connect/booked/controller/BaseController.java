package kr.or.connect.booked.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.or.connect.booked.service.ProductService;

@Controller
public class BaseController {

	@RequestMapping(path="/start")
	public ModelAndView Start() throws Exception {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("name","sunhee");
		List<String> testList = new ArrayList<String>();
		testList.add("a");
		testList.add("b");
		
		mav.addObject("list",testList);
		return mav;
	}
	@RequestMapping(path="/thymeleafTest")
	public String thymeStart(Model model) {
		HashMap<String,String> map = new HashMap<>();
		map.put("name","박선희");
		map.put("id","sunny");
		
		model.addAttribute("testModel",map);
		return "thymeleaf";
	}
	
	@Autowired
	ProductService product;
	
	@RequestMapping(path="/testDB")
	public String testDB(Model model) {
		int allCount = product.selectCountByCategory(0);
		model.addAttribute("count",allCount);
		
		return "thymeleafdb";
	}
}
