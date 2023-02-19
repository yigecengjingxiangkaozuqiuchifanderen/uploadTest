package net.xdclass.shopmanager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import net.xdclass.shopmanager.mapper.BannerMapper;
import net.xdclass.shopmanager.model.Banner;
import net.xdclass.shopmanager.model.Employee;
import net.xdclass.shopmanager.service.BannerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@Slf4j
class EmployeeTest {

    @Autowired
    private BannerService employeeService;



}
