package com.demotransfer.autoconfigure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.alibaba.fastjson.JSONObject;

@ConfigurationProperties(prefix = "demotransfer")
public class DemoTransferProperties {

	private String processId;

	private String processName;

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}

}
