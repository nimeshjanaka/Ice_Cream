package Special;

import Flavor.Flavor;

import java.util.Date;
import java.util.List;

public class Special {

    private int specialId;
    private String description;
    private Date startDate;
    private Date endDate;
    private List<String> discountedFlavors;

    public Special(int specialId, String description, Date startDate, Date endDate, List<String> discountedFlavors) {
        this.specialId = specialId;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discountedFlavors = discountedFlavors;
    }

    public int getSpecialId() {
        return specialId;
    }

    public void setSpecialId(int specialId) {
        this.specialId = specialId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<String> getDiscountedFlavors() {
        return discountedFlavors;
    }

    public void setDiscountedFlavors(List<String> discountedFlavors) {
        this.discountedFlavors = discountedFlavors;
    }

    @Override
    public String toString() {
        return "Special{" +
                "specialId=" + specialId +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", discountedFlavors=" + discountedFlavors +
                '}';
    }
}


