package com.example.demo.component.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.component.model.DemoValidateModel;

@Service
public class DemoValidationService {

    public ModelAndView validation(DemoValidateModel model) {

        ModelAndView mav = new ModelAndView();

        String title = model.getTitle();
        String post = model.getPost();

        //何もひっかからなかったらnullを返す
        if (mav.isEmpty()) {
            return null;
        }
        //ひっかかったらビュー名指定してreturnする
        mav.setViewName("errorView");
        return mav;
   }
}
