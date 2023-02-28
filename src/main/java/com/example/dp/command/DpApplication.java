package com.example.dp.command;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DpApplication.class, args);

        TVController tvController = new TVController(1, 10, false);

        TVCommand openTv = new OpenCommand(tvController);
        TVCommand closeTv = new ShutDownCommand(tvController);
        TVCommand goUpCommand = new GoUpCommand(tvController);
        TVCommand goDownCommand = new GoDownCommand(tvController);
        TVCommand volumeUpCommand = new VolumeUpCommand(tvController);
        TVCommand volumeDownCommand = new VolumeDownCommand(tvController);


        tvController.setCommands(openTv);
        tvController.setCommands(goUpCommand);
        tvController.setCommands(goUpCommand);
        tvController.setCommands(goUpCommand);
        tvController.setCommands(goUpCommand);
        tvController.setCommands(volumeUpCommand);
        tvController.setCommands(volumeUpCommand);
        tvController.setCommands(volumeUpCommand);
        tvController.setCommands(goDownCommand);
        tvController.setCommands(volumeUpCommand);
        tvController.setCommands(volumeDownCommand);
        tvController.setCommands(volumeDownCommand);
        tvController.setCommands(volumeDownCommand);

        tvController.onButtonPressed();
        System.out.println(tvController.getExecutedCommands());

    }


    @PostConstruct
    public void init() {
    }
}
