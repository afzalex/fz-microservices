package com.fz.ms.musicservice.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fz.ms.core.dto.MusicDto;
import com.fz.ms.musicservice.MusicApplication;

@Service
public class MusicService {

	@Autowired
	private ObjectMapper objectMapper;

	public List<MusicDto> getDummyMusicList() throws IOException {
		InputStream resourceAsStream = MusicApplication.class.getResourceAsStream("dummy-music-list.json");
		MusicDto[] musicArray = objectMapper.readValue(resourceAsStream, MusicDto[].class);
		return Arrays.asList(musicArray);
	}
}
