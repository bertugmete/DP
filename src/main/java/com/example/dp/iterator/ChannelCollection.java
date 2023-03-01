package com.example.dp.iterator;

public interface ChannelCollection {
    void addChannel(Channel channel);
    void removeChannel(String frequency);
    ChannelIterator iterator(ChannelCategoryEnum type);
}
