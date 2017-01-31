package ru.geekbrains.java1.dz.dz7.gubenkoDM;

import java.util.Scanner;

/**
 * Created by Nestor on 13.11.2016.
 */
public class GUIStarter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=" \"Разноцветные кружочки\"";
        System.out.println("Привет!Вас приветствует программа".concat(title).concat("=)"));
        //System.out.println("Введите название окна!");
        //String title=sc.nextLine();
        System.out.println("Введите ширину и высоту окна в пикселах через пробел!");
        int width=Integer.parseInt(sc.next());
        int height=Integer.parseInt(sc.next());
        GUIWindow gw=new GUIWindow(title,width,height);
        //отрисовали окно как нам надо
        gw.draw();
        //показали окно пользователю
        gw.setVisible(true);
    }
}
