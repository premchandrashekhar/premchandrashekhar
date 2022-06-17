package com.test.springboot.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ActuatorCustomReport implements HealthIndicator {

	private final String message_key = "Actuator Health Report";

	@Override
	public Health health() {

		if (!isRunningService()) {
			return Health.up().withDetail(message_key, "Not Avilable").build();
		}

		return Health.up().withDetail(message_key, "Avilable").build();
	}

	private Boolean isRunningService() {

		Boolean isRunning = false;

		return isRunning;
	}
}
