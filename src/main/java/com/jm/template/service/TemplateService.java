/**
 * 
 */
package com.jm.template.service;

import static com.jm.template.utils.CommonUtils.iterableToList;
import static com.jm.template.utils.CommonUtils.getModelFromJson;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jm.template.dao.TemplateDataCategoryRepository;
import com.jm.template.dao.TemplateRepository;
import com.jm.template.model.Template;
import com.jm.template.model.TemplateDataCategory;
/**
 * @author duansubramaniam
 *
 */

@Service
public class TemplateService {
	private static final Logger log = LoggerFactory.getLogger(TemplateService.class);
	
	@Autowired
	private TemplateRepository templateRepository;
	
	@Autowired
	private TemplateDataCategoryRepository templateDataCategoryRepository;
	
	public Optional<Template> getTemplate(String templateId) {
		Optional<Template> jmTemplate = templateRepository.findById(templateId);
		return jmTemplate;
	}
	
	/*public List<TemplateDataCategory> getTemplateDataCategories(Long processTypeId){
		List<TemplateDataCategory> categories = templateDataCategoryRepository.findByProcessType(processTypeId);
		
		return categories;
	}*/
	
	public List<TemplateDataCategory> getTemplateDataCategories(){
		Iterable<TemplateDataCategory> itCategories = templateDataCategoryRepository.findAll();
		
		List<TemplateDataCategory> categories = iterableToList(itCategories);
		
		return categories;
	} 
	
	public TemplateDataCategory insertTemplateDataCategory(TemplateDataCategory category) {
		TemplateDataCategory resCategory = templateDataCategoryRepository.save(category);
		return resCategory;
	}
	
	
	
	
}
