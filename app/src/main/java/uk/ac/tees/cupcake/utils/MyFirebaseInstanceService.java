package uk.ac.tees.cupcake.utils;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseInstanceService extends FirebaseMessagingService {

    private static final String TAG="MyFirebaseInstanceService";

    public String onNewToken(String token) {
        token = FirebaseInstanceId.getInstance().getToken();
        return token;
    }
}