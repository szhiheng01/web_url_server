package com.thrift.mybaties.Utils;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.InputStream;

public class Utils {

	private static final Logger logger = Logger.getLogger(Utils.class);
	private static InputStream inputStream;

	public static JSONObject readExcelJxl(String fileName,int set) throws Exception {
		JSONObject json = new JSONObject();
		inputStream = new FileInputStream(fileName);
		Workbook workbook = Workbook.getWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(set);
		for (int i = 1; i < sheet.getRows(); i++) {
			Cell cellKey = sheet.getCell(0, i);
			for (int j = 0; j < sheet.getColumns(); j++) {
				Cell cellValue = sheet.getCell(j, i);
				if (cellValue.getContents() == null) {
					json.put(cellKey.getContents(), "");
				}
				json.put(cellKey.getContents(), cellValue.getContents());
			}
		}
		return json;
	}

	public static JSONObject formatJson(String json){

		if(StringUtils.isBlank(json)){
			logger.info("字符串为空。。。。。");
			return null;
		}
		JSONObject jsonObject = JSONObject.fromObject(json);
		return jsonObject;
	}


}
