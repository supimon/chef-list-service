package com.supimon.cheflistservice.models;

public class ChefItem {

    private String chefId;
    private String name;
    private String imgUrl;
    private String skills;
    private int recommendations;
    private double rating;
    private boolean verified;
    private int experience;

    public ChefItem(String chefId, String name, String imgUrl, String skills, int recommendations, double rating, boolean verified, int experience) {
        this.chefId = chefId;
        this.name = name;
        this.imgUrl = imgUrl;
        this.skills = skills;
        this.recommendations = recommendations;
        this.rating = rating;
        this.verified = verified;
        this.experience = experience;
    }

    public String getChefId() {
        return chefId;
    }

    public void setChefId(String chefId) {
        this.chefId = chefId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(int recommendations) {
        this.recommendations = recommendations;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
