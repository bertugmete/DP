package com.example.dp.command;

import lombok.ToString;

@ToString
public class ShutDownCommand implements TVCommand {
    private TVController tvController;

    public ShutDownCommand(TVController tvController) {
        this.tvController = tvController;
    }

    @Override
    public void execute() {
        if (!this.tvController.getIsOpen()) {
            System.out.println("TV has already closed");
        } else {
            this.tvController.setVolume(0);
            this.tvController.setChannel(0);
            this.tvController.setIsOpen(false);
        }
    }

    @Override
    public String toString() {
        return "ShutDownCommand{" +
                "tvController=" + tvController.getChannel() + " " + tvController.getVolume() +
                '}';
    }
}
