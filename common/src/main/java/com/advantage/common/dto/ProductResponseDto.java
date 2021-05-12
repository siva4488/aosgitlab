package com.advantage.common.dto;

public class ProductResponseDto {
    boolean success;
    long id;        //  -1 = Invalid
    String reason;
    String imageId;
    String imageColor;

    public ProductResponseDto(boolean success, long id, String reason) {
        this.success = success;
        this.id = id;
        this.reason = reason;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getImageId() {
        return imageId;
    }
    public String getImageColor() {
        return imageColor;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    public void setImageColor(String imageColor) {
        this.imageColor = imageColor;
    }
}
