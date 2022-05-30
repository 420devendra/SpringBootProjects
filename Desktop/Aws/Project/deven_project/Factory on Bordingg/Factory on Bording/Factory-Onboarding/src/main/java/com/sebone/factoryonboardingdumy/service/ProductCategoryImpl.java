package com.sebone.factoryonboardingdumy.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.sebone.factoryonboardingdumy.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebone.factoryonboardingdumy.dao.IProductCategoryDao;
import com.sebone.factoryonboardingdumy.dto.ProductCategoryData;
/* 
 *So overall @Service annotation is used with classes that provide some business functionalities.Spring context will
 * autodetect these classes when annotation-based configuration and classpath scanning is used. 
 */
@Service
public class ProductCategoryImpl implements IProductCategory{

	private Logger logger = GlobalResources.getLogger(FactoryProductImpl.class);
	@Autowired
	private IProductCategoryDao iProductCategoryDao; 
	
	//List<ProductCategoryData> productCategories =  new ArrayList<>(Arrays.asList());


	public List<ProductCategoryData> findAll() {
		String message = "findAll()";
		logger.info(message+"called in Impl");
		return iProductCategoryDao.findAll();
	}

	@Override
	public Optional<ProductCategoryData> findById(long categoryId) {
		String message = "findById";
		logger.info(message+"called in Impl");
		return iProductCategoryDao.findById(categoryId);
	}
	@Override
	public ProductCategoryData addProductCategory(ProductCategoryData productCategory) {
		String message = "addProductCategory";
		logger.info(message+"called in Impl");
		return iProductCategoryDao.save(productCategory);
	}

	@Override
	public void deleteProductCategory(long categoryId) {
		String message = "deleteProductCategory";
		logger.info(message+"called in Impl");
		iProductCategoryDao.deleteById(categoryId);
	}

	@Override
	public ProductCategoryData updateProductCategory(ProductCategoryData productCategory, long categoryId) {
		String message = "updateProductCategory";
		logger.info(message+"called in Impl");
		return iProductCategoryDao.save(productCategory);
	}

}
