package com.fz.ms.musicservice.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fz.ms.core.dto.MusicDto;
import com.fz.ms.musicservice.service.MusicService;

@RestController
@RequestMapping("/music")
public class MusicController {

	@Autowired
	private MusicService musicService;

	@GetMapping("/dummy")
	public ResponseEntity<List<MusicDto>> musicList() throws IOException {
		return ResponseEntity.ok(musicService.getDummyMusicList());
	}
}
