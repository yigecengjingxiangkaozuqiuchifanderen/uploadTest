package net.xdclass.shopmanager.controller;

import net.xdclass.shopmanager.model.Dept;
import net.xdclass.shopmanager.service.DeptService;
import net.xdclass.shopmanager.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("list")
    public JsonData deptList(){
        List<Dept> deptList = deptService.deptList();
        return JsonData.buildSuccess(deptList);
    }

}
