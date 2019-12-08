package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: DarkSunrise
 * @date: 2019/10/24  21:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Component(value = "emp")
public class Emp implements Serializable {
    private String id;
    private String name;
    private Double salary;
    private Integer age;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date bir;
}
