/**
 * 
 */
package com.jm.template.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jm.template.model.JmResponse;
import com.jm.template.model.Template;
import com.jm.template.model.TemplateDataCategory;
import com.jm.template.service.TemplateService;

import static com.jm.template.utils.CommonUtils.getModelFromJson;



/**
 * @author duansubramaniam
 *
 */

@RestController
public class TemplateController {
	private static final Logger log = LoggerFactory.getLogger(TemplateController.class);
	
	@Autowired
	private TemplateService templateService;
	
	//@Autowired
	//private TemplateProperties templateProperties;
	
	@RequestMapping(value="/getTemplate", method = RequestMethod.GET)
	public Template getTemplate(@RequestParam String templateId) {
		Optional<Template> jmTemplate = templateService.getTemplate(templateId);
		//log.debug("props: " + templateProperties.getPropertyValue());
		return jmTemplate.get();
	}
	
	@RequestMapping(value="getAllTemplateCategories", method = RequestMethod.GET)
	public List<TemplateDataCategory> getAllTemplateCategories(){
		List<TemplateDataCategory> categories = templateService.getTemplateDataCategories();
		
		return categories;
	}
	
	@RequestMapping(value = "insertTemplateDataCategory", method = RequestMethod.POST)
	public JmResponse<TemplateDataCategory> insertTemplateDataCategory(@RequestBody String payload) throws JsonParseException, JsonMappingException, IOException{
		TemplateDataCategory category = getModelFromJson(payload, TemplateDataCategory.class);
		TemplateDataCategory resultCategory = templateService.insertTemplateDataCategory(category);
		
		JmResponse<TemplateDataCategory> response = new JmResponse<TemplateDataCategory>(resultCategory);
		response.setStatus(JmResponse.SUCCESS_STATUS);
		return response;
	}
	
}
