package com.fz.ms.core.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LaunchDto {

	String launchId;

	private LocalDate initDate;

	private LocalDate launchDate;

	private String musicName;
}
