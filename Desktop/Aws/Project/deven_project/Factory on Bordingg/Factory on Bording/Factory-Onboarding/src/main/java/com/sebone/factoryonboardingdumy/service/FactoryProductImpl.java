package com.sebone.factoryonboardingdumy.service;

import com.sebone.factoryonboardingdumy.controller.FactoryProductContoller;
import com.sebone.factoryonboardingdumy.dao.IFactoryProductDao;
import com.sebone.factoryonboardingdumy.dto.FactoryProduct;
import com.sebone.factoryonboardingdumy.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/*
 *@Service annotation is used with classes that provide some business functionalities.Spring context will
 * autodetect these classes when annotation-based configuration and classpath scanning is used.
 */
@Service
/*
 * @ClassName     :    FactoryProductImpl(Service)
 * @UseMethods    :    Implement all method of IFactoryProduct interface
 * @ClassSpecifier:    public
 * @Objective     :    FactoryProductImpl class is providing implementation of IFactoryProduct interface,this class is responsible for processing incoming
 *  REST API requests, preparing a model,and returning the view to be rendered as a response.
 *  The service classes in Spring are annotated either by the @Service annotation.
 */
public class FactoryProductImpl implements IFactoryProduct{
    private Logger logger = GlobalResources.getLogger(FactoryProductImpl.class);
    @Autowired
    //referenc of IFactoryProductDao interface
    private IFactoryProductDao iFactoryProductDao;
    /*  @Method Name  :     findAll
     *  @ArgumentType :     no argument
     *  @ReturnType   :	    List of AllfactoryProduct
     *  @Objective    :     Crate Method for get all  factoryProduct Data.
     */
    @Override
    public List<FactoryProduct> findAll() {
        String methodName = "findAll()";
        logger.info(methodName+"called in Impl");
        return iFactoryProductDao.findAll();
    }
    /*  @Method Name  :     findById
     *  @ArgumentType :     long
     *  @ReturnType   :	    List of factoryProduct
     *  @Objective    :     Implement Method of IFactoryProduct interface for get factoryProduct Data.
     */
    @Override
    public Optional<FactoryProduct> findById(long productId) {
        String methodName = "findById()";
        logger.info(methodName+"called in Impl");
        return iFactoryProductDao.findById(productId);
    }
    /*  @Method Name  :     addFactoryProduct
     *  @ArgumentType :     FactoryProduct
     *  @ReturnType   :	    FactoryProduct
     *  @Objective    :     Implement Method of IFactoryProduct interface for add factoryProduct Data.
     */
    @Override
    public FactoryProduct addFactoryProduct(FactoryProduct factoryProduct) {
        String methodName = "addFactoryProduct()";
        logger.info(methodName+"called in Impl");
        return iFactoryProductDao.save(factoryProduct);
    }
    /*  @Method Name  :     updateFactoryProduct
     *  @ArgumentType :     long,FactoryProduct
     *  @ReturnType   :	    FactoryProduct
     *  @Objective    :     Implement Method of IFactoryProduct interface for updateFactoryProduct.
     */
    @Override
    public FactoryProduct updateFactoryProduct(FactoryProduct factoryProduct,long productId) {
        String methodName = "updateFactoryProduct()";
        logger.info(methodName+"called in Impl");
        return iFactoryProductDao.save(factoryProduct);
    }
    /*  @Method Name  :     deleteFactoryProduct
     *  @ArgumentType :     long
     *  @ReturnType   :	    void
     *  @Objective    :     Implement Method of IFactoryProduct interface for deleteFactoryProduct.
     */
    @Override
    public void deleteFactoryProduct(long productId) {
        String methodName = "deleteFactoryProduct()";
        logger.info(methodName+"called in Impl");
        iFactoryProductDao.deleteById(productId);
    }
}
