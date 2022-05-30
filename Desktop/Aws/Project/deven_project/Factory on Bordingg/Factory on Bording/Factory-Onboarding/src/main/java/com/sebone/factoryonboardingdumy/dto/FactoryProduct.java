package com.sebone.factoryonboardingdumy.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
/*
 * @ClassName     :    FactoryProduct(Entity class)
 * @UseMethods    :    getters and setters
 * @ClassSpecifier:    public
 * @Objective     :    Crate class for getters and setters.
 */
@Document("factoryproduct")
public class FactoryProduct {
    @Id
    private long productId;
    private long factoryId;
    private String productName;
    private String productType;
    private int categoryId;
    private int capacityDaily;
    private float priceMin;
    private float priceMax;
    private int availableStock;
    private int designId;
    private String productionDate;
    private String creationDate;
    private String lastModifiedDate;
    private int isEnabled;
    private List<Images> images;
    /**
     * @param productId
     * @param factoryId
     * @param productName
     * @param productType
     * @param categoryId
     * @param capacityDaily
     * @param priceMin
     * @param priceMax
     * @param availableStock
     * @param designId
     * @param productionDate
     * @param creationDate
     * @param lastModifiedDate
     * @param isEnabled
     * create a constructor a constructor
     */
    public FactoryProduct(long productId, long factoryId, String productName, String productType, int categoryId,
                          int capacityDaily, float priceMin, float priceMax, int availableStock, int designId,
                          String productionDate, String creationDate, String lastModifiedDate,
                          int isEnabled, List<Images> images) {
        this.productId = productId;
        this.factoryId = factoryId;
        this.productName = productName;
        this.productType = productType;
        this.categoryId = categoryId;
        this.capacityDaily = capacityDaily;
        this.priceMin = priceMin;
        this.priceMax = priceMax;
        this.availableStock = availableStock;
        this.designId = designId;
        this.productionDate = productionDate;
        this.creationDate = creationDate;
        this.lastModifiedDate = lastModifiedDate;
        this.isEnabled = isEnabled;
        this.images = images;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getFactoryId() {
        return factoryId;
    }

    public void setFactoryId(long factoryId) {
        this.factoryId = factoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getCapacityDaily() {
        return capacityDaily;
    }

    public void setCapacityDaily(int capacityDaily) {
        this.capacityDaily = capacityDaily;
    }

    public float getPriceMin() {
        return priceMin;
    }

    public void setPriceMin(float priceMin) {
        this.priceMin = priceMin;
    }

    public float getPriceMax() {
        return priceMax;
    }

    public void setPriceMax(float priceMax) {
        this.priceMax = priceMax;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }

    public int getDesignId() {
        return designId;
    }

    public void setDesignId(int designId) {
        this.designId = designId;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(int isEnabled) {
        this.isEnabled = isEnabled;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }
}
