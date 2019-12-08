package com.baizhi.emsusegit;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class EmsusegitApplicationTests{
    @Autowired
    private EmpDao empDao;
    @Test
    void contextLoads() {
        List<Emp> emps = empDao.selectAll();
        emps.forEach(emp -> System.out.println(emp));
    }

}
