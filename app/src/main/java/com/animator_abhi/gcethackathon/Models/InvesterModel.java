package com.animator_abhi.gcethackathon.Models;

/**
 * Created by ankur on 14-04-2017.
 */

public class InvesterModel {
    String Name;
    String CompanyName;
    String About;

    public InvesterModel() {
    }

    public InvesterModel(String name, String companyName, String about) {
        Name = name;
        CompanyName = companyName;
        About = about;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        About = about;
    }
}
