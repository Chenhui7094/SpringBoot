package com.birdsh.chen.excel;

import java.io.File;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 * @ClassName: JxlExpExcel.java 
 * @Description:JXL创建Excel文件
 * @author chenhuihui
 * @time 2017年10月17日下午3:22:38
 */
public class JxlExpExcel {

	public static void main(String[] args) {
		String[] title = {"id","name","sex"};
		//创建Excel文件
		File file = new File("e:/jxl_test.xls");
		try {
			file.createNewFile();
			//创建工作簿
			WritableWorkbook workbook = Workbook.createWorkbook(file);
			//创建sheet
			WritableSheet sheet = workbook.createSheet("sheet1", 0);
			Label label = null;
			//第一行设置列名
			for (int i = 0; i < title.length; i++) {
				label = new Label(i,0,title[i]);
				sheet.addCell(label);	
			}
			//追加数据i表示行   0、1、2表示列
			for (int i = 1; i < 10; i++) {
				label = new Label(0,i,"a" + 1);
				sheet.addCell(label);
				label = new Label(1,i,"user" + i);
				sheet.addCell(label);
				label = new Label(2,i,"男");
				sheet.addCell(label);
			}
			//写入数据
			workbook.write();
			workbook.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
