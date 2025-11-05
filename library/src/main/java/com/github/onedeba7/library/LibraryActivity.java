package com.github.onedeba7.library;



import android.content.Context;
import android.widget.Toast;

/**
 * A simple Android library example
 */
public class LibraryActivity {

    private Context context;

    public LibraryActivity(Context context) {
        this.context = context;
    }

    /**
     * Shows a toast message
     * @param message The message to display
     */
    public void showMessage(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * Gets library version
     * @return Library version string
     */
    public String getVersion() {
        return "1.0.0";
    }

    /**
     * Example utility method
     * @param input String to process
     * @return Processed string
     */
    public String processString(String input) {
        if (input == null) {
            return "";
        }
        return input.trim().toUpperCase();
    }
}
