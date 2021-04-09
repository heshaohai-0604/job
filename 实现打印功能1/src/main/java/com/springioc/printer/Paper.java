package com.springioc.printer;

/**
 * @Author hsh
 * @Date 15:20 2021/4/8
 * @Param 
 * @return 
 * @Description //TODO 
 **/
public interface Paper {
    public static final String newline = "\r\n";

    
    void putInChar(char c);


    
     String getContext();


}
