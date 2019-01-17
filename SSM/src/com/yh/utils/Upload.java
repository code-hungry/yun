package com.yh.utils;

import com.mysql.jdbc.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

public class Upload {

    public static String fileUpload(MultipartFile pictureFile, String targetPath) {
        //文件上传
        //获取原始图片的名称
        //判断文件是否 为空
        if (pictureFile != null) {
            String pname = pictureFile.getOriginalFilename();
            //判断原始名称是否为空
            if (!StringUtils.isNullOrEmpty(pname)) {
                //给文件起个新名字以防重名    截取文件的后缀名    可以将UUID中的-去掉toString().replace("-", "").toLowerCase();
                String newPname = UUID.randomUUID() + pname.substring(pname.lastIndexOf("."));
                //将内存中的数据写入磁盘
                try {
                    pictureFile.transferTo(new File(targetPath + newPname));
                    return newPname;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }else {
                return null;
            }
        } else {
            return null;
        }
    }
}
