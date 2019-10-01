package com.jm.template;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jm.template.model.Template;
import com.jm.template.service.TemplateService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class TemplateApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	TemplateService templateService;
	
	String templateId = "1";
	String templateName = "testTemplateName";
	
	
	@Before
	public void Setup() {
		Template template = new Template();
		template.setName(templateName);
		template.setTemplateId(templateId);
		when(templateService.getTemplate(templateId)).thenReturn(Optional.of(template));
	}
	
	
	
	@Test
	public void contextLoads() throws Exception {
		
		
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/getTemplate?templateId=" + templateId).accept(MediaType.APPLICATION_JSON)).andReturn();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Template jmTemplate = objectMapper.readValue(mvcResult.getResponse().getContentAsString(), Template.class);
	
		assertNotNull(jmTemplate);
		assertEquals(templateId, jmTemplate.getTemplateId());
		assertEquals(templateName, jmTemplate.getName());
	}

}
