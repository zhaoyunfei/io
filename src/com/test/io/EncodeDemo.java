package com.test.io;

/**
 * Created by yunfei on 2017-03-24.
 */
public class EncodeDemo {
    public static void main(String[] args) {
        String data = "百度ABC";
        byte[] bytes = data.getBytes();
        for (byte b:bytes){
            System.out.println(Integer.toHexString(b & 0xff) + " ");
        }
    }
}
