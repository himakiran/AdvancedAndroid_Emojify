package com.example.android.emojify;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.FaceDetector;


/**
 * Created by userhk on 16/06/17.
 */

public class Emojifier {

    public static String TAG = "EMOJIFIER";

    public void Emojifier(){

    }

    public static void detectFaces(Context context, Bitmap b){

        Frame frame = new Frame.Builder().setBitmap(b).build();

        FaceDetector faceDetector = new FaceDetector.Builder(context)
                .setTrackingEnabled(false)
                .build();

        Log.v(TAG,"No of faces in the pic are  " + faceDetector.detect(frame).size());





    }
}
