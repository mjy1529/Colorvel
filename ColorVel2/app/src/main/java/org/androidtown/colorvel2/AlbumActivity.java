package org.androidtown.colorvel2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.openGalleryButton:

                break;
        }
    }
}
