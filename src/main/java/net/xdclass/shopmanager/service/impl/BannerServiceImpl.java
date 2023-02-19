package net.xdclass.shopmanager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import net.xdclass.shopmanager.mapper.BannerMapper;
import net.xdclass.shopmanager.model.Banner;
import net.xdclass.shopmanager.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<Banner> list() {
        LambdaQueryWrapper lambdaQueryWrapper = new LambdaQueryWrapper<>();
        return bannerMapper.selectList(lambdaQueryWrapper);
    }

    @Override
    public List<Banner> list1() {
        return null;
    }
}
