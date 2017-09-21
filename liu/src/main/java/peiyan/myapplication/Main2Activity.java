package peiyan.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import cn.bluemobi.dylan.photoview.library.PhotoView;


public class Main2Activity extends AppCompatActivity {

    private PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        photoView = (PhotoView) findViewById(R.id.photoView);

        String content = getIntent().getStringExtra("content");

        Glide.with(this).load(content).into(photoView);


    }
}
