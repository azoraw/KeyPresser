package com.company;

import java.awt.*;

public class Presser extends Thread {

    private final int keyEventToPress;
    private final int waitInMillis;

    public Presser(int keyEventToPress, int waitInMillis) {
        this.keyEventToPress = keyEventToPress;
        this.waitInMillis = waitInMillis;
    }

    @Override
    public void run() {
        Robot r = null;
        try {
            r = new Robot();
        } catch (AWTException ignore) {
        }
        while (true) {
            System.out.println("pressed: " + keyEventToPress);
            r.keyPress(keyEventToPress);
            r.keyRelease(keyEventToPress);
            try {
                Thread.sleep(waitInMillis);
            } catch (InterruptedException ignore) {
            }
        }
    }
}
