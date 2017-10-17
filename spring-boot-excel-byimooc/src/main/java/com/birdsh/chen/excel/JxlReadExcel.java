package com.birdsh.chen.excel;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class JxlReadExcel {

	/**
	 * JXL解析Excel
	 * 
	 * @author David
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// 创建workbook
			Workbook workbook = Workbook.getWorkbook(new File("e:/jxl_test.xls"));
			// 获取第一个工作表sheet
			Sheet sheet = workbook.getSheet(0);
			// 获取数据
			for (int i = 0; i < sheet.getRows(); i++) {
				//列数
				for (int j = 0; j < sheet.getColumns(); j++) {
					//得到第j列i行的内容
					Cell cell = sheet.getCell(j, i);
					System.out.print(cell.getContents() + "  ");
				}
				System.out.println();
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
