package com.example.dp.command;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
public class TVController {
    private Integer channel;
    private Integer volume;
    private Boolean isOpen;

    List<TVCommand> executedCommands = new ArrayList<>();

    List<TVCommand> tvCommands = new ArrayList<>();

    public TVController(Integer channel, Integer volume, Boolean isOpen) {
        this.channel = channel;
        this.volume = volume;
        this.isOpen = isOpen;
    }

    public void onButtonPressed() {
        if(!this.tvCommands.isEmpty()) {
            this.tvCommands.forEach(tvCommand -> {
                tvCommand.execute();
                System.out.println(tvCommand);
            });
        }
    }

    public void setCommands(TVCommand tvCommand) {
        tvCommands.add(tvCommand);
    }

    @Override
    public String toString() {
        return "TVController{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", isOpen=" + isOpen +
                ", tvCommands=" + tvCommands +
                '}';

    }
}
