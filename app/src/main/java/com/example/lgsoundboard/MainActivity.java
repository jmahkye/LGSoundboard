package com.example.lgsoundboard;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.Arrays;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.AdListener;

/*
1.
2.
3.
4.
5.
6.
7.
8.
9.
10.
11.
12.
13.
14.
 */

public class MainActivity extends AppCompatActivity {
    SoundPool sp;
    int numSounds = 20;
    int[] sounds = new int[numSounds];
    Button buttons[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new Button[numSounds];

        sp = new SoundPool.Builder()
                .setMaxStreams(25)
                .build();
        sounds[0] = sp.load(this, R.raw.course_he_fuckin_did, 1);
        sounds[1] = sp.load(this, R.raw.best_band_in_the_world, 1);
        sounds[2] = sp.load(this, R.raw.right_then_whos_first_then, 1);
        sounds[3] = sp.load(this, R.raw.smashed_the_gaff_up, 1);
        sounds[4] = sp.load(this, R.raw.how_many_haircuts_you_got_there, 1);
        sounds[5] = sp.load(this, R.raw.cant_wait_to_bump_into_him_one_day, 1);
        sounds[6] = sp.load(this, R.raw.whoppee, 1);
        sounds[7] = sp.load(this, R.raw.more_than_ginger_bollocks, 1);
        sounds[8] = sp.load(this, R.raw.they_should_buy_pg, 1);
        sounds[9] = sp.load(this, R.raw.sh_te_life, 1);
        sounds[10] = sp.load(this, R.raw.bring_back_those_f_cking_days, 1);
        sounds[11] = sp.load(this, R.raw.so_sally_can_wait, 1);
        sounds[12] = sp.load(this, R.raw.scruffy___ing, 1);
        sounds[13] = sp.load(this, R.raw.stop_asking_questions, 1);
        sounds[14] = sp.load(this, R.raw.always_wear_a_condom, 1);
        sounds[15] = sp.load(this, R.raw.being_29_and_very_good_looking, 1);
        sounds[16] = sp.load(this, R.raw.give_me_a_papercut, 1);
        sounds[17] = sp.load(this, R.raw.godlike, 1);
        sounds[18] = sp.load(this, R.raw.theyre_all_in_pain, 1);
        sounds[19] = sp.load(this, R.raw.licking_his_face, 1);


        buttons[0] = (Button) findViewById(R.id.sound1_btn);
        buttons[1] = (Button) findViewById(R.id.sound2_btn);
        buttons[2] = (Button) findViewById(R.id.sound3_btn);
        buttons[3] = (Button) findViewById(R.id.sound4_btn);
        buttons[4] = (Button) findViewById(R.id.sound5_btn);
        buttons[5] = (Button) findViewById(R.id.sound6_btn);
        buttons[6] = (Button) findViewById(R.id.sound7_btn);
        buttons[7] = (Button) findViewById(R.id.sound8_btn);
        buttons[8] = (Button) findViewById(R.id.sound9_btn);
        buttons[9] = (Button) findViewById(R.id.sound10_btn);
        buttons[10] = (Button) findViewById(R.id.sound11_btn);
        buttons[11] = (Button) findViewById(R.id.sound12_btn);
        buttons[12] = (Button) findViewById(R.id.sound13_btn);
        buttons[13] = (Button) findViewById(R.id.sound14_btn);
        buttons[14] = (Button) findViewById(R.id.sound15_btn);
        buttons[15] = (Button) findViewById(R.id.sound16_btn);
        buttons[16] = (Button) findViewById(R.id.sound17_btn);
        buttons[17] = (Button) findViewById(R.id.sound18_btn);
        buttons[18] = (Button) findViewById(R.id.sound19_btn);
        buttons[19] = (Button) findViewById(R.id.sound20_btn);

        for (int i = 0; i<numSounds; i++){
            final int finalI = i;
            buttons[i].setOnClickListener(new Button.OnClickListener() {

                @Override
                public void onClick(View arg0) {
                    //play sound
                    sp.autoPause();
//                    }
                    if (sounds[finalI] != 0) {
                        sp.play(sounds[finalI], 1, 1, 0, 0, 1);
                    }
                }
            });
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
