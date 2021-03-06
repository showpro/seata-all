package com.example.one.service;

import io.seata.rm.tcc.api.BusinessActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Component
public class RmOneInterfaceImpl implements RmOneInterface {

    @Override
    @Transactional
    public String rm1(BusinessActionContext businessActionContext) {
        // 查询是事务记录表，xxxx
        System.out.println("rm1 try");

        rm2();
        rm3();
//        System.out.println(1/0);
        return null;
    }

    @Override
    @Transactional
    public boolean rm1Commit(BusinessActionContext businessActionContext) {
        System.out.println("rm1 confirm");
        return true;
    }

    @Override
    @Transactional
    public boolean rm1Rollback(BusinessActionContext businessActionContext) {
        System.out.println("rm1 rollback");
        return true;
    }


    @Autowired
    private RestTemplate restTemplate;

    private void rm2() {
        restTemplate.getForEntity("http://two/rm2-tcc", null);
    }

    private void rm3() {
        restTemplate.getForEntity("http://three/rm3-tcc", null);
    }
}
