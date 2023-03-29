package com.example.facedetection;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class FaceDetection extends Application {

    public static final String Result_Text = "RESULT_TEXT";
    public static final String RESULT_DIALOG = "RESULT_DIALOG";

    @Override
    public void onCreate(){
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
