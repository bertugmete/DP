package com.example.dp.command;

import lombok.ToString;


public class GoDownCommand implements TVCommand {
    private TVController tvController;

    public GoDownCommand(TVController tvController) {
        this.tvController = tvController;
    }



    @Override
    public void execute() {
        if (!this.tvController.getIsOpen()) {
            System.out.println("Channel cannot be changed, TV is off.");
        } else if (this.tvController.getChannel() < 2) {
            System.out.println("Channel cannot be changed, Current volume is 0.");
        } else {
            this.tvController.setChannel(this.tvController.getChannel() - 1);
        }
    }

    @Override
    public String toString() {
        return "GoDownCommand{" +
                "tvController=" + tvController.getChannel() + " " + tvController.getVolume() +
                '}';
    }
}
