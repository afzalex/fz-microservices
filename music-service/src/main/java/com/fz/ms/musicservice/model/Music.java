package com.fz.ms.musicservice.model;

import java.time.LocalDate;

import lombok.Data;


@Data
public class Music {

	private Integer id;

	private String title;

	private LocalDate releasedOn;

	private Integer rating;
}
