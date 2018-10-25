package medialibrary;

import java.util.Vector;

/**
 * @author 14001835
 */
abstract class media {

    String mName;
    String mDescription;

    public media(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public String getName() {
        return mName;
    }

    public void setName(String newName) {
        mName = newName;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String newDescription) {
        mDescription = newDescription;
    }
    
    public abstract boolean addCategory(String parameter);
    
    public void getCategories(Vector parameter){
        //parameter.add(mCategories);
    }
       

}
