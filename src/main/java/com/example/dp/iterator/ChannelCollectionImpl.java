package com.example.dp.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelList = new ArrayList<>();

    @Override
    public void addChannel(Channel channel) {
        channelList.add(channel);
    }

    @Override
    public void removeChannel(String frequency) {
        Optional<Channel> foundChannel = channelList.stream().filter(channel -> channel.getFrequency().equals(frequency)).findAny();
        if (foundChannel.isPresent()) {
            channelList.remove(foundChannel);
        }
    }

    @Override
    public ChannelIterator iterator(ChannelCategoryEnum type) {
        return new ChannelIterator() {
            private int position;

            @Override
            public boolean hasNext() {
                while (position < channelList.size()) {
                    Channel c = channelList.get(position);
                    if (c.getType().equals(type)){
                        return true;
                    } else{
                        position++;
                    }
                }
                return false;
            }

            @Override
            public Channel next() {
                Channel channel = channelList.get(position);
                position++;
                return channel;
            }
        };
    }
}
