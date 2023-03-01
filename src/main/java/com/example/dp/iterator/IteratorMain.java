package com.example.dp.iterator;

import java.util.Arrays;

public class IteratorMain {
    public static void main(String[] args) {
        ChannelCollection channelCollection = new ChannelCollectionImpl();
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.SPORT, "100"));
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.SPORT, "101"));
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.SPORT, "102"));
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.NEWS, "103"));
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.NEWS, "104"));
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.NEWS, "105"));
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.MAGAZINE, "106"));
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.MAGAZINE, "107"));
        channelCollection.addChannel(new Channel(ChannelCategoryEnum.MAGAZINE, "108"));

        ChannelIterator sportChannelIterator = channelCollection.iterator(ChannelCategoryEnum.SPORT);
        ChannelIterator newsChannelIterator = channelCollection.iterator(ChannelCategoryEnum.NEWS);

        while (newsChannelIterator.hasNext()) {
            System.out.println("News chanels " + newsChannelIterator.next().toString());
        }

        while (sportChannelIterator.hasNext()) {
            System.out.println("Sport chanels " + sportChannelIterator.next().toString());
        }
    }
}
