package com.baizhi.service;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Map findAll() {
        Map map = new HashMap();
        String message = "";
        String status = "";
        List<Emp> emps = null;
        try {
            emps = empDao.selectAll();
            message = "ok";
            status = "200";
            map.put("emps", emps);
        } catch (Exception e) {
            e.printStackTrace();
            message = "no ok";
            status = "-200";
        }
        map.put("status", -200);
        map.put("message", "no ok");
        return map;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Map findOne(String id) {
        Map map = new HashMap();
        try {
            Emp emp = empDao.selectByPrimaryKey(id);
            map.put("emp", emp);
            map.put("status", 200);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status", -200);
            map.put("message", "查询失败");
        }
        return map;
    }

    @Override
    public Map delete(String id) {
        Map map = new HashMap();
        try {
            empDao.deleteByPrimaryKey(id);
            map.put("status", 200);
            map.put("message", "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status", -200);
            map.put("message", "删除失败");
        }
        return map;
    }

    @Override
    public Map add(Emp emp) {
        Map map = new HashMap();
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Map update(Emp emp) {
        return null;
    }
}
