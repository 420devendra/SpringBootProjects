package com.sebone.factoryonboardingdumy.service;

import com.sebone.factoryonboardingdumy.dto.FactoryProduct;

import java.util.List;
import java.util.Optional;
/*
 * @Interface     :   IFactoryProduct
 * @UseMethods    :   findAll,findById,addFactoryProduct,updateFactoryProduct,deleteFactoryProduct
 * @ClassSpecifier:    public
 * @Objective     :
 * Interface class that has the following methods.
 **/
public interface IFactoryProduct {
    /*  @Method Name  :     findAll
     *  @ArgumentType :     no argument
     *  @ReturnType   :	    List of FactoryProductData
     */
    public List<FactoryProduct> findAll();
    /*  @Method Name  :     findById
     *  @ArgumentType :     long
     *  @ReturnType   :	    List of FactoryProductData
     */
    public Optional<FactoryProduct> findById(long productId);
    /*  @Method Name  :     addFactoryProduct
     *  @ArgumentType :     long
     *  @ReturnType   :	    List of FactoryProductData
     */
    public FactoryProduct addFactoryProduct(FactoryProduct factoryProduct);
    /*  @Method Name  :     updateFactoryProduct
     *  @ArgumentType :     FactoryProduct,long
     *  @ReturnType   :	    FactoryProduct
     */
    public FactoryProduct updateFactoryProduct(FactoryProduct factoryProduct,long productId);
    /*  @Method Name  :     deleteFactoryProduct
     *  @ArgumentType :     long
     *  @ReturnType   :	    void
     */
    public void deleteFactoryProduct(long productId);

}
