package com.corejava.chapter6.innerclasses.innerclass;

import com.corejava.chapter6.interfaces.timer.TimePrinter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;


public class InnerClassTest {

    public static void main(String[] args) {

        var clock = new TalkingClock(1000, true);
        clock.start();

        //keep the program running until the user clicks "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock {

    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimePrinter implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent event) {

            System.out.println("At the tone, the time is: " + Instant.ofEpochMilli(event.getWhen()));

            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
