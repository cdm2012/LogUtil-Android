package us.the.mac.errorutil;

import android.util.Log;

/**
 * Created by christopher on 1/31/18.
 */

public class LogError {
    public static void e(String message) { Log.e(LogError.class.getName(), message); }
}
