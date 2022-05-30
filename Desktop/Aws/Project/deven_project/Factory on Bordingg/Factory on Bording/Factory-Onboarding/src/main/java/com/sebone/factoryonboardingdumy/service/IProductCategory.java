package com.sebone.factoryonboardingdumy.service;

import java.util.List;
import java.util.Optional;

import com.sebone.factoryonboardingdumy.dto.ProductCategoryData;

    /*
	 * @Interface     :   IProductCategory
	 * @UseMethods    :   findAll,findById,addroductCategory,deleteroductCategory,updateroductCategory
	 * @ClassSpecifier:    public
	 * @Objective     :    Interface class that has the following methods.
    */
	public interface IProductCategory {
		
		/*  @Method Name  :     findAll 
		 *  @ArgumentType :     no argument 
		 *  @ReturnType   :	    List of ProductCategory
		*/
		public	List<ProductCategoryData> findAll();
		
		/*  @Method Name  :     findById 
		 *  @ArgumentType :     long 
		 *  @ReturnType   :	    List of ProductCategory
		*/
		public Optional<ProductCategoryData> findById(long categoryId);
		
		/*  @Method Name  :     addProductCategory
		 *  @ArgumentType :     long 
		 *  @ReturnType   :	    List of ProductCategory
		*/
		public ProductCategoryData addProductCategory(ProductCategoryData productCategory);
		
		/*  @Method Name  :     deleteProductCategoryById
		 *  @ArgumentType :     long 
		 *  @ReturnType   :	    void
		*/
		public void deleteProductCategory(long categoryId);
		
		/*  @Method Name  :     updateProductCategoryById 
		 *  @ArgumentType :     productCategory,long 
		 *  @ReturnType   :	    void
		 */
		public ProductCategoryData updateProductCategory(ProductCategoryData productCategory,long categoryId);
		
	}
