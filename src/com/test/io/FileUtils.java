package com.test.io;

import java.io.File;

/**
 * Created by yunfei on 2017-03-24.
 */
public class FileUtils {
    /**
     * 列出目录下的所有文件
     * @param dir
     */
    public static void listDirectory(File dir){
        if(!dir.exists()){
            throw new IllegalArgumentException("目录：" + dir + "不存在");
        }
        if(!dir.isDirectory()){
            throw new IllegalArgumentException(dir + "不是目录");
        }
        /*String[] fileNames = dir.list();
        for (String fileName:fileNames){
            System.out.println(fileName);
        }*/

        File[] files = dir.listFiles();
        if(files!=null && files.length>0){
            for (File file:files){
                if(file.isDirectory()){
                    listDirectory(file);
                }else {
                    System.out.println(file);
                }
            }
        }
    }

    public static void main(String[] args) {
        listDirectory(new File("E:\\workspace\\test"));
    }
}
