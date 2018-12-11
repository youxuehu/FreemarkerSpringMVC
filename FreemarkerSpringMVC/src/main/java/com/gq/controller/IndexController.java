package com.gq.controller;
import com.gq.dao.model.Student;
import com.gq.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.*;

@Controller
public class IndexController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("info","helo, world");
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","jack");
        map.put("age","20");
        model.addAttribute("map",map);
        model.addAttribute("date",new Date());
        List<Student> studentList = studentService.findAll();
        model.addAttribute("studentList",studentList);
        return "hello";
    }
}
