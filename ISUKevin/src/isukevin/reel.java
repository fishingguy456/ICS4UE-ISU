/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isukevin;

/**
 *
 * @author 335726246
 */
public class reel {
    private String brand;
    private String model;
    private String retrieve;
    private double gearRatio;
    private String type;
    private double price;
    private String sku;
    public reel(String newBrand, String newModel, String newRetrieve, double newGearRatio, String newType, double newPrice, String newSKU){
        brand = newBrand;
        model = newModel;
        retrieve = newRetrieve;
        gearRatio = newGearRatio;
        type = newType;
        price = newPrice;
        sku = newSKU;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the retrieve
     */
    public String getRetrieve() {
        return retrieve;
    }

    /**
     * @param retrieve the retrieve to set
     */
    public void setRetrieve(String retrieve) {
        this.retrieve = retrieve;
    }

    /**
     * @return the gearRatio
     */
    public double getGearRatio() {
        return gearRatio;
    }

    /**
     * @param gearRatio the gearRatio to set
     */
    public void setGearRatio(double gearRatio) {
        this.gearRatio = gearRatio;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }
}
