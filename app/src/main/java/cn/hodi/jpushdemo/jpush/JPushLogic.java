package cn.hodi.jpushdemo.jpush;

import android.os.Bundle;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by LinJK on 6/21/16.
 */
public class JPushLogic {
    private static final String TAG = "JPushLogic";

    public static void parseNotification(Bundle bundle){
        String id      = bundle.getString(JPushInterface.EXTRA_MSG_ID);
        String title   = bundle.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);
        String message = bundle.getString(JPushInterface.EXTRA_ALERT);

        int notifyId   = bundle.getInt(JPushInterface.EXTRA_NOTIFICATION_ID);

        String bundleString = bundle.getString(JPushInterface.EXTRA_EXTRA);
        Log.i(TAG, "[EXTRA_MSG_ID]: " + id);
        Log.i(TAG, "[EXTRA_NOTIFICATION_TITLE]: " + title);
        Log.i(TAG, "[EXTRA_ALERT]: " + message);
        Log.i(TAG, "[EXTRA_NOTIFICATION_ID]: " + notifyId);
        Log.i(TAG, "[EXTRA_EXTRA]: " + bundleString);
    }

}
