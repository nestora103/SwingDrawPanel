package ru.geekbrains.java1.dz.dz7.gubenkoDM;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import static java.awt.Color.*;

/**
 * Created by Nestor on 13.11.2016.
 */
public class PaintPanel extends JPanel {
    private int xCoord;
    private int yCoord;

    public Color getColor() {
        return color;
    }

    private int ovalXR;
    private int ovalYR;
    private Color color;
    private Random rand=new Random();
    private final int RADIUS=77;

    public void setColor(Color color) {
        this.color = color;
    }

    public int getxCoord() {
        return xCoord;

    }

    public int getyCoord() {
        return yCoord;
    }

    public int getovalXR() {
        return ovalXR;
    }

    public int getovalYR() {
        return ovalYR;
    }

    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public void setovalXR(int ovalXR) {
        this.ovalXR = ovalXR;
    }

    public void setovalYR(int ovalYR) {
        this.ovalYR = ovalYR;
    }

    public PaintPanel() {
        //сделаем рамку вокруг нашей замечательной панели. Передадим цвет и ширину
        setBorder(BorderFactory.createLineBorder(blue,3));
    }

    //метод прослушивания нажатия на панель мышкой
    public void listenMouseClick(){
       //добавили обработчик клика мыши для панели
       addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e) {
               int radius=rand.nextInt(RADIUS)+5;
               //установили координату x нажатия
               setxCoord(e.getX());
               //установили координату x нажатия
               setyCoord(e.getY());
               //выставляем радиусы элиппса чтоб получить окружность
               setovalXR(radius);
               setovalYR(radius);
               //выставляем цвет окружности
               setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
               //перерисовываем нашу панель
               repaint();
           }
       });
   }

    @Override
    protected void paintComponent(Graphics g) {
        //отрисовываем основу для панели
        super.paintComponent(g);
        //устанавливаем цвет для заполения фигуры
        g.setColor(getColor());
        //устанавливаем что за фигуру рисовать. В этом случае окружность
        g.fillOval(getxCoord(),getyCoord(),getovalXR(),getovalYR());
    }
}
