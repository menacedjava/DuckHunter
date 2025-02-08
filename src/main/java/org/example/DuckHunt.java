package org.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


public class DuckHunt extends JPanel implements ActionListener, MouseListener {

//    private static final int WIDTH = 800;
//    private static final int HEIGHT = 600;
//    private static final int DUCK_SIZE = 50;
//    private int duckX, duckY;
//    private int duckVelocityX, duckVelocityY;
//    private int score = 0;
//    private boolean duckShot = false;
//    private Timer timer;
//    private Random random = new Random();

//    public DuckHunt() {
//        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
//        this.setBackground(Color.CYAN);
//        this.addMouseListener(this);
//
//        spawnDuck();
//
//        timer = new Timer(20, this);
//        timer.start();
//    }

//    private void spawnDuck() {
//        duckX = random.nextInt(WIDTH - DUCK_SIZE);
//        duckY = random.nextInt(HEIGHT / 2);
//        duckVelocityX = random.nextInt(4) + 2;
//        duckVelocityY = random.nextInt(3) - 1;
//        duckShot = false;
//    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // Skorni chizish
//        g.setColor(Color.BLACK);
//        g.setFont(new Font("Arial", Font.BOLD, 20));
//        g.drawString("Score: " + score, 20, 30);
//
//        // Ördakni chizish
//        if (!duckShot) {
//            g.setColor(Color.RED);
//            g.fillOval(duckX, duckY, DUCK_SIZE, DUCK_SIZE);
//        } else {
//            g.setColor(Color.BLACK);
//            g.drawString("Hit!", duckX + 10, duckY + 25);
//        }
//    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (!duckShot) {
//            duckX += duckVelocityX;
//            duckY += duckVelocityY;
//
//            // Chegaralarni tekshirish va yo'nalishni o'zgartirish
//            if (duckX < 0 || duckX > WIDTH - DUCK_SIZE) {
//                duckVelocityX *= -1;
//            }
//            if (duckY < 0 || duckY > HEIGHT / 2) {
//                duckVelocityY *= -1;
//            }
//        } else {
//            spawnDuck();
//        }
//
//        repaint();
//    }

//    @Override
//    public void mousePressed(MouseEvent e) {
//        int mouseX = e.getX();
//        int mouseY = e.getY();
//
//        if (!duckShot && mouseX >= duckX && mouseX <= duckX + DUCK_SIZE && mouseY >= duckY && mouseY <= duckY + DUCK_SIZE) {
//            duckShot = true;
//            score++;
//        }
//    }

//    @Override
//    public void mouseReleased(MouseEvent e) {
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//    }
//
//    @Override
//    public void mouseClicked(MouseEvent e) {
//    }

//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Duck Hunt");
//        DuckHunt game = new DuckHunt();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(game);
//        frame.pack();
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
}