package com.plurasight;

public class Order {
    private String addSandwiches, addDrinks, addChips, checkout, cancelOrder;

    public String getAddSandwiches() {
        return addSandwiches;
    }

    public void setAddSandwiches(String addSandwiches) {
        this.addSandwiches = addSandwiches;
    }

    public String getAddDrinks() {
        return addDrinks;
    }

    public void setAddDrinks(String addDrinks) {
        this.addDrinks = addDrinks;
    }

    public String getAddChips() {
        return addChips;
    }

    public void setAddChips(String addChips) {
        this.addChips = addChips;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getCancelOrder() {
        return cancelOrder;
    }

    public void setCancelOrder(String cancelOrder) {
        this.cancelOrder = cancelOrder;
    }

    public Order(String addSandwiches, String addDrinks, String addChips, String checkout, String cancelOrder) {
        this.addSandwiches = addSandwiches;
        this.addDrinks = addDrinks;
        this.addChips = addChips;
        this.checkout = checkout;
        this.cancelOrder = cancelOrder;
    }
}
