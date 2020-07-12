package com.fz.ms.artistservice.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fz.ms.artistservice.service.LaunchService;
import com.fz.ms.core.dto.LaunchDto;

@RestController
@RequestMapping("/launch")
public class LaunchController {
	@Autowired
	private LaunchService launchService;

	@PostMapping
	private CompletableFuture<String> createLaunch(@RequestBody LaunchDto launchDto) {
		return launchService.launchMusic(launchDto);
	}
}
