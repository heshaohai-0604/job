package com.springioc.ink;

import com.springioc.printer.Ink;

import java.awt.*;

/**
 * @Author hsh
 * @Date 15:16 2021/4/8
 * @Param
 * @return
 * @Description //TODO
 **/
public class ColorInk implements Ink {

    @Override
    public String getColor(int r, int g, int b) {
        Color color = new Color(r,g,b);
        return "#" + Integer.toHexString(color.getRGB()).substring(2);
    }
}
