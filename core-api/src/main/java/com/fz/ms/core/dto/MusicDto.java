package com.fz.ms.core.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MusicDto {

	private Integer id;

	private String title;

	private LocalDate releasedOn;

	private Integer rating;
}
