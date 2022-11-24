package com.ysx.ssm.service;

import com.github.pagehelper.PageInfo;
import com.ysx.ssm.pojo.Employee;

import java.util.List;

/**
 * @Author ysx
 * @DateTime 2022/11/23 15:26
 * @Description
 */
@SuppressWarnings({"all"})
public interface EmployeeService {
    //查询所有员工信息
    List<Employee> getAllEmployee();
    //查询员工分页信息
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
