package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

/**
 * @author: DarkSunrise
 * @date: 2019/10/24  21:27
 */
public interface EmpService {
    List<Emp> findAll();

    Emp findOne(String id);

    void add(Emp emp);

    void delete(String id);

    void update(Emp emp);
}
