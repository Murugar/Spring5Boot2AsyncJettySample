package com.iqmsoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iqmsoft.log.AsyncLogger;
import com.iqmsoft.service.AsyncService;

@RestController
public class AsyncController {
	
	@Autowired
	private AsyncService service;
	
	@RequestMapping("/syncTest")
	public String syncTest(Model model) {
		AsyncLogger.logger.info("sync start");
		service.sync();
		AsyncLogger.logger.info("sync end");		
		return "sync";
	}
	
	@RequestMapping("/asyncTest")
    public String asyncTest(Model model){
		AsyncLogger.logger.info("async start.");
        service.async();
		AsyncLogger.logger.info("async end.");
        return "async";
    }

}
