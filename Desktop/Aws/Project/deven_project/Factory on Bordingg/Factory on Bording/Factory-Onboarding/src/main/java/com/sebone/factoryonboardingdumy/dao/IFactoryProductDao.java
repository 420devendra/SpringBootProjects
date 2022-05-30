package com.sebone.factoryonboardingdumy.dao;

import com.sebone.factoryonboardingdumy.dto.FactoryProduct;
import org.springframework.data.mongodb.repository.MongoRepository;
/*
 * @Repository Annotation is a specialization of @Component annotation
 * which is used to indicate that the class provides the mechanism for storage,
 *  retrieval, update, delete and search operation on objects.
 */
public interface IFactoryProductDao extends MongoRepository<FactoryProduct,Long> {

}
