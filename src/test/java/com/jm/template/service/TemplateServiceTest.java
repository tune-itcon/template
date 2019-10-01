package com.jm.template.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.jm.template.dao.TemplateDataCategoryRepository;
import com.jm.template.dao.TemplateRepository;
import com.jm.template.model.Template;
import com.jm.template.model.TemplateDataCategory;

public class TemplateServiceTest {

	@Mock
	TemplateRepository templateRepository;
	
	@Mock
	TemplateDataCategoryRepository templateDataCategoryRepository;
	
	@InjectMocks
	TemplateService tempateService;
	
	String templateId="1";
	String templateName="testTemplateName";
	Long processTypeId = Long.valueOf(1);
	
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		Template jmTemplate = new Template();
		jmTemplate.setTemplateId(templateId);
		jmTemplate.setName(templateName);
		
		TemplateDataCategory templateDataCategory = new TemplateDataCategory(1l,"Person");
		List<TemplateDataCategory> categories = new ArrayList<TemplateDataCategory>();
		categories.add(templateDataCategory);
		
		when(templateRepository.findById(templateId)).thenReturn(Optional.of(jmTemplate));
		//when(templateDataCategoryRepository.findByProcessType(processTypeId)).thenReturn(categories);
	}

	

	
	@Test
	public void getTemplate() {
		
		
		Optional<Template> jmTemplate = tempateService.getTemplate(templateId);
		
		assertNotNull(jmTemplate);
		assertEquals(templateId, jmTemplate.get().getTemplateId());
		assertEquals(templateName, jmTemplate.get().getName());
	}
	
	/*@Test
	public void getTemplateDataCategories() {
		List<TemplateDataCategory> categories = tempateService.getTemplateDataCategories(processTypeId);
		
		assertNotNull(categories);
		assertEquals(1, categories.size());
		assertEquals("Person", categories.get(0).getName());
	}*/

}
