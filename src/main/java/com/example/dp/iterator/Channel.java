package com.example.dp.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Channel {
    private ChannelCategoryEnum type;
    private String frequency;
}
