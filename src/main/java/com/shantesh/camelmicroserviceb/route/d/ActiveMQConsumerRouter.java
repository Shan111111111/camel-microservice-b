package com.shantesh.camelmicroserviceb.route.d;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumerRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("activemq:my-activemq-queue")
		.to("log:recieved-messages-from-active-mq");

	}
}
