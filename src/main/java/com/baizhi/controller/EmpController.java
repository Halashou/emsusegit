package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: DarkSunrise
 * @date: 2019/10/25  0:32
 */
@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("findAll")
    public String findAll(HttpServletRequest request) {
        List<Emp> emps = empService.findAll();
        request.setAttribute("emps", emps);
        return "empList";
    }

    @RequestMapping("findOne")
    public String findOne(HttpServletRequest request, String id) {
        Emp one = empService.findOne(id);
        request.setAttribute("emp", one);
        return "updateEmp";
    }

    @RequestMapping("add")
    public String add(HttpServletRequest request, Emp emp) {
        empService.add(emp);
        return "redirect:/emp/findAll";
    }

    @RequestMapping("delete")
    public String delete(String id) {
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    @RequestMapping("update")
    public String update(Emp emp) {
        empService.update(emp);
        return "redirect:/emp/findAll";
    }
}