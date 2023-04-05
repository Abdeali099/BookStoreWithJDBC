package Backend.FileManagment;

import Backend.Modal.BookDataClass;

import java.io.*;
import java.util.ArrayList;

public class SavePermanentInFile {

    private static final String dataFilePath="src\\Data\\AllBooksData.dat";
    private static FileOutputStream fos=null;
    private static ObjectOutputStream addBookInFile=null;


    /* -- Method --*/
    public static void SaveToFile(ArrayList<BookDataClass> bookDataClassArrayList) throws IOException {

            try {
                /* Initialize File  Output class */
                fos=new FileOutputStream(dataFilePath);

                /* Initialize Data Object file class */
                addBookInFile = new ObjectOutputStream(fos);

               /* Add whole arrayList in the File  */
                addBookInFile.writeObject(bookDataClassArrayList);

                /* Clear memory*/
                addBookInFile.flush();

            } catch (Exception e) {
                System.out.println("Error in Adding in file once : " + e + " Msg : " + e.getMessage());
            } finally {
                if (addBookInFile!=null){
                    addBookInFile.close();
                }
                if (fos!=null) {
                    fos.close();
                }
            }

    }
}
