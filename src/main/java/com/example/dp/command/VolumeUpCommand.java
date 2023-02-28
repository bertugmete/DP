package com.example.dp.command;

import lombok.ToString;

@ToString
public class VolumeUpCommand implements TVCommand {
    private TVController tvController;

    public VolumeUpCommand(TVController tvController) {
        this.tvController = tvController;
    }

    @Override
    public void execute() {
        if (!this.tvController.getIsOpen()) {
            System.out.println("Volume cannot be changed, TV is off.");
        } else {
            this.tvController.setVolume(this.tvController.getVolume() + 1);
        }
    }

    @Override
    public String toString() {
        return "VolumeUpCommand{" +
                "tvController=" + tvController.getChannel() + " " + tvController.getVolume() +
                '}';
    }
}
