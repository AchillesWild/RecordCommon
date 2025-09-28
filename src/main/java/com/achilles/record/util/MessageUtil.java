package com.achilles.record.util;

public class MessageUtil {

    public static String getCountLimitMessage(int count){
        return "该月份已记录" + count +  "笔, 达到上限, 无法再记录 ~";
    }

    public static String getImgCountLimitMessage(int count){
        return "该月份已上传" + count +  "张图片, 达到上限, 无法再上传图片 ~";
    }
}
