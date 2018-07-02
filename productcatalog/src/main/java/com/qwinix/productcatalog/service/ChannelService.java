package com.qwinix.productcatalog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwinix.productcatalog.model.Channel;
import com.qwinix.productcatalog.respository.ChannelRepository;


@Service
public class ChannelService {
	@Autowired
	ChannelRepository channelRepository;

	public java.util.List<Channel> getAllChannel() {
		List<Channel> channels = new ArrayList<>();
		//channelRepository.findAll().forEach(channels::add);
		channels = channelRepository.findAll();
		return channels;
	}

	public Channel findById(int channelId) {
		return channelRepository.findById(channelId);
	}

	public Channel createChannel(Channel achannel) {
		Channel addChannel = channelRepository.save(achannel);
		return addChannel;
	}

	public Channel channelUpdate(Channel channelUpdate) {
		Channel updatedChannel = channelRepository.save(channelUpdate);
		return updatedChannel;
	}

	public void deleteById(int deleteChannelId) {
		channelRepository.deleteById(deleteChannelId);
	}
}
