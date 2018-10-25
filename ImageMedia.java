package medialibrary;

import java.util.Vector;

/**
 * @author 14001835
 */
public class ImageMedia extends media {

    String mFilePath;
    Vector mCategories;

    public ImageMedia(String name, String description, String filePath) {
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
        if (libraryString.contains(parameter)) {
            mCategories.add(parameter);
            return true;
        } else {
            return false;
        }

    }
}
