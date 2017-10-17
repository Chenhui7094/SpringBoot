package com.birdsh.chen;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.usermodel.Range;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootWordApplicationTests {

	 @Test
	    public void testExportWord() throws Exception {
	        String tmpFile = "D:/temp/template.doc";
	        String expFile = "D:/temp/result.doc";
	        Map<String, String> datas = new HashMap<String, String>();
	        datas.put("title", "标题部份");
	        datas.put("content", "这里是内容，测试使用POI导出到Word的内容！");
	        datas.put("author", "知识林");
	        datas.put("url", "http://www.zslin.com");

	        build(new File(tmpFile), datas, expFile);
	    }

	    @Test
	    public void testExportWord2() throws Exception {
	        String tmpFile = "classpath:template.doc";
	        String expFile = "D:/temp/result.doc";
	        Map<String, String> datas = new HashMap<String, String>();
	        datas.put("title", "标题部份");
	        datas.put("content", "这里是内容，测试使用POI导出到Word的内容！");
	        datas.put("author", "知识林");
	        datas.put("url", "http://www.zslin.com");

	        build(ResourceUtils.getFile(tmpFile), datas, expFile);
	    }
	    
	    /**
	     * 导出word文件
	     * @param tmpFile 模板文件
	     * @param contentMap 数据模型，包含具体数据的map对象
	     * @param exportFile 需要保存导出文件的路径
	     * @throws Exception
	     */
	    private void build(File tmpFile, Map<String, String> contentMap, String exportFile) throws Exception {
	        FileInputStream tempFileInputStream = new FileInputStream(tmpFile);
	        HWPFDocument document = new HWPFDocument(tempFileInputStream);
	        // 读取文本内容
	        Range bodyRange = document.getRange();
	        // 替换内容
	        for (Map.Entry<String, String> entry : contentMap.entrySet()) {
	            bodyRange.replaceText("${" + entry.getKey() + "}", entry.getValue());
	        }

	        //导出到文件
	        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
	        document.write(byteArrayOutputStream);
	        OutputStream outputStream = new FileOutputStream(exportFile);
	        outputStream.write(byteArrayOutputStream.toByteArray());
	        outputStream.close();
	    }
	}
