package com.example.demo.component.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.component.entity.DemoEntity;
import com.example.demo.component.model.DemoValidateModel;
import com.example.demo.component.repositories.DemoRepository;

import jakarta.validation.Valid;

@Controller
public class DemoController {
	
    @Autowired
    private DemoRepository demoRepository;

	//index.html呼び出し
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		List<DemoEntity> dataList = demoRepository.findAll();
		mav.addObject("dataList", dataList);
		mav.setViewName("index");
		return mav;
	}
    
	//poster.html呼び出し
	@RequestMapping(value="/tmp", method=RequestMethod.GET)
	public ModelAndView input(ModelAndView mav) {
		mav.setViewName("poster");
		return mav;
	}
	
	//リクエストパラメータ取得。メッセージを保管してoutput.htmlへ遷移
	@RequestMapping(value="/output", method=RequestMethod.POST)
	public ModelAndView output(@RequestParam("title")String title,
								@RequestParam("post")String post, 
								@Valid DemoValidateModel model, ModelAndView mav) {	
		mav.setViewName("output");
		mav.addObject(model);
		mav.addObject("msg","ようこそ" + title + "さん。" + post + "wwwww");
		return mav;
	}
}
