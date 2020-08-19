package com.tuma.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
/**
 *  获得属�?�文件中的内容工具类
 *  
 *  @author flasiaa_zhou
 **/

public class PropertiesUtil {
	/**
	 * 	根据指定的属性文件名与key值，查找配置信息
	 * 
	 * @param fileName
	 * @param key
	 * @return String
	 */
	public static String getPropertiesValue(String fileName,String key){
		ResourceBundle resource = ResourceBundle.getBundle(fileName);
		return resource.getString(key);
	}
	/**
	 * 	根据key到项目根目录下查找文件名为config.properties的value
	 * 
	 * @param key
	 * @return
	 */
	public static String getConfigValue(String key){
		ResourceBundle resource = ResourceBundle.getBundle("config");
		return resource.getString(key);
	}
	/**
	 * 	把从config.properties中根据key获得的value以�?�号分隔后加入到Set集合中返�?
	 * 
	 * @param key
	 * @return
	 */
	public static List<String> getConfigValues(String key){
		List<String> carNums = new ArrayList<String>();
		String carNum = getConfigValue(key);
		carNums.addAll(Arrays.asList(carNum.split(",")));
		return carNums;
	}
	/**
	 * 	查找指定属�?�文件名中指定key值，返回value以�?�号分隔后加入到Set集合后的Set
	 * 
	 * @param fileName
	 * @param key
	 * @return
	 */
	public static List<String> getValues(String fileName,String key){
		List<String> values = new ArrayList<String>();
		String value = getPropertiesValue(fileName,key);
		values.addAll(Arrays.asList(value.split(",")));
		return values;
	}
	public static int getPageSize(){
		int s = 10;
		try{
			String size = getConfigValue("page-size");
			s = Integer.valueOf(size);
		}catch(Exception e){
			return s;
		}
		return s;
		
	}
	public static void main(String[] args){
		System.out.println(getConfigValues("department"));
	}
}
