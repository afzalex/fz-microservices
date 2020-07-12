package com.fz.ms.artistservice.service;

import java.util.concurrent.CompletableFuture;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fz.ms.artistservice.command.CreateLaunchCommand;
import com.fz.ms.core.dto.LaunchDto;

@Service
public class LaunchService {

	@Autowired
	private CommandGateway commandGateway;

	public CompletableFuture<String> launchMusic(LaunchDto launchDto) {
		return commandGateway.send(CreateLaunchCommand.builder()//
				.launchDate(launchDto.getLaunchDate())//
				.musicName(launchDto.getMusicName()));
	}
}
