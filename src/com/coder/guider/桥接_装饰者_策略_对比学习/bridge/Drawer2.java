package com.coder.guider.桥接_装饰者_策略_对比学习.bridge;

/**
 * Created by apple on 16/9/7.
 */
public class Drawer2 implements Drawing {

    PaintB b;
    public Drawer2() {
        b= new PaintB();
    }

    @Override
    public void drawRantanle() {
        b.drawRantanle();
    }

    @Override
    public void drawCircle() {
        b.drawCircle();
    }



}
