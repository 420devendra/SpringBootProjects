package com.sebone.factoryonboardingdumy.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sebone.factoryonboardingdumy.dto.ProductCategoryData;

/*
 * @Repository Annotation is a specialization of @Component annotation 
 * which is used to indicate that the class provides the mechanism for storage,
 *  retrieval, update, delete and search operation on objects.
 */
 @Repository
 public interface IProductCategoryDao extends MongoRepository<ProductCategoryData, Long>{

}
