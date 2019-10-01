/**
 * 
 */
package com.jm.template.model;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 * @author duansubramaniam
 *
 */

@Entity(name = "TemplateDataCategoryLink")
@Table(name = "template_data_category_link")
public class TemplateDataCategoryLink {
	
	@EmbeddedId
    private TemplateDataCateoryId templateDataCateoryId;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("dataId")
    private TemplateData templateData;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("categoryId")
    private TemplateDataCategory templateDataCategory;
 

	
	/**
	 * 
	 */
	public TemplateDataCategoryLink() {
		super();
	}



	/**
	 * @param templateDataCateoryId
	 * @param templateData
	 * @param templateDataCategory
	 */
	public TemplateDataCategoryLink(TemplateDataCateoryId templateDataCateoryId, TemplateData templateData,
			TemplateDataCategory templateDataCategory) {
		this.templateDataCateoryId = templateDataCateoryId;
		this.templateData = templateData;
		this.templateDataCategory = templateDataCategory;
	}



	@Override
	public int hashCode() {
		return Objects.hash(templateData, templateDataCategory, templateDataCateoryId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemplateDataCategoryLink other = (TemplateDataCategoryLink) obj;
		return Objects.equals(templateData, other.templateData)
				&& Objects.equals(templateDataCategory, other.templateDataCategory)
				&& Objects.equals(templateDataCateoryId, other.templateDataCateoryId);
	}



	/**
	 * @return the templateDataCateoryId
	 */
	public TemplateDataCateoryId getTemplateDataCateoryId() {
		return templateDataCateoryId;
	}



	/**
	 * @param templateDataCateoryId the templateDataCateoryId to set
	 */
	public void setTemplateDataCateoryId(TemplateDataCateoryId templateDataCateoryId) {
		this.templateDataCateoryId = templateDataCateoryId;
	}



	/**
	 * @return the templateData
	 */
	public TemplateData getTemplateData() {
		return templateData;
	}



	/**
	 * @param templateData the templateData to set
	 */
	public void setTemplateData(TemplateData templateData) {
		this.templateData = templateData;
	}



	/**
	 * @return the templateDataCategory
	 */
	public TemplateDataCategory getTemplateDataCategory() {
		return templateDataCategory;
	}



	/**
	 * @param templateDataCategory the templateDataCategory to set
	 */
	public void setTemplateDataCategory(TemplateDataCategory templateDataCategory) {
		this.templateDataCategory = templateDataCategory;
	}
	
	
	
	
}
