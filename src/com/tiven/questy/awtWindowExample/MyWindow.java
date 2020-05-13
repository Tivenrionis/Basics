package com.tiven.questy.awtWindowExample;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Michał Wesołowski
 * @version 1.0
 * Date: 22.04.2020
 * Time: 13:32
 * Class name: MyWindow
 * Description:
 */
public class MyWindow extends Frame {
    public MyWindow(String title) {
        super(title);
        setSize(500, 200);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosed(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif",Font.BOLD,18);
        Font sansSerifSmall = new Font("SansSerif",Font.ITALIC,12);
        g.setFont(sansSerifLarge);
        g.drawString("What are you looking for? ",100,100);
        g.setFont(sansSerifSmall);
        g.drawString("You lost bro?", 100, 120);
    }
}
