package net.xdclass.shopmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import net.xdclass.shopmanager.mapper.DeptMapper;
import net.xdclass.shopmanager.model.Dept;
import net.xdclass.shopmanager.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> deptList() {
        LambdaQueryWrapper<Dept> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        return deptMapper.selectList(lambdaQueryWrapper);
    }
}
