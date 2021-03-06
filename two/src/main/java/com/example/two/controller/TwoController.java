package com.example.two.controller;

import com.example.two.service.RmTwoInterface;
import com.example.two.service.RmTwoService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {

    @Autowired
    private RmTwoService rmTwoService;

    @Autowired
    private RmTwoInterface rmTwoInterface;

    @GetMapping("/rm2")
    public String two(){

        rmTwoService.rm2();
//        int i = 1/0;
        return "success";
    }

    @GetMapping("/rm2-tcc")
    @GlobalTransactional(rollbackFor = Exception.class)
    public String twoTcc(){

        rmTwoInterface.rm2(null);
//        int i = 1/0;
        return "success";
    }
}
