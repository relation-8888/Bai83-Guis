package controller;

import model.MyColorModel;
import view.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {
    private MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equalsIgnoreCase("Red Text")) {
            this.myColorView.changTextColor(Color.RED);
        }else if(src.equalsIgnoreCase("Yellow Text")){
            this.myColorView.changTextColor(Color.YELLOW);
        }else if(src.equalsIgnoreCase("Green Text")){
            this.myColorView.changTextColor(Color.GREEN);
        }
    }
}
