package com.corejava.chapter6.innerclasses.anonymousInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class AnonymousInnerClassTest {

    public static void main(String[] args) {

        var clock = new TalkingClock();
        clock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock {

    public void start(int interval, boolean beep) {

        var listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is "
                + Instant.ofEpochMilli(e.getWhen()));

                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        var timer = new Timer(interval, listener);
        timer.start();
    }
}
