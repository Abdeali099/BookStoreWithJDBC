/* This will help when user closing frame and not saved data yet! */

package Backend.Listener;

import Frontend.BookStore;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class WindowClosingListener {

    private static BookStore bookStore;

    public static void ValidateWindowClosing(BookStore bookStore) {

        WindowClosingListener.bookStore=bookStore;

            int userChoice = JOptionPane.showConfirmDialog(bookStore, "Are you sure to want to Exit?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

            /* userChoice :
            * 0 -> Yes
            * 1 -> No
            * other -> cancel
            * */

             if (userChoice==0) {
//               bookStore.dispose();
                 System.exit(0);
             }

             else {
                 bookStore.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
             }
    }

}
