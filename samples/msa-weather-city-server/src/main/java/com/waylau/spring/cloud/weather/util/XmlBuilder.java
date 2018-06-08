
package com.waylau.spring.cloud.weather.util;

import java.io.Reader;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 * XML 工具.
 * 
 * @since 1.0.0 2017年10月24日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class XmlBuilder {
	/**
	 * 将XML字符串转换为指定类型的POJO
	 * 
	 * @param clazz
	 * @param xmlStr
	 * @return
	 * @throws Exception
	 */
	public static Object xmlStrToObject(Class<?> clazz, String xmlStr) throws Exception {
		Object xmlObject = null;
		Reader reader = null;

		JAXBContext context = JAXBContext.newInstance(clazz);

		// 进行将Xml转成对象的核心接口
		Unmarshaller unmarshaller = context.createUnmarshaller();

		reader = new StringReader(xmlStr);
		xmlObject = unmarshaller.unmarshal(reader);

		if (null != reader) {
			reader.close();
		}

		return xmlObject;
	}
}
