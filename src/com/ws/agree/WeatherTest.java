package com.ws.agree;

import cn.com.WebXml.ArrayOfString;
import cn.com.WebXml.WeatherWebService;
import cn.com.WebXml.WeatherWebServiceSoap;

public class WeatherTest {

	public static void main(String[] args) {
		 WeatherWebService weatherWebService = new WeatherWebService();
		 WeatherWebServiceSoap soap = weatherWebService.getWeatherWebServiceSoap();
		 System.out.println("---------------------");
		 //某地区的城市
		 ArrayOfString aos = soap.getSupportCity("重庆");
		 for (String city : aos.getString()) {
			System.out.println(city);
		}
	}

}
