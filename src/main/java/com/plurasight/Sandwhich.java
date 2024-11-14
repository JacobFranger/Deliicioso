package com.plurasight;

public class Sandwhich {
 private String getBreadsize, getSandwhichsize, getToppings, getMeat, getCheese, getOthertopping, getSuace;

    public Sandwhich(String getBreadsize, String getSandwhichsize, String getToppings, String getMeat, String getCheese, String getOthertopping, String getSuace) {
        this.getBreadsize = getBreadsize;
        this.getSandwhichsize = getSandwhichsize;
        this.getToppings = getToppings;
        this.getMeat = getMeat;
        this.getCheese = getCheese;
        this.getOthertopping = getOthertopping;
        this.getSuace = getSuace;
    }

    public String getGetBreadsize() {
        return getBreadsize;
    }

    public void setGetBreadsize(String getBreadsize) {
        this.getBreadsize = getBreadsize;
    }

    public String getGetSandwhichsize() {
        return getSandwhichsize;
    }

    public void setGetSandwhichsize(String getSandwhichsize) {
        this.getSandwhichsize = getSandwhichsize;
    }

    public String getGetToppings() {
        return getToppings;
    }

    public void setGetToppings(String getToppings) {
        this.getToppings = getToppings;
    }

    public String getGetMeat() {
        return getMeat;
    }

    public void setGetMeat(String getMeat) {
        this.getMeat = getMeat;
    }

    public String getGetCheese() {
        return getCheese;
    }

    public void setGetCheese(String getCheese) {
        this.getCheese = getCheese;
    }

    public String getGetOthertopping() {
        return getOthertopping;
    }

    public void setGetOthertopping(String getOthertopping) {
        this.getOthertopping = getOthertopping;
    }

    public String getGetSuace() {
        return getSuace;
    }

    public void setGetSuace(String getSuace) {
        this.getSuace = getSuace;
    }
}
