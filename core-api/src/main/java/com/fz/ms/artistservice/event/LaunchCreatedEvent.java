package com.fz.ms.artistservice.event;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LaunchCreatedEvent {

	private String launchId;

	private String musicName;

	private LocalDate launchDate;
}
