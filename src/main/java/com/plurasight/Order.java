package com.plurasight;

public class Order {
    private int addSandwiches, addDrinks, addChips, checkout, cancelOrder;

    public Order(int addSandwiches, int addDrinks, int addChips, int checkout, int cancelOrder) {
        this.addSandwiches = addSandwiches;
        this.addDrinks = addDrinks;
        this.addChips = addChips;
        this.checkout = checkout;
        this.cancelOrder = cancelOrder;
    }

    public int getAddSandwiches() {
        return addSandwiches;
    }

    public void setAddSandwiches(int addSandwiches) {
        this.addSandwiches = addSandwiches;
    }

    public int getAddDrinks() {
        return addDrinks;
    }

    public void setAddDrinks(int addDrinks) {
        this.addDrinks = addDrinks;
    }

    public int getAddChips() {
        return addChips;
    }

    public void setAddChips(int addChips) {
        this.addChips = addChips;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public int getCancelOrder() {
        return cancelOrder;
    }

    public void setCancelOrder(int cancelOrder) {
        this.cancelOrder = cancelOrder;
    }
}
