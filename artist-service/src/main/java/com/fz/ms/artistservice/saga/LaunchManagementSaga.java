package com.fz.ms.artistservice.saga;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.modelling.saga.SagaEventHandler;
import org.axonframework.modelling.saga.StartSaga;
import org.axonframework.spring.stereotype.Saga;
import org.springframework.beans.factory.annotation.Autowired;

import com.fz.ms.artistservice.event.LaunchCreatedEvent;

@Saga
public class LaunchManagementSaga {

	@Autowired
	private transient CommandGateway commandGateway;
	
	@StartSaga
	@SagaEventHandler(associationProperty="launchId")
	public void handle(LaunchCreatedEvent launchCreatedEvent){
		
	}
}
