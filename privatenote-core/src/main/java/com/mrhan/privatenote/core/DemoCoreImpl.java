package com.mrhan.privatenote.core;

import com.mrhan.privatenote.dal.DemoDal;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Han
 * @version : DemoCore.java, v 0.1 2020年11月14日 17:43 Han Exp $
 * @blame F5 losers
 */
@Service
public class DemoCoreImpl implements DemoCore {

    @Resource
    DemoDal demoDal;

    @Override
    public String get() {
        return demoDal.get();
    }
}