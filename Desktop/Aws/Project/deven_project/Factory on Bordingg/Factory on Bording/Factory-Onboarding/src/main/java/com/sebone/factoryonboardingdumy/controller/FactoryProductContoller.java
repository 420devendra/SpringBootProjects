package com.sebone.factoryonboardingdumy.controller;

import com.sebone.factoryonboardingdumy.dto.FactoryProduct;
import com.sebone.factoryonboardingdumy.exception.ResourceNotFoundException;
import com.sebone.factoryonboardingdumy.service.IFactoryProduct;
import com.sebone.factoryonboardingdumy.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
/*
 * @ClassName     :    FactoryProductController(RestController)
 * @UseMethods    :
 * @ClassSpecifier:    public
 * @Objective     :    controller class is responsible for processing incoming
 *  REST API requests, preparing a model,and returning the view to be rendered as a response.
 *  The controller classes in Spring are annotated either by the @Controller or
 *  the @RestController annotation.
 */
@RestController

@RequestMapping("/factoryProduct/products")
public class FactoryProductContoller {
    /* Autowired annotation is used for automatic dependency injection.
      Spring framework is built on dependency injection and
	  we inject the class dependencies through spring bean configuration file.
	*/
    private Logger logger = GlobalResources.getLogger(FactoryProductContoller.class);
    @Autowired
    /* create refrence of IFactorypProduct interface*/
    private IFactoryProduct iFactoryProduct;
    /*  @Method Name  :     getFactoryPoductDataList
     *  @ArgumentType :     no argument
     *  @ReturnType   :	    List of FactoryProduct
     *  @Objective    :     Crate Method for get all  FactoryProduct Data.
     */
    @GetMapping("/getFactoryProducts")
    public List<FactoryProduct> getFactoryPoductDataList()throws ResourceNotFoundException {
        String methodName = "getFactoryPoductDataList()";
        logger.info(methodName+"Succesfully called");
        List<FactoryProduct> factory = (List<FactoryProduct>) iFactoryProduct.findAll();
        if (factory.isEmpty()) {
            throw new ResourceNotFoundException("data not exist");
        }
        return factory;
    }
    /*
     *  @Method Name  :     addFactoryProduct
     *  @ArgumentType :     object of FactoryProductData
     *  @ReturnType   :	    void
     *  @Objective    :     Crate Method for add  FactoryProduct .
     */
    @PostMapping("/addFactoryProduct")
    public String addFactoryProduct(@RequestBody FactoryProduct factoryProduct) throws ResourceNotFoundException{
        String methodName = "addFactoryProduct()";
        logger.info(methodName+" Succesfully called");
        FactoryProduct factoryProduct1=	iFactoryProduct.addFactoryProduct(factoryProduct);
        if(factoryProduct1.getProductName().isEmpty())
        {
            throw new ResourceNotFoundException("name field should be not empty");

        }
        return "Added factoryproduct with id : " + factoryProduct1.getProductId();
    }
    /*  @Method Name  :     getFactoryProductById
     *  @ArgumentType :     productId
     *  @ReturnType   :	    List of productDetails of factoryProductdata
     *  @Objective    :     Crate Method for get factoryProduct Data by given productid.
     */
    @GetMapping("/getFactoryProduct/{productId}")
    public Optional<FactoryProduct>getFactoryProductById(@PathVariable long productId) throws ResourceNotFoundException{
        String methodName = "getFactoryProductById()";
        logger.info(methodName+" Succesfully called");
        return Optional.of(iFactoryProduct.findById(productId).orElseThrow
        (()->new ResourceNotFoundException("id does not exist"+""+productId)));
    }
    /*
     *  @Method Name  :     updateFactoryProduct
     *  @ArgumentType :     object of FactoryProduct,long
     *  @ReturnType   :	    FactoryProduct
     *  @Objective    :     Crate Method for update factoryProduct.
     */
    @RequestMapping(method = RequestMethod.PUT,value = "/getFactoryProduct/{productId}")
    public FactoryProduct updateFactoryProduct(@RequestBody FactoryProduct factoryProduct,
        @PathVariable("productId") long productId){
        String methodName = "updateFactoryProduct()";
        logger.info(methodName+" Succesfully called");
        return iFactoryProduct.updateFactoryProduct(factoryProduct,productId);
    }
    /*
     *  @Method Name  :     deleteFactoryProduct
     *  @ArgumentType :     long
     *  @ReturnType   :	    void
     *  @Objective    :     Crate Method for delete factoryProduct BY productId.
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/getFactoryProduct/{productId}")
    public String deleteFactoryProduct(@PathVariable long productId){
        String methodName = "deleteFactoryProduct()";
        logger.info(methodName+" Succesfully called");
        iFactoryProduct.deleteFactoryProduct(productId);
        return "Delete FactoryProduct With Id"+":"+productId;
    }

}
