package com.cn.hnust.aspectj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AspectjLoggerDemo {
	private Logger log = LoggerFactory.getLogger(getClass());
	public void logBefore() {
		log.debug("配置在了aspectj之前显示。");
	}
	public void logAfter() {
		log.error("配置在了aspectj之后显示。");
	}
	public void logAfterReturning() {
		log.error("配置在了aspectj之logAfterReturning显示。");
	}
	public void logAfterThrowing() {
		log.error("配置在了aspectj之logAfterThrowing显示。");
	}
	public void logAround() {
		log.error("配置在了aspectj之logAround显示。");
	}
}
