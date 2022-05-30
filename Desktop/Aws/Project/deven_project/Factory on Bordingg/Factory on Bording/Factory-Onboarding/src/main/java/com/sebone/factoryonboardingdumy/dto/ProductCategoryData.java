/**
 * 
 */
package com.sebone.factoryonboardingdumy.dto;

import org.springframework.data.annotation.Id;

/*
 * @ClassName     :    ProductCategoryData(Entity class)
 * @UseMethods    :    getters and setters 
 * @ClassSpecifier:    public
 * @Objective     :    Crate class for getters and setters.
 */
	public class ProductCategoryData {
		
		@Id
		private long categoryId;
		private String categoryName;
		private String categoryDesc;
		private String creationDate;
		private String lastModifiedDate;
		private String categoryStatus;
		private int isEnabled;
	
		public ProductCategoryData(long categoryId, String categoryName, String categoryDesc, String creationDate,String lastModifiedDate, String categoryStatus,int isEnabled)
		{
			super();
			this.categoryId = categoryId;
			this.categoryName = categoryName;
			this.categoryDesc = categoryDesc;
			this.creationDate = creationDate;
			this.lastModifiedDate = lastModifiedDate;
			this.categoryStatus = categoryStatus;
			this.isEnabled=isEnabled;
		}
			/**
			 * @return the categoryId
			 */
			public long getCategoryId() {
				return categoryId;
			}
			/**
			 * @param categoryId the categoryId to set
			 */
			public void setCategoryId(long categoryId) {
				this.categoryId = categoryId;
			}
			/**
			 * @return the categoryName
			 */
			public String getCategoryName() {
				return categoryName;
			}
			/**
			 * @param categoryName the categoryName to set
			 */
			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}
			/**
			 * @return the categoryDesc
			 */
			public String getCategoryDesc() {
				return categoryDesc;
			}
			/**
			 * @param categoryDesc the categoryDesc to set
			 */
			public void setCategoryDesc(String categoryDesc) {
				this.categoryDesc = categoryDesc;
			}
			/**
			 * @return the creationDate
			 */
			public String getCreationDate() {
				return creationDate;
			}
			/**
			 * @param creationDate the creationDate to set
			 */
			public void setCreationDate(String creationDate) {
				this.creationDate = creationDate;
			}
			/**
			 * @return the lastModifiedDate
			 */
			public String getLastModifiedDate() {
				return lastModifiedDate;
			}
			/**
			 * @param lastModifiedDate the lastModifiedDate to set
			 */
			public void setLastModifiedDate(String lastModifiedDate) {
				this.lastModifiedDate = lastModifiedDate;
			}
			/**
			 * @return the categoryStatus
			 */
			public String getCategoryStatus() {
				return categoryStatus;
			}
			/**
			 * @param categoryStatus the categoryStatus to set
			 */
			public void setCategoryStatus(String categoryStatus) {
				this.categoryStatus = categoryStatus;
			}
			public int getIsEnabled() {
				return isEnabled;
			}
			public void setIsEnabled(int isEnabled) {
				this.isEnabled = isEnabled;
			}
				
				
	}
