/**
 * 
 */
package com.jm.template.model;

import java.util.Objects;

/**
 * @author duansubramaniam
 *
 */
public class JmResponse<T> extends AbstractResponse{
	
	private T data;

	/**
	 * 
	 */
	public JmResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param data
	 */
	public JmResponse(T data) {
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JmResponse other = (JmResponse) obj;
		return Objects.equals(data, other.data);
	}
	
	

}
