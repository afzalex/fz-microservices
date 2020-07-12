package com.fz.ms.artistservice.aggregate;

import java.time.LocalDate;
import java.util.UUID;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;

import com.fz.ms.artistservice.command.CreateLaunchCommand;
import com.fz.ms.artistservice.event.LaunchCreatedEvent;

import lombok.Data;

@Data
@Aggregate
public class LaunchAggregate {

	@AggregateIdentifier
	private String launchId;

	private LocalDate initDate;

	private LocalDate launchDate;

	private String musicName;

	@CommandHandler
	public LaunchAggregate(CreateLaunchCommand createLaunchCommand) {
		AggregateLifecycle.apply(LaunchCreatedEvent.builder()//
				.launchId(UUID.randomUUID().toString())//
				.launchDate(createLaunchCommand.getLaunchDate())//
				.musicName(createLaunchCommand.getMusicName())//
				.build());
	}

	protected void on(LaunchCreatedEvent launchCreatedEvent) {
		setInitDate(LocalDate.now());
		setLaunchId(launchCreatedEvent.getLaunchId());
		setMusicName(launchCreatedEvent.getMusicName());
		setLaunchDate(launchCreatedEvent.getLaunchDate());
	}
}
