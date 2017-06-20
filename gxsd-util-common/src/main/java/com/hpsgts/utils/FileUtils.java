package com.hpsgts.utils;

import java.io.*;

/**
 * Created by Plain on 2017/6/19.
 */
public class FileUtils {
    /**
     * 进行文件上传
     * @param sourceFile 源文件
     * @param targetFile 目标文件
     */
    public static void copy(File sourceFile ,File targetFile){
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(sourceFile);
            out = new FileOutputStream(targetFile);
            byte[] bytes = new byte[1024];
            while ( in.read(bytes) >-1){
                out.write(bytes);
            }
            if ( in != null ){
                in.close();
            }
            if ( out != null){
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件流上传
     * @param in
     * @param targetFile
     */
    public static void  copy(InputStream in,File targetFile){
        OutputStream out = null;
        try {
            out = new FileOutputStream(targetFile);
            byte[] bytes = new byte[1024];
            while ( in.read(bytes) >-1){
                out.write(bytes);
            }
            if ( in != null ){
                in.close();
            }
            if ( out != null){
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
