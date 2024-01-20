package Promotion;

import Flavor.Flavor;

import java.util.List;

public class Promotion {

    private int promotionId;
    private String description;
    private List<Flavor> applicableFlavors;
    private double discountPercentage;

    public Promotion(int promotionId, String description, List<Flavor> applicableFlavors, double discountPercentage) {
        this.promotionId = promotionId;
        this.description = description;
        this.applicableFlavors = applicableFlavors;
        this.discountPercentage = discountPercentage;
    }

    public Promotion(int promotionId, String description, String vanilla, double discountPercentage) {
    }

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Flavor> getApplicableFlavors() {
        return applicableFlavors;
    }

    public void setApplicableFlavors(List<Flavor> applicableFlavors) {
        this.applicableFlavors = applicableFlavors;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "promotionId=" + promotionId +
                ", description='" + description + '\'' +
                ", applicableFlavors=" + applicableFlavors +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}

