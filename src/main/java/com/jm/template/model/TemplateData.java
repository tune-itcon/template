/**
 * 
 */
package com.jm.template.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author duansubramaniam
 *
 */

@Entity(name = "TemplateData")
@Table(name = "template_data")
public class TemplateData {
	
	@Id
	@GeneratedValue(generator = "template_data_id_seq", strategy = GenerationType.SEQUENCE)
	  @SequenceGenerator(
	      name = "template_data_id_seq", 
	      sequenceName = "template_data_id_seq", 
	      allocationSize = 50
	  )
	private Long id;
	
	private String name;
	
//	@ManyToMany(mappedBy = "templateData")
//	private Set<TemplateDataCategory> templateDataCategorys;

	/**
	 * 
	 */
	public TemplateData() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 */
	public TemplateData(Long id, String name) {
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
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemplateData other = (TemplateData) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	

	
	
	

}
