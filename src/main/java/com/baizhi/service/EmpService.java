package com.baizhi.service;

import com.baizhi.entity.Emp;
import java.util.Map;

public interface EmpService {
    Map findAll();
    Map findOne(String id);
    Map delete(String id);
    Map add(Emp emp);
    Map update(Emp emp);
}
