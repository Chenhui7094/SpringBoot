package com.birdsh.chen.utils;

import org.springframework.util.ResourceUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName: TemplateFileUtil.java 
 * @Description:获取模板文件的工具类
 * @author chenhuihui
 * @time 2017年10月17日下午2:24:56
 */
public class TemplateFileUtil {

    public static FileInputStream getTemplates(String tempName) throws FileNotFoundException {
        return new FileInputStream(ResourceUtils.getFile("classpath:templates/"+tempName));
    }
}
