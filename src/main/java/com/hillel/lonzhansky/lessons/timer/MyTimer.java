package com.hillel.lonzhansky.lessons.timer;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        JLabel jLabelBreak = new JLabel();
        JLabel jLabel = new JLabel();

        jLabelBreak.setText("Break: ");

        jframe.setLayout(new FlowLayout());
        jframe.setTitle("Java Base");
        jframe.setBounds(500, 300, 400, 100);
        jframe.add(jLabelBreak);
        jframe.add(jLabel);
        jframe.setVisible(true);

        java.util.Timer timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            int seconds = 10 * 60;

            public void run() {
                jLabel.setText(
                        (seconds / 60 < 10
                                ? "0" + seconds / 60
                                : seconds / 60)
                                + ":"
                                + (seconds % 60 < 10
                                ? "0" + seconds % 60
                                : seconds % 60));
                seconds--;
                if (seconds < 0) {
                    timer.cancel();
                    jLabel.setText("Time Over");
                }
            }
        }, 0, 1000);
    }
}
