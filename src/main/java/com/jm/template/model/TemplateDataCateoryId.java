/**
 * 
 */
package com.jm.template.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author duansubramaniam
 *
 */

@Embeddable
public class TemplateDataCateoryId implements Serializable {
	 
	@Column(name = "data_id")
	private Long dataId;

	@Column(name = "category_id")
	private Long categoryId;

	private TemplateDataCateoryId() {}

	public TemplateDataCateoryId(
	    Long dataId,
	    Long categoryId) {
	    this.dataId = dataId;
	    this.categoryId = categoryId;
	}

	/**
	 * @return the dataId
	 */
	public Long getDataId() {
		return dataId;
	}

	/**
	 * @param dataId the dataId to set
	 */
	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}

	/**
	 * @return the categoryId
	 */
	public Long getCategoryId() {
		return categoryId;
	}

	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoryId, dataId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemplateDataCateoryId other = (TemplateDataCateoryId) obj;
		return Objects.equals(categoryId, other.categoryId) && Objects.equals(dataId, other.dataId);
	}


}
