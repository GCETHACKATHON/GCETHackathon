package com.animator_abhi.gcethackathon.Models;

/**
 * Created by ankur on 14-04-2017.
 */

public class StartupModel {
    String Startup_Name;
    String Startup_Founder;
    String description;

    public StartupModel(String startup_Name, String startup_Founder, String description) {
        this.Startup_Name = startup_Name;
        this.Startup_Founder = startup_Founder;
        this.description = description;
    }

    public StartupModel() {
    }

    public String getStartup_Name() {
        return Startup_Name;
    }

    public void setStartup_Name(String startup_Name) {
        Startup_Name = startup_Name;
    }

    public String getStartup_Founder() {
        return Startup_Founder;
    }

    public void setStartup_Founder(String startup_Founder) {
        Startup_Founder = startup_Founder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
