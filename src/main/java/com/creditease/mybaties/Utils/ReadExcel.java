package com.creditease.mybaties.Utils;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExcel {
	
	private static final Logger logger = Logger.getLogger(ReadExcel.class);
	
	public static JSONArray readExcel(String fileName, int sheet) {
		JSONObject json = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		try {
			InputStream inputStream = new FileInputStream(fileName);
			Workbook workbook = Workbook.getWorkbook(inputStream);
			Sheet readSheet = workbook.getSheet(sheet);
			int countRow = readSheet.getRows();
			int countLie = readSheet.getColumns();
			for (int j = 1; j < countLie; j++) {
				for (int k = 0; k < countRow; k++) {
					Cell cell = readSheet.getCell(0, k);
					Cell cellValue = readSheet.getCell(j, k);
					json.put(cell.getContents(), cellValue.getContents());
				}
				jsonArray.add(json);
			}
			return jsonArray;
		} catch (Exception e) {
			logger.info("读取文件失败。。。。。。。。");
			return null;
		}
	}
	
	public static JSONArray readExcelCase(String fileName,String key) {
		
		JSONArray arrayJson = new JSONArray();
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();

		try {
			InputStream inputStream = classloader.getResourceAsStream(fileName);
			Workbook workbook = Workbook.getWorkbook(inputStream);
			int sheet = workbook.getSheets().length;
			for (int i = 0; i < sheet; i++) {
				Sheet readSheet = workbook.getSheet(i);
				int countRow = readSheet.getRows();
				int countLie = readSheet.getColumns();
				JSONArray jsonArray = new JSONArray();
				JSONObject json = new JSONObject();
				for (int j = 1; j < countLie; j++) {
					for (int k = 0; k < countRow; k++) {
						Cell cell = readSheet.getCell(0, k);
						Cell cellValue = readSheet.getCell(j, k);
						if (!cell.getContents().equals(key)){
							if (cellValue.getContents() == null){
								json.put(cell.getContents(), "");
							}else {
								json.put(cell.getContents(), cellValue.getContents());
							}
						}else {
							JSONArray jsonArr = new JSONArray();
							json.put(cell.getContents(),jsonArr);
							
						}
					}
					jsonArray.add(json);
				}
				arrayJson.add(jsonArray);
			}
			return arrayJson;
		} catch (Exception e) {
			logger.info("读取文件失败。。。。。。。。");
			return null;
		}
	}
	
	
	
}
