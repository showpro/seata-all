package com.example.three.controller;

import com.example.three.dao.TblThreeDao;
import com.example.three.service.RmThreeInterface;
import com.example.three.service.RmThreeService;
import com.netflix.discovery.converters.Auto;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreeController {

    @Autowired
    private RmThreeService rmThreeService;

    @Autowired
    private RmThreeInterface rmThreeInterface;

    @GetMapping("/rm3")
    @Transactional
    public String three(){

        rmThreeService.rm3();
        int i = 1/0;
        return "成功";
    }

    @GetMapping("/rm3-tcc")
    @GlobalTransactional(rollbackFor = Exception.class)
    public String threeTcc(){

        rmThreeInterface.rm3(null);
        return "成功";
    }
}
