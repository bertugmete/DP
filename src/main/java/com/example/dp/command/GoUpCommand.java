package com.example.dp.command;

import lombok.ToString;

@ToString
public class GoUpCommand implements TVCommand {
    private TVController tvController;

    public GoUpCommand(TVController tvController) {
        this.tvController = tvController;
    }

    @Override
    public void execute() {
        if (!this.tvController.getIsOpen()) {
            System.out.println("Channel cannot be changed, TV is off.");
        } else {
            this.tvController.setChannel(this.tvController.getChannel() + 1);
        }
    }
    @Override
    public String toString() {
        return "GoUpCommand{" +
                "tvController=" + tvController.getChannel() + " " + tvController.getVolume() +
                '}';
    }
}
