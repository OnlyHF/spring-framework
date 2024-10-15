package org.springframework.qzb.server;

import lombok.ToString;
import org.springframework.stereotype.Service;

/**
 * Spring自动注入验证.
 */
@Service
public class DemoAService {

	private DemoBService demoBService;

	public DemoBService getDemoBService() {
		return demoBService;
	}

	public void setDemoBService(DemoBService demoBService) {
		this.demoBService = demoBService;
	}

	public void setAAAA() {
		System.out.println("AAAAA");
	}
}
