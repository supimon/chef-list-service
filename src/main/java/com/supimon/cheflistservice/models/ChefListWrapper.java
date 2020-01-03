package com.supimon.cheflistservice.models;

import java.util.List;

public class ChefListWrapper {

    private List<ChefItem> chefItems;

    public List<ChefItem> getChefItems() {
        return chefItems;
    }

    public void setChefItems(List<ChefItem> chefItems) {
        this.chefItems = chefItems;
    }
}
