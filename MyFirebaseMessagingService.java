
package com.pushnotificationapp;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import android.util.Log;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d("FCM", "Message received: " + remoteMessage.getNotification().getBody());
    }

    @Override
    public void onNewToken(String token) {
        Log.d("FCM", "New token: " + token);
    }
}
