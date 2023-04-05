/* This Interface have Basic Method Declaration which is used in book data Manipulation*/

package Backend.Controller;

import Backend.Modal.BookDataClass;

import java.util.ArrayList;

public interface OperationsOnBookData {

    // Refresh or when Application Starts load all previous data  //
    ArrayList<BookDataClass> fetchAllStoredData();


    boolean SaveToFilePermanently(ArrayList<BookDataClass> bookDataClassArrayList);

    String fetchBookCover();
}
