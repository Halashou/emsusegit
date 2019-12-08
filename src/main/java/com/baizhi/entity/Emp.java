package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_emp")
public class Emp implements Serializable{
    @Id
    private String id;
    private String name;
    private Double salary;
    private Integer age;
    @JSONField(format = "yyyy-MM-dd")
    private Date bir;
}
