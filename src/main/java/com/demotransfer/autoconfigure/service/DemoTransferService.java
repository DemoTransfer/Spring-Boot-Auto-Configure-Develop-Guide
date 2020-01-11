package com.demotransfer.autoconfigure.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demotransfer.autoconfigure.config.DemoTransferProperties;

public class DemoTransferService {

	@Autowired
	private DemoTransferProperties demoTransferProperties;

	public void print() {
		System.out.println("processId:" + demoTransferProperties.getProcessId());
		System.out.println("processName:" + demoTransferProperties.getProcessName());
	}

}
