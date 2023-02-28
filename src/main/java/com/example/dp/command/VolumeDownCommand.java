package com.example.dp.command;

import lombok.ToString;

@ToString
public class VolumeDownCommand implements TVCommand {
    private TVController tvController;

    public VolumeDownCommand(TVController tvController) {
        this.tvController = tvController;
    }

    @Override
    public void execute() {
        if (!this.tvController.getIsOpen()) {
            System.out.println("Volume cannot be changed, TV is off.");
        } else if (this.tvController.getVolume() < 2) {
            System.out.println("Volume cannot be changed, Current volume is 0.");
        } else {
            this.tvController.setVolume(this.tvController.getVolume() + 1);
        }
    }

    @Override
    public String toString() {
        return "VolumeDownCommand{" +
                "tvController=" + tvController.getChannel() + " " + tvController.getVolume() +
                '}';
    }
}
