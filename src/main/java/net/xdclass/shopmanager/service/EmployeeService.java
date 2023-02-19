package net.xdclass.shopmanager.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import net.xdclass.shopmanager.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    List<Employee> list();

    List<Map<String,Object>> selectByEmployeeJob();

    List<Map<String,Object>> selectByEmployeeDeptnu(Employee employee);

    IPage<Employee> selectPages(Integer pageNum, Integer pageSize);
}
