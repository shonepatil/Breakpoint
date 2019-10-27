package rkr.simplekeyboard.inputmethod.keyboard;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.MotionEvent;



public class SentimentAnalysis{

    MotionEvent event;


    public String extractString() {

        final int index = event.getActionIndex();
        final int id = event.getPointerId(index);
        Log.d("Detector", PointerTracker.getPointerTracker(id).getLetters());
        return PointerTracker.getPointerTracker(id).getLetters();
    }


//    SentimentAnalysis bob = new SentimentAnalysis();
//    Log.d("String", bob.extractString());

}
