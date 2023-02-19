package net.xdclass.shopmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mysql.cj.util.StringUtils;
import net.xdclass.shopmanager.mapper.EmployeeMapper;
import net.xdclass.shopmanager.model.Banner;
import net.xdclass.shopmanager.model.Employee;
import net.xdclass.shopmanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> list() {

//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.eq("Job", "经理");
//        return  employeeMapper.selectList(queryWrapper);

        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Employee::getJob, "经理");
        return employeeMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Map<String, Object>> selectByEmployeeJob() {
        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Employee::getJob, "文员");
        lambdaQueryWrapper.orderByAsc(Employee::getEmpno);
        return employeeMapper.selectMaps(lambdaQueryWrapper);
    }

    @Override
    public List<Map<String, Object>> selectByEmployeeDeptnu(Employee employee) {
        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Employee::getDeptnu, employee.getDeptnu());
        return employeeMapper.selectMaps(lambdaQueryWrapper);
    }

    @Override
    public IPage<Employee> selectPages(Integer pageNum, Integer pageSize) {
        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Employee::getJob, "销售员");
        lambdaQueryWrapper.orderByAsc(Employee::getEmpno);
        Page<Employee> page = new Page<>(pageNum,pageSize);
        IPage<Employee> ipage = employeeMapper.selectPage(page,lambdaQueryWrapper);
        return ipage;
    }
}
