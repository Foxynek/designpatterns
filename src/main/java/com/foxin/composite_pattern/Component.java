package com.foxin.composite_pattern;

import java.util.Date;

abstract class Component {

    public String name;
    public Date dateCreated;
    public Date dateLastModified;

    public Component(String newName){
        this.name = newName;
        this.dateCreated = new Date();
        this.dateLastModified = new Date();
    }

    abstract String getFileType();
}
