package net.xdclass.shopmanager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import net.xdclass.shopmanager.mapper.BannerMapper;
import net.xdclass.shopmanager.model.Banner;
import net.xdclass.shopmanager.service.BannerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
class BannerTest {

    @Autowired
    private BannerService bannerService;

    @Autowired
    private BannerMapper bannerMapper;

    @Test
    public void testBannerList(){
        List<Banner> bannerList = bannerService.list();
        log.info("轮播图列表：{}",bannerList);
    }

    @Test
    public void testBannerById(){
        Banner banner = bannerMapper.selectById(1);
        log.info("BannerById",banner);
    }

    @Test
    public void testBannerBatchIds(){
        List<Banner> bannerList = bannerMapper.selectBatchIds(Arrays.asList(1,2));
        log.info("BannerBatchIds",bannerList);
    }

    @Test
    public void testBannerSelectOne(){
//        LambdaQueryWrapper<Banner> lambdaQueryWrapper = new LambdaQueryWrapper<>();
//        lambdaQueryWrapper.eq(Banner::getId, 2);
//        Banner banner = bannerMapper.selectOne(lambdaQueryWrapper);
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", "2");
        Banner banner = bannerMapper.selectOne(queryWrapper);
        log.info("BannerBatchIds",banner);
    }

    @Test
    public void testBannerSelectList(){
        LambdaQueryWrapper<Banner> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.eq(Banner::getWeight,2);
        List<Banner> bannerList = bannerMapper.selectList(lambdaQueryWrapper);
        log.info("BannerList",bannerList);
    }

}
