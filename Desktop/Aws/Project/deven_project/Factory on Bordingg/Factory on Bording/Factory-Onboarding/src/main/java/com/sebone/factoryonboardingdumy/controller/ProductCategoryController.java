	package com.sebone.factoryonboardingdumy.controller;
	
	import java.util.List;
import java.util.Optional;

	import com.sebone.factoryonboardingdumy.utility.GlobalResources;
	import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
   import org.springframework.web.bind.annotation.RestController;
	
	import com.sebone.factoryonboardingdumy.dto.ProductCategoryData;
	import com.sebone.factoryonboardingdumy.exception.ResourceNotFoundException;
	import com.sebone.factoryonboardingdumy.service.IProductCategory;
	
	@RestController
	@RequestMapping("/productcategory/categories")
	public class ProductCategoryController 
	{
	    
		Logger logger=LoggerFactory.getLogger(ProductCategoryController.class);

		@GetMapping("/message")
		public String getMessage() {
			logger.debug("Controller logger msg called");
			return " Controller Called";
		}
	
		@Autowired
		/* create refrence of IProductCategory interface*/
		public IProductCategory iProductCategory;
		
		/* The @GetMapping annotated methods in the @Controller annotated classes handle
		 *  the HTTP GET requests matched with given URI expression.
	    */
		
		/*  @Method Name  :     getProductCategoryDataList 
		 *  @ArgumentType :     no argument 
		 *  @ReturnType   :	    List of list of product category
		 *  @Objective    :     Crate Method for get all  product category Data. 
		 */
		@GetMapping("/getproductcategory")
		 public List<ProductCategoryData> getProductCategoryDataList()throws ResourceNotFoundException{
			List<ProductCategoryData>category=(List<ProductCategoryData>)iProductCategory.findAll();
			  	if(category.isEmpty())  
			  	{
			  		throw new ResourceNotFoundException("data not exist");
			  	}
			  	logger.error("Successfully get product category");
			 return category;
		}
		
		/* The @GetMapping annotated methods in the @Controller annotated classes handle
		 *  the HTTP GET requests matched with given "getproductcategory/{categoryId}" URI expression show product category data by categoryid.
		*/
		
		/*  @Method Name  :     getProductCategoryDataById
		 *  @ArgumentType :     categoryId 
		 *  @ReturnType   :	    List of product category data
		 *  @Objective    :     Crate Method for get product category data by given categoryId. 
		 */
		
		@GetMapping("/getproductcategory/{categoryId}")
		public Optional<ProductCategoryData> getProductCategoryDataById(@PathVariable long categoryId) throws ResourceNotFoundException{
			 logger.error("succesfully get productCategory By id");
			return Optional.of(iProductCategory.findById(categoryId)
					.orElseThrow(()->new ResourceNotFoundException("id does not exist  "+categoryId)));
		}
		
		/* 
		 * @PostMapping annotation maps HTTP POST requests onto specific handler methods. 
		 * It is a composed annotation that acts as a shortcut for 
		 * @RequestMapping(method = RequestMethod. POST).
	     */
		 
		/* 
		 *  @Method Name  :     addProductCategory 
		 *  @ArgumentType :     object of  productCategory 
		 *  @ReturnType   :	    void
		 *  @Objective    :     Crate Method for add  ProductCategory . 
		 */
		
		@PostMapping("/addproductcategory")
		public String addProductCategory(@RequestBody ProductCategoryData productCategory)throws ResourceNotFoundException
		{
			ProductCategoryData productCategory1=iProductCategory.addProductCategory(productCategory);
			if(productCategory1.getCategoryName().isEmpty()) 
			{
		  		throw new ResourceNotFoundException("name field should not be empty");
	
			}
			logger.error("Successfully add Productcategory");
		   return "Added ProductCategory with id : " + productCategory1.getCategoryId();
		}
		
		/*
		 * Annotation for mapping HTTP PUT requests onto specific handler methods. 
		 * Specifically, @PutMapping is a composed annotation that acts as a shortcut
		 *  for @RequestMapping(method = RequestMethod.PUT).
	    */
		/* 
		 *  @Method Name  :     updateProductCategory
		 *  @ArgumentType :     object of productCategory,long  
		 *  @ReturnType   :	    ProductCategoryData
		 *  @Objective    :     Crate Method for update ProductCategoryData. 
		*/
		
		@RequestMapping(method=RequestMethod.PUT,value="/updateproductcategory/{categoryId}")
		public ProductCategoryData updateProductCategory( @RequestBody ProductCategoryData productCategory ,@PathVariable("categoryId") long categoryId)
		{
			logger.error("SuccessFully Update ProductCategory");
			return iProductCategory.updateProductCategory(productCategory, categoryId); 
					
		}
		
		/*
		 * The DELETE HTTP method is used to delete the resource
		 *  and @DeleteMapping annotation maps the HTTP DELETE requests onto specific handler methods of a Spring controller.
		 */
		
		/* 
		 *  @Method Name  :     deleteProductCategory
		 *  @ArgumentType :     long  
		 *  @ReturnType   :	    void
		 *  @Objective    :     Crate Method for delete ProductCategoryData by categoryId. 
		 */
		@RequestMapping(method=RequestMethod.DELETE,value="/deleteproductcategory/{categoryId}")
		public String deleteProductCategory(@PathVariable long categoryId)
		{
			iProductCategory.deleteProductCategory(categoryId);
			logger.error("Successfully deleted productCategory by id");
		    return "Delete Product Category With Id : "+categoryId;
		}
	
	}
