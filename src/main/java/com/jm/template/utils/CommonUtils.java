/**
 * 
 */
package com.jm.template.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author duansubramaniam
 *
 */
public class CommonUtils {
	
	public final static <T> List<T> iterableToList(Iterable<T> iterable) {
		  List<T> list = new ArrayList<>();
		  iterable.forEach(list::add);
		  return list;
		}
	
	public final static <T> T getModelFromJson(String payload, Class<T>  model) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(payload, model);
	}

}
