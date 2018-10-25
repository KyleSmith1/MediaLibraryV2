package medialibrary;

import java.util.Vector;

/**
 * @author 14001835
 */
public class AudioMedia extends media{

    String mFilePath;
    Vector mCategories;
    
    public AudioMedia(String name, String description, String filePath){
        super(name, description);
        mFilePath = filePath;
    }
    
    public void setFilePath(String newFilePath) {
        mFilePath = newFilePath;
    }

    public String getFilePath() {
        return mFilePath;
    }

    
    public boolean addCategory(String parameter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
