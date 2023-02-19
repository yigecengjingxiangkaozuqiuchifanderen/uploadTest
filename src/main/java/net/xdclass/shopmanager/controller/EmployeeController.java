package net.xdclass.shopmanager.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.xdclass.shopmanager.model.Employee;
import net.xdclass.shopmanager.service.EmployeeService;
import net.xdclass.shopmanager.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/list")
    public JsonData list(){
        List<Employee> employeeList = employeeService.list();
        return JsonData.buildSuccess(employeeList);
    }

    @RequestMapping("/selectByEmployeeJob")
    public JsonData selectByEmployeeJob(){
        List<Map<String, Object>> list = employeeService.selectByEmployeeJob();
        return JsonData.buildSuccess(list);
    }

    @PostMapping("/selectByEmployeeDeptnu")
    public JsonData selectByEmployeeDeptnu(@RequestBody Employee employee){
        List<Map<String, Object>> list = employeeService.selectByEmployeeDeptnu(employee);
        return JsonData.buildSuccess(list);
    }

    @RequestMapping("/selectPages")
    public JsonData selectPages(Integer pageNum, Integer pageSize){
        IPage<Employee> page = employeeService.selectPages(pageNum, pageSize);
        return JsonData.buildSuccess(page);
    }
}
