package com.simplewippy.main;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by barley on 28/02/2019
 */
public class WippyMain {
    private String alcohol;

    private boolean is_verify_mobile;

    private String distance;

    private ArrayList<String> profile_images;

    private String smoke;

    private String description;

    private String basic_occupation;

    private String religion;

    private String blood_type;

    private String name;

    private String location;

    private String education_level;

    private String age;

    private String height;

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public boolean isIs_verify_mobile() {
        return is_verify_mobile;
    }

    public void setIs_verify_mobile(boolean is_verify_mobile) {
        this.is_verify_mobile = is_verify_mobile;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public ArrayList<String> getProfile_images() {
        return profile_images;
    }

    public void setProfile_images(ArrayList<String> profile_images) {
        this.profile_images = profile_images;
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBasic_occupation() {
        return basic_occupation;
    }

    public void setBasic_occupation(String basic_occupation) {
        this.basic_occupation = basic_occupation;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "WippyMain{" +
                "alcohol='" + alcohol + '\'' +
                ", is_verify_mobile=" + is_verify_mobile +
                ", distance='" + distance + '\'' +
                ", profile_images=" + profile_images +
                ", smoke='" + smoke + '\'' +
                ", description='" + description + '\'' +
                ", basic_occupation='" + basic_occupation + '\'' +
                ", religion='" + religion + '\'' +
                ", blood_type='" + blood_type + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", education_level='" + education_level + '\'' +
                ", age='" + age + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
