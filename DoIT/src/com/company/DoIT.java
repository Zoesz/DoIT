package com.company;

import java.awt.*;
import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DoIT {

    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        try {
            try {
                System.out.println("Start..." + new Date());
                // delay 50 seconds
                TimeUnit.SECONDS.sleep(50);
                System.out.println("End..." + new Date());
            } catch (InterruptedException e) {
                System.err.format("IOException: %s%n", e);
            }
            //set the running exe file name
            rt.exec("taskkill /F /IM chrome.exe");
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
//it will open the program, if it is open it won't open
        File file = new File("C:/Program Files/JetBrains/IntelliJ IDEA 2018.1.2/bin/idea64.exe");
        try {
            Desktop.getDesktop().open(file);
        } catch (java.io.IOException e) {
            System.out.println(e);
        }
    }
}


