package org.springframework.qzb.server;

import jakarta.annotation.Resource;
import lombok.Data;
import lombok.ToString;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Spring自动注入验证.
 */
@Data
@ToString
@Service
public class DemoBService {

	@Resource
	private DemoAService demoAService;

	@Async
	public void xxx() {
		System.out.println("");
	}

}
