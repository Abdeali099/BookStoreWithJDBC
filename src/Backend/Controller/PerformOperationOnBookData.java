/* This controller will handle / call File classes */
package Backend.Controller;

import Backend.FileManagment.SavePermanentInFile;
import Backend.FileManagment.FetchBookCoverByFile;
import Backend.FileManagment.ReadBookFromFile;
import Backend.Modal.BookDataClass;

import java.io.IOException;
import java.util.ArrayList;

public class PerformOperationOnBookData implements OperationsOnBookData{

    @Override
    public boolean SaveToFilePermanently(ArrayList<BookDataClass> bookDataClassArrayList) {

        try {
            SavePermanentInFile.SaveToFile(bookDataClassArrayList);
        } catch (IOException e) {
            System.out.println("Error in Controlled Saved Data: " + e + " Msg : " + e.getMessage());
            return false;
        }

    return true;
    }

    @Override
    public String fetchBookCover() {
        return FetchBookCoverByFile.fetchBookCoverFromDevice();
    }

    @Override
    public ArrayList<BookDataClass> fetchAllStoredData() {
        try {
            return ReadBookFromFile.fetchAllStoredDataFromFile();
        } catch (IOException e) {
            System.out.println("Error in Controlled Fetched Data: " + e + " Msg : " + e.getMessage());
        }
        return null;
    }

}
