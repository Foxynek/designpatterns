import com.foxin.composite_pattern.FileClass;
import com.foxin.composite_pattern.FolderClass;
import org.junit.Test;

public class DebugCompositePattern {

    @Test
    public void debugCompositePattern(){
        FolderClass folder = new FolderClass("MyFolder");
        FolderClass folder2 = new FolderClass("Pictures");
        FileClass file1 = new FileClass("Video", ".mp4");
        FileClass file2 = new FileClass("Image", ".png");
        FileClass file3 = new FileClass("Image", ".iso");

        folder2.addFilesToFolder(file2);

        folder.addFilesToFolder(file1);
        folder.addFilesToFolder(file3);
        folder.addFilesToFolder(folder2);

        folder.getFilesInFolder();
        folder2.getFilesInFolder();

    }
}
