/**
 * 
 */
package com.jm.template.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jm.template.model.TemplateDataCategory;

/**
 * @author duansubramaniam
 *
 */
public interface TemplateDataCategoryRepository extends CrudRepository<TemplateDataCategory, Long> {
	
	//@Query("select tc.id, tc.name, tc.type, tc.description from template_data_category tdc, process_type pt, process_type_link ptl, template_category tc  where pt.enum_id = :processTypeId and pt.id = ptl.process_type_id and ptl.category_id = tc.id")
	//public List<TemplateDataCategory> findByProcessType(@Param("processTypeId") Long processTypeId);
}
