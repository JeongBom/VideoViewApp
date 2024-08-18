package com.example.videoviewapp;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView; // 비디오를 띄워주는 뷰
    private MediaController mediaController; // 재생, 정지 미디어 제어 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoView); // 비디오 뷰
        mediaController = new MediaController(this); // 미디어 제어 버튼
        mediaController.setAnchorView(videoView);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.insideout); // 로컬 mp4 파일 uri 생성

        videoView.setMediaController(mediaController); // 미디어 제어 버튼 세팅
        videoView.setVideoURI(uri); // 비디오 주소 연결
        videoView.start(); // 비디오 실행
    }
}
