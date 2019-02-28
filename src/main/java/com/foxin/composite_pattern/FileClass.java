package com.foxin.composite_pattern;

public class FileClass extends Component {

    private String fileType;

    public FileClass(String name, String type){
        super(name);
        this.fileType = type;
    }

    public String getFileType(){
        return this.fileType;
    }
}
