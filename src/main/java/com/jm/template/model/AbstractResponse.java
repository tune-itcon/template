/**
 * 
 */
package com.jm.template.model;

import java.util.Objects;

/**
 * @author duansubramaniam
 *
 */
public class AbstractResponse {
	final public static short UNDEFINED_STATUS = -1;
	final public static short ERROR_STATUS = 0;
	final public static short SUCCESS_STATUS = 1;
	
	
	
	private long totalDataCount = 0;
	private short dataType = -1;
	private short dataViewType = -1;
	private short status = UNDEFINED_STATUS;
	private String shortMessage = null;
	private String longMessage = null;
	private boolean isPagination = true;
	private int paginationCount = 20;
	private int pageStartIndex = 0;
	private int pageEndIndex = 19;
	/**
	 * 
	 */
	public AbstractResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the totalDataCount
	 */
	public long getTotalDataCount() {
		return totalDataCount;
	}
	/**
	 * @param totalDataCount the totalDataCount to set
	 */
	public void setTotalDataCount(long totalDataCount) {
		this.totalDataCount = totalDataCount;
	}
	/**
	 * @return the dataType
	 */
	public short getDataType() {
		return dataType;
	}
	/**
	 * @param dataType the dataType to set
	 */
	public void setDataType(short dataType) {
		this.dataType = dataType;
	}
	/**
	 * @return the dataViewType
	 */
	public short getDataViewType() {
		return dataViewType;
	}
	/**
	 * @param dataViewType the dataViewType to set
	 */
	public void setDataViewType(short dataViewType) {
		this.dataViewType = dataViewType;
	}
	/**
	 * @return the status
	 */
	public short getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(short status) {
		this.status = status;
	}
	/**
	 * @return the shortMessage
	 */
	public String getShortMessage() {
		return shortMessage;
	}
	/**
	 * @param shortMessage the shortMessage to set
	 */
	public void setShortMessage(String shortMessage) {
		this.shortMessage = shortMessage;
	}
	/**
	 * @return the longMessage
	 */
	public String getLongMessage() {
		return longMessage;
	}
	/**
	 * @param longMessage the longMessage to set
	 */
	public void setLongMessage(String longMessage) {
		this.longMessage = longMessage;
	}
	/**
	 * @return the isPagination
	 */
	public boolean isPagination() {
		return isPagination;
	}
	/**
	 * @param isPagination the isPagination to set
	 */
	public void setPagination(boolean isPagination) {
		this.isPagination = isPagination;
	}
	/**
	 * @return the paginationCount
	 */
	public int getPaginationCount() {
		return paginationCount;
	}
	/**
	 * @param paginationCount the paginationCount to set
	 */
	public void setPaginationCount(int paginationCount) {
		this.paginationCount = paginationCount;
	}
	/**
	 * @return the pageStartIndex
	 */
	public int getPageStartIndex() {
		return pageStartIndex;
	}
	/**
	 * @param pageStartIndex the pageStartIndex to set
	 */
	public void setPageStartIndex(int pageStartIndex) {
		this.pageStartIndex = pageStartIndex;
	}
	/**
	 * @return the pageEndIndex
	 */
	public int getPageEndIndex() {
		return pageEndIndex;
	}
	/**
	 * @param pageEndIndex the pageEndIndex to set
	 */
	public void setPageEndIndex(int pageEndIndex) {
		this.pageEndIndex = pageEndIndex;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dataType, dataViewType, isPagination, longMessage, pageEndIndex, pageStartIndex,
				paginationCount, shortMessage, status, totalDataCount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractResponse other = (AbstractResponse) obj;
		return dataType == other.dataType && dataViewType == other.dataViewType && isPagination == other.isPagination
				&& Objects.equals(longMessage, other.longMessage) && pageEndIndex == other.pageEndIndex
				&& pageStartIndex == other.pageStartIndex && paginationCount == other.paginationCount
				&& Objects.equals(shortMessage, other.shortMessage) && status == other.status
				&& totalDataCount == other.totalDataCount;
	}
	
	

}
