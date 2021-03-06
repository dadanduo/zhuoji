/**  
 * Project Name:Android_Car_Example  
 * File Name:PositionEntity.java  
 * Package Name:com.amap.api.car.example  
 * Date:2015年4月3日上午9:50:28  
 *  
 */

package com.xiaomishengtaiquan.ScottMap;

/**
 * ClassName:PositionEntity <br/>
 * Function: 封装的关于位置的实体 <br/>
 * Date: 2018年4月2日 上午9:50:28 <br/>
 * 
 * @author dada.chen
 * @version
 * @since JDK 1.8
 * @see
 */
public class PositionEntity {

	public double latitue;

	public double longitude;

	public String address;
	
	public String city;

	public PositionEntity() {
	}

	public PositionEntity(double latitude, double longtitude, String address, String city) {
		this.latitue = latitude;
		this.longitude = longtitude;
		this.address = address;
		this.city = city;
	}

}
