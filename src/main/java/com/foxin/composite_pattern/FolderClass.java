package com.foxin.composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class FolderClass extends Component {

    public List<Component> contents = new ArrayList<Component>();
    private String folderName;

    public FolderClass(String name){
        super(name);
        this.folderName = name;
    }

    public String getFileType(){
        return "Folder";
    }

    public void addFilesToFolder(Component component){
        this.contents.add(component);
    }

    public void getFilesInFolder() {
        for (Component s : this.contents) {
            System.out.println(folderName + ":\n");
            System.out.println(s.name + "\n" + s.getFileType() + "\n" + s.dateCreated + "\n" + s.dateLastModified + "\n");
        }
    }
}
