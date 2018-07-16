package com.qwinix.productcatalog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qwinix.productcatalog.model.Channel;
import com.qwinix.productcatalog.service.ChannelService;

@RestController
@EnableAutoConfiguration
public class ChannelController {
	@Autowired
	ChannelService channelService;

	@GetMapping("/channels")
	public List<Channel> getAllChannel() {
		return  channelService.getAllChannel();
	}

	@GetMapping("/channel/{id}")
	public Channel getChannelById(@PathVariable(value = "id") int channelId) {
		return channelService.findById(channelId);
	}

	@PostMapping("/channel")
	public void createChannel(@RequestBody Channel achannel) {
		channelService.createChannel(achannel);
	}

	@PutMapping("/channel/{id}")
	public void updateChannel(@RequestBody Channel channelUpdate) {
		channelService.channelUpdate(channelUpdate);
	}

	@DeleteMapping("/channel/{id}")
	public void deleteChannelById(@PathVariable(value = "id") int deleteChannelId) {
		channelService.deleteById(deleteChannelId);
	}
}


