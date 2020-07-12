package com.fz.ms.artistservice.command;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateLaunchCommand {

	private String musicName;

	private LocalDate launchDate;
}
