/**
 * 
 */
package com.jm.template.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author duansubramaniam
 *
 */

//@Component
//@ConfigurationProperties
//@PropertySource("classpath:template.properties")
public class TemplateProperties {
	
	@Value("{user.propertyValue")
	private String propertyValue;
	
	@Value("{user.propertyNo")
	private int propertyNo;

	/**
	 * @return the propertyValue
	 */
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * @param propertyValue the propertyValue to set
	 */
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	/**
	 * @return the propertyNo
	 */
	public int getPropertyNo() {
		return propertyNo;
	}

	/**
	 * @param propertyNo the propertyNo to set
	 */
	public void setPropertyNo(int propertyNo) {
		this.propertyNo = propertyNo;
	}
	
	

}
