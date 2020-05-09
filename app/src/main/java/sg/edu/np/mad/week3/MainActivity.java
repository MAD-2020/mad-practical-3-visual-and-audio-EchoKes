package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.telecom.InCallService;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = findViewById(R.id.videoView);
        MediaPlayer media  = MediaPlayer.create(this, R.raw.baby_laughing);
        media.start();

        if(media.isPlaying() != true){      //play audio only once
            media.release();
            media = null;
        }

        video.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rabbid));
        video.start();
    }
}
