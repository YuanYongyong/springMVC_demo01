package com.ysx.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.ysx.ssm.pojo.Employee;
import com.ysx.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Author ysx
 * @DateTime 2022/11/23 15:11
 * @Description
 * 查询所有员工信息->/employee->get
 * 查询员工分页信息->/employee/page/1->get
 * 根据id查询员工信息->/employee/1->get
 * 跳转到添加页面->/to/add->get
 * 添加员工信息->/employee->post
 * 修改员工信息->/employee->put
 * 删除员工信息->/employee/1->delete
 */
@SuppressWarnings({"all"})
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(@PathVariable("pageNum") Integer pageNum,Model model){
        //获取员工分页信息
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        //将分页数据共享到域对象
        model.addAttribute("page",page);
        System.out.println("跳转成功！");
        System.out.println("hot-fix finsh");
        System.out.println("main test");
        System.out.println("hot-fix test");
        System.out.println("push test");
        return "employee_list";
    }


}
