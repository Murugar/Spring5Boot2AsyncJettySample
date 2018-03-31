package com.iqmsoft.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.iqmsoft.log.AsyncLogger;

@Service
public class AsyncService {
	public void sync() {
		AsyncLogger.logger.info("sync service start");
		try {
			Thread.sleep(10000);
			AsyncLogger.logger.info("sync sleep done");
		} catch (InterruptedException e) {
			AsyncLogger.logger.error(e.getMessage(), e);
			
		}
		AsyncLogger.logger.info("sync service end");
	}
	
	@Async
	public void async() {
		AsyncLogger.logger.info("async service start");
		try {
			Thread.sleep(10000);
			AsyncLogger.logger.info("async sleep done");
		} catch (InterruptedException e) {
			AsyncLogger.logger.error(e.getMessage(), e);
			
		}
		AsyncLogger.logger.info("async service end");
	}
}
