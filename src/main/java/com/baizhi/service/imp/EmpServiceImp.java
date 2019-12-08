package com.baizhi.service.imp;

import com.baizhi.dao.EmpDao;
import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: DarkSunrise
 * @date: 2019/10/24  22:25
 */
@Service
@Transactional
public class EmpServiceImp implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> findAll() {
        return empDao.selectAll();
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Emp findOne(String id) {
        Emp emp = new Emp();
        emp.setId(id);
        return empDao.selectOne(emp);
    }

    @Override
    public void add(Emp emp) {
        empDao.insertSelective(emp);
    }

    @Override
    public void delete(String id) {
        empDao.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Emp emp) {
        empDao.updateByPrimaryKeySelective(emp);
    }
}
