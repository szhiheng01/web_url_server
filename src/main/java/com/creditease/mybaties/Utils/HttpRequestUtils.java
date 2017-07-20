package com.creditease.mybaties.Utils;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

public class HttpRequestUtils {

	private static final Logger logger = Logger.getLogger(HttpClientBuilder.class);

	public static JSONObject httpRequestPost(String url, Object json,BasicHttpContext context) {
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);
		try {
			StringEntity stringEntity = new StringEntity(json.toString(), "UTF-8");
			stringEntity.setContentEncoding("UTF-8");
			stringEntity.setContentType("application/json");
			post.setEntity(stringEntity);
			HttpResponse res = httpClient.execute(post,context);
			logger.info("StatusCode = " + res.getStatusLine().getStatusCode());
			if (res.getStatusLine().getStatusCode() == 200 || res.getStatusLine().getStatusCode()==404) {
				logger.info("res.statusCode(" + res.getStatusLine().getStatusCode() + ")");
				HttpEntity entity = res.getEntity();
				String result = EntityUtils.toString(entity);
				return JSONObject.fromObject(result.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("请求失败。。。");
		}
		return null;
	}

	public static String httpStringPost(String url, Object json,BasicHttpContext context) {
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		HttpPost post = new HttpPost(url);
		try {
			StringEntity stringEntity = new StringEntity(json.toString(), "UTF-8");
			stringEntity.setContentEncoding("UTF-8");
			stringEntity.setContentType("application/json");
			post.setEntity(stringEntity);
			post.addHeader("Content-type", "text/xml");
			HttpResponse res = httpClient.execute(post,context);
			logger.info("StatusCode = " + res.getStatusLine().getStatusCode());
			if (res.getStatusLine().getStatusCode() == 200) {
				logger.info("res.statusCode(" + res.getStatusLine().getStatusCode() + ")");
				HttpEntity entity = res.getEntity();
				String result = EntityUtils.toString(entity);
				return result.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("请求失败。。。");
		}
		return null;
	}

}
