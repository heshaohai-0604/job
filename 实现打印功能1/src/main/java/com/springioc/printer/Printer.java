package com.springioc.printer;


/**
 * @Author hsh
 * @Date 15:19 2021/4/8
 * @Param
 * @return
 * @Description //TODO
 **/
public class Printer {
    //面向接口编程，而不是具体实现类
    private Paper paper;
    private Ink ink;




    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }


    public void print(String str){

        String s = "hello world!";


        //输出颜色标记
        System.out.println("使用" + ink.getColor(255,200,0) + "颜色打印:\n");
        //逐字符输出到纸张
        for(int i = 0; i < str.length(); ++i){
            paper.putInChar(str.charAt(i));
        }

        //将纸张的内容输出
        System.out.println(paper.getContext());
    }

}
