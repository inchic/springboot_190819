// package com.example.springboot_190819.controller;

// import java.util.HashMap;
// import java.util.Map;

// import com.example.springboot_190819.services.MemberService_07;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// @Controller
// @RequestMapping(value = "/member07")
// public class MemberController_07 {
//     @Autowired
//     private MemberService_07 service;

//     @RequestMapping(value = "/{action07}", method = { RequestMethod.GET, RequestMethod.POST })

//     public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
//             ModelAndView modelandView)
//     {
//         String viewName = "/member07/";

        
//         Map<String, Object> resultMap = new HashMap<String, Object>();
//         if("read07".equals(action)){
            
//             viewName += action;
//             resultMap = (Map<String,Object>) service.getObject(paramMap);
//         }

//         return modelandView;
//     }
// }
