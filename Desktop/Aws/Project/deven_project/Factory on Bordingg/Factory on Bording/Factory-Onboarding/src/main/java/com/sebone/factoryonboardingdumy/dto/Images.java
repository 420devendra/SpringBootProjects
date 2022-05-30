package com.sebone.factoryonboardingdumy.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("images")
public class Images {
    private long imageId;
    private long entityId;
    private  int entityType;
    private int imageType;
    private String creationDate;
    private String lastModifiedDate;
    private String imageUrl;
    private boolean  isEnable;

    public Images(long imageId, long entityId, int entityType, int imageType, String creationDate,
                  String lastModifiedDate, String imageUrl, boolean isEnable) {
        this.imageId = imageId;
        this.entityId = entityId;
        this.entityType = entityType;
        this.imageType = imageType;
        this.creationDate = creationDate;
        this.lastModifiedDate = lastModifiedDate;
        this.imageUrl = imageUrl;
        this.isEnable = isEnable;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    public int getEntityType() {
        return entityType;
    }

    public void setEntityType(int entityType) {
        this.entityType = entityType;
    }

    public int getImageType() {
        return imageType;
    }

    public void setImageType(int imageType) {
        this.imageType = imageType;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
}
