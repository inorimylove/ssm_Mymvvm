package me.inori.ssm_mvvm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import me.inori.ssm_mvvm.dao.TestDao;
import me.inori.ssm_mvvm.entity.Test;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private TestDao testDao;
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public ModelAndView test(){
		Test test=testDao.test();
		ModelAndView mView = new ModelAndView();
		mView.setViewName("/view/jsp/test.jsp");
		mView.addObject("name", test.getName());
		return mView;	
	}

}
