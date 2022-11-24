package com.ysx.ssm.mapper;

import com.ysx.ssm.pojo.Employee;

import java.util.List;

/**
 * @Author ysx
 * @DateTime 2022/11/23 15:40
 * @Description
 */
public interface EmployeeMapper {
    //查询所有员工信息
    List<Employee> getAllEmployee();
}
