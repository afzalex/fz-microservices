package com.fz.ms.core.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ArtistDto {

	private Integer id;
	
	private String name;
	
	private Integer followersCount;
}
