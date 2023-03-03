package model;

import java.awt.*;

public class MyColorModel {
    private Color mauChu;
    private Color mauNen;
    private boolean mauVien;

    public MyColorModel() {
        this.mauChu = Color.BLACK;
        this.mauNen = Color.WHITE;
        this.mauVien = true;
    }

    public Color getMauChu() {
        return mauChu;
    }

    public void setMauChu(Color mauChu) {
        this.mauChu = mauChu;
    }

    public Color getMauNen() {
        return mauNen;
    }

    public void setMauNen(Color mauNen) {
        this.mauNen = mauNen;
    }

    public boolean isMauVien() {
        return mauVien;
    }

    public void setMauVien(boolean mauVien) {
        this.mauVien = mauVien;
    }
}
