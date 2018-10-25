package medialibrary;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 14001835
 */
public class Medialibrary {

    private ArrayList<media> library;
    public ArrayList<String> libraryString;

    public Medialibrary() {
        library = new ArrayList<>();

        libraryString = new ArrayList<>();

        for (int i = 0; i < library.size(); i++) {
            libraryString.add(library.get(i).getName());

        }
    }

    public void addMedia(media newMedia) {
        library.add(newMedia);

    }

    public void printMedia() {
        library.forEach((a) -> System.out.println(a.getName() + ", " + a.getDescription()));

    }

    public media findMedia(String searchItem) {

        int index = libraryString.indexOf(searchItem);
        if (libraryString.contains(searchItem)) {
            return library.get(index);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Medialibrary newLibrary = new Medialibrary();
        MediaLibraryTest_w4.acceptanceTest(newLibrary);

    }

}
