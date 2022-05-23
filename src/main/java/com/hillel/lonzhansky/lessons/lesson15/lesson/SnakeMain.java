package com.hillel.lonzhansky.lessons.lesson15.lesson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;

public class SnakeMain extends JPanel implements ActionListener {

    public static JFrame jFrame;

    public static int speed = 10;

    Snake snake = new Snake(5, 6, 5, 5);
    Apple apple = new Apple(Math.abs((int) (Math.random() * SnakeMain.WIDTH - 1)), Math.abs((int) (Math.random() * SnakeMain.HEIGHT - 1)));
    Timer timer = new Timer(1000 / speed, this);

    public static final int SCALE = 32;
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;

    public SnakeMain() {
        timer.start();
        addKeyListener(new KeyBoard());
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {

//        Graphics2D g2 = (Graphics2D) g;
//        g2.setStroke(new BasicStroke(2));

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);

        for (int x = 0; x < WIDTH * SCALE; x += SCALE) {
            g.setColor(Color.BLACK);
//            g2.draw(new Line2D.Float(x, 0, x, HEIGHT * SCALE));
            g.drawLine(x, 0, x, HEIGHT * SCALE);
        }

        for (int y = 0; y < HEIGHT * SCALE; y += SCALE) {
            g.setColor(Color.BLACK);
//            g2.draw(new Line2D.Float(0, y, WIDTH * SCALE, y));
            g.drawLine(0, y, WIDTH * SCALE, y);
        }

        g.setColor(Color.RED);
        g.fillOval(apple.posX * SCALE + 4, apple.posY * SCALE + 4, SCALE - 8, SCALE - 8);

        for (int i = 0; i < snake.length; i++) {
            g.setColor(Color.GREEN);
            g.fillRect(snake.snakeX[i] * SCALE + 2, snake.snakeY[i] * SCALE + 2, SCALE - 3, SCALE - 3);

            g.setColor(Color.GRAY);
            g.fillRect(snake.snakeX[0] * SCALE + 2, snake.snakeY[0] * SCALE + 2, SCALE - 3, SCALE - 3);
        }


    }

    public static void main(String[] args) {
        jFrame = new JFrame("Snake");

        jFrame.setSize(WIDTH * SCALE, HEIGHT * SCALE + 30);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jFrame.setResizable(false);

        jFrame.setLocationRelativeTo(null);

        jFrame.add(new SnakeMain());

        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        snake.move();

        if ((snake.snakeX[0] == apple.posX) && (snake.snakeY[0] == apple.posY)) {
            apple.setRandomPosition();
            snake.length++;
        }

        for (int i = 1; i < snake.length; i++) {
            if ((snake.snakeX[i] == apple.posX) && (snake.snakeY[i] == apple.posY)) {
                apple.setRandomPosition();
            }

            if ((snake.snakeX[0] == snake.snakeX[i]) && (snake.snakeY[0] == snake.snakeY[i])) {
                timer.stop();

                int opt = JOptionPane.showConfirmDialog(null, "Вы проиграли, начать заново", "", JOptionPane.YES_NO_OPTION);
                if (opt == 0) {
                    jFrame.setVisible(false);
                    snake.length = 2;
                    snake.direction = 0;
                    apple.setRandomPosition();
                    jFrame.setVisible(true);
                    timer.start();
                } else {
                    System.exit(0);
                }

            }
        }



        repaint();
    }

    public class KeyBoard extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_UP) && (snake.direction != 2)) {
                snake.direction = 0;
            }
            if ((key == KeyEvent.VK_DOWN) && (snake.direction != 0)) {
                snake.direction = 2;
            }
            if ((key == KeyEvent.VK_LEFT) && (snake.direction != 1)) {
                snake.direction = 3;
            }
            if ((key == KeyEvent.VK_RIGHT) && (snake.direction != 3)) {
                snake.direction = 1;
            }
        }
    }

}
