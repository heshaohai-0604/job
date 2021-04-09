package com.springioc.ink;

import com.springioc.printer.Ink;

import java.awt.*;


public class GreyInk implements Ink {

    /**
     * @Author hsh
     * @Date 15:20 2021/4/8
     * @Param 
     * @return 
     * @Description //TODO 
     **/
    @Override
    public String getColor(int r, int g, int b) {
        int c = (r + g + b) / 3;
        Color color = new Color(c,c,c);
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }

}
