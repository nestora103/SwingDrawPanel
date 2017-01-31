package ru.geekbrains.java1.dz.dz7.gubenkoDM;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Nestor on 13.11.2016.
 */
public class GUIWindow extends JFrame {
    private String title;
    private int width;
    private int height;

    @Override
    public String getTitle() {
        return title;
    }

    public GUIWindow(String title,int width,int height) throws HeadlessException {
        //проверять данные не будем.
        this.title=title;
        this.width=width;
        this.height=height;
    }

    public void draw(){
        //установили название окна.
        setTitle(title);
        //установили что после закрытия окна програ должна закорнчить работу
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //запретили масштабировать окно
        setResizable(false);
        //установили красный цвет
        //setBackground(red);
        //расположен окна в центре экрана
        setLocationRelativeTo(null);
        //устанавливаем размер экрана в пикселях
        setSize(width,height);
        //наше окошко всегда выше всех
        setAlwaysOnTop(true);
        // установка компоновщика элементов BorderLayout
        setLayout(new BorderLayout());
        //создаем панель для рисования
        PaintPanel pPanel=new PaintPanel();
        //panel.setBackground(red);
        //добавлям нашу панель на окно
        add(pPanel,BorderLayout.CENTER);
        //подгоняем окно под контент
        //pack();

        //обработаем клик мыши на панели
        pPanel.listenMouseClick();
    }
}
