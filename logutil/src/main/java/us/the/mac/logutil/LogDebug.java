package us.the.mac.logutil;

import android.util.Log;

/**
 * Created by christopher on 1/31/18.
 */

public class LogDebug {
    public static void d(String message) { Log.d(LogDebug.class.getName(), message); }
}
