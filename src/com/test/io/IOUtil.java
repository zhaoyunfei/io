package com.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by yunfei on 2017-03-27.
 */
public class IOUtil {
    public static void printHex(String fileName){
        try {
            FileInputStream in = new FileInputStream(fileName);
            int b;
            int i = 1;
            while ((b = in.read())!=-1){
                if(b<=0xf){
                    System.out.println("0");
                }
                System.out.print(Integer.toHexString(b)+" ");
                if(i++%10==0){
                    System.out.println();
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void pringHexByByteArray(String fileName){
        try {
            FileInputStream in = new FileInputStream(fileName);
            byte[] buff = new byte[20*1024];
            int bytes = in.read(buff,0,buff.length);
            for (int i = 0;i<bytes;i++){
                if(buff[i]<0xf){
                    System.out.print("0");
                }
                System.out.print(Integer.toHexString(buff[i])+" ");
                if(i++%10==0){
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
