/* This will help Save operation to know Save changes or not
* It will set '*' in title.
* */

package Backend.Listener;

import Frontend.BookStore;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BookKeyListener implements KeyListener {
    BookStore bookStore;
    public static boolean TitleFlag=false;

    public BookKeyListener(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    @Override
    public void keyTyped(KeyEvent e) {

        /* Some TextFiled Are changes */

        // Set this to once Until :Save done

        if (!TitleFlag) {
            bookStore.setTitle("*Book Store (Unsaved)");
            TitleFlag=true;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
