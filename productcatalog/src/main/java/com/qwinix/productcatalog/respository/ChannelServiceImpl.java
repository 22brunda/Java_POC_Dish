package com.qwinix.productcatalog.respository;

import com.qwinix.productcatalog.model.Channel;

public interface ChannelServiceImpl {
	Channel readChannel(int id);
	Channel createChannel(int id);
	Channel updateChannel(int id);
	Channel deleteChannel(int id);
}
