package com.baizhi.controller;

import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("findAll")
    public String findAll(Model model){
        Map map = empService.findAll();
        model.addAttribute("map",map);
        return "emplist";
    }
}
