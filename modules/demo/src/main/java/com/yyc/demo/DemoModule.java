package com.yyc.demo;

import com.axelor.app.AxelorModule;

import com.yyc.demo.service.HumanService;
import com.yyc.demo.service.impl.HumanServiceImpl;

public class DemoModule extends AxelorModule {

    @Override
    protected  void configure() {
        bind(HumanService.class).to(HumanServiceImpl.class);
    }
}
