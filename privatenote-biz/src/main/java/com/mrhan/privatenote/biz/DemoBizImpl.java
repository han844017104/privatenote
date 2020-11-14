package com.mrhan.privatenote.biz;

import com.mrhan.privatenote.core.DemoCore;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Han
 * @version : DemoBizImpl.java, v 0.1 2020年11月14日 17:45 Han Exp $
 * @blame F5 losers
 */
@Service
public class DemoBizImpl implements DemoBiz {

    @Resource
    DemoCore demoCore;

    @Override
    public String get() {
        return demoCore.get();
    }
}