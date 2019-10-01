/**
 * 
 */
package com.jm.template.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author duansubramaniam
 *
 */

@Entity(name = "TemplateDataCategory")
@Table(name = "template_data_category")
public class TemplateDataCategory {
	
	@Id
	@GeneratedValue(generator = "template_data_category_id_seq", strategy = GenerationType.SEQUENCE)
	  @SequenceGenerator(
	      name = "template_data_category_id_seq", 
	      sequenceName = "template_data_category_id_seq", 
	      allocationSize = 50
	  )
	private Long id;
	
	private String name;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "template_data_category_link", joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "id"), 
    inverseJoinColumns = @JoinColumn(name = "data_id", referencedColumnName = "id"))
	private Set<TemplateData> templateData;
	
	/**
	 * @param name
	 * @param templateData
	 */
	public TemplateDataCategory(String name, Set<TemplateData> templateData) {
		this.name = name;
		this.templateData = templateData;
	}



	public TemplateDataCategory() {
		
	}
	
	

	/**
	 * @param name
	 */
	public TemplateDataCategory(String name) {
		super();
		this.name = name;
	}



	/**
	 * @param id
	 * @param name
	 */
	public TemplateDataCategory(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, name, templateData);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemplateDataCategory other = (TemplateDataCategory) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(templateData, other.templateData);
	}



	/**
	 * @return the templateData
	 */
	public Set<TemplateData> getTemplateData() {
		return templateData;
	}



	/**
	 * @param templateData the templateData to set
	 */
	public void setTemplateData(Set<TemplateData> templateData) {
		this.templateData = templateData;
	}



	


	

}
