/**
 * 
 */
package com.jm.template.utils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

/**
 * @author duansubramaniam
 *
 */
public class TemplatePropertiesTest {
	
	@InjectMocks
	TemplateProperties templateProperties;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		String propValue = templateProperties.getPropertyValue();
		int propNo = templateProperties.getPropertyNo();
		
		//assertEquals("thisuser", propValue);
		//assertEquals(10, propNo);
	}

}
