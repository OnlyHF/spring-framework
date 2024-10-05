package org.springframework.qzb.server;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * QzbLifecycle.
 *
 * @Author qzb0212@126.com
 * @Date 2024-10-05 16:27:49
 */
@Component
public class QzbLifecycle implements SmartLifecycle {

	private boolean running;

	@Override
	public void start() {
		System.out.println("QzbLifecycle start 执行");
		running = true;
	}

	@Override
	public void stop() {
		System.out.println("QzbLifecycle stop 执行");
	}

	@Override
	public boolean isRunning() {
		return running;
	}
}
