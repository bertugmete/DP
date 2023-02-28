package com.example.dp.command;

import lombok.ToString;

@ToString
public class OpenCommand implements TVCommand {
    private TVController tvController;

    public OpenCommand(TVController tvController) {
        this.tvController = tvController;
    }

    @Override
    public void execute() {
        if (this.tvController.getIsOpen()) {
            System.out.println("TV has already open");
        } else {
            this.tvController.setIsOpen(true);
        }
    }

    @Override
    public String toString() {
        return "OpenCommand{" +
                "tvController=" + tvController.getChannel() + " " + tvController.getVolume() +
                '}';
    }
}
