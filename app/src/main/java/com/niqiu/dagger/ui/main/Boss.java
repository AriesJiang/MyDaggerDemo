package com.niqiu.dagger.ui.main;

import javax.inject.Inject;

/**
 * Created by JC001 on 2015/11/16.
 */
public class Boss {

    @Inject
    public Boss() {

    }

    String name = "rio";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
