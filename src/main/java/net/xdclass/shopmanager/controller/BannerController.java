package net.xdclass.shopmanager.controller;

import net.xdclass.shopmanager.mapper.BannerMapper;
import net.xdclass.shopmanager.model.Banner;
import net.xdclass.shopmanager.service.BannerService;
import net.xdclass.shopmanager.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @RequestMapping("list")
    public JsonData bannerlist(){
        List<Banner> list = bannerService.list();
        return JsonData.buildSuccess(list);
    }

}
