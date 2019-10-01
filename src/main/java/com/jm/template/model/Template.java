/**
 * 
 */
package com.jm.template.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author duansubramaniam
 *
 */
@Entity
public class Template {
	
	@Id
	private String templateId;
	private String name;
	private String description;
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
