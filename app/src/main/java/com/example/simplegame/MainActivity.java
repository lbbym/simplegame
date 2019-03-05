package com.example.simplegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Map<String,String> picmap = new HashMap<>();
    public MainActivity() {
        picmap.put(String.valueOf(R.drawable.bear), "bear");
        picmap.put(String.valueOf(R.drawable.bird), "bird");
        picmap.put(String.valueOf(R.drawable.cat), "cat");
        picmap.put(String.valueOf(R.drawable.fish), "fish");
        picmap.put(String.valueOf(R.drawable.pig), "pig");
        picmap.put(String.valueOf(R.drawable.tiger), "tiger");
    }
    int[] pic = {R.drawable.bear, R.drawable.bird, R.drawable.cat, R.drawable.fish, R.drawable.pig, R.drawable.tiger};
    static int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void playClick(View view) {
        setContentView(R.layout.game_view);
    }

    public void animalClick0(View view) {
        ((ImageView)findViewById(R.id.animalView0)).setImageResource(pic[0]);
        /*Log.d("a",picmap.get(String.valueOf(pic[0])));
        Log.d("b",String.valueOf( ((TextView)findViewById(R.id.animalText)).getText() ));
        Log.d("c", String.valueOf(picmap.get(String.valueOf(pic[0])) == String.valueOf( ((TextView)findViewById(R.id.animalText)).getText() )));*/
        if ( picmap.get(String.valueOf(pic[0])).equals(String.valueOf( ((TextView)findViewById(R.id.animalText)).getText())) ){
            //((TextView)findViewById(R.id.score_view)).setText("1");
            score++;
            ((ImageView)findViewById(R.id.animalView0)).setImageResource(pic[1]);
            ((ImageView)findViewById(R.id.animalView3)).setImageResource(pic[0]);
            ((TextView)findViewById(R.id.animalText)).setText("cat");
            ((TextView)findViewById(R.id.score_view)).setText(String.valueOf(score));
            if (score == 3){
                setContentView(R.layout.success_view);
            }
        } else {
            setContentView(R.layout.fail_view);
        }
    }

    public void animalClick2(View view) {
        ((ImageView)findViewById(R.id.animalView2)).setImageResource(pic[2]);
        if ( picmap.get(String.valueOf(pic[2])).equals(String.valueOf( ((TextView)findViewById(R.id.animalText)).getText())) ){
            //((TextView)findViewById(R.id.score_view)).setText("1");
            score++;
            ((ImageView)findViewById(R.id.animalView2)).setImageResource(pic[3]);
            ((ImageView)findViewById(R.id.animalView3)).setImageResource(pic[4]);
            ((ImageView)findViewById(R.id.animalView1)).setImageResource(pic[5]);
            ((TextView)findViewById(R.id.animalText)).setText("tiger");
            ((TextView)findViewById(R.id.score_view)).setText(String.valueOf(score));

            if (score == 3){
                setContentView(R.layout.success_view);
            }
        } else {
            setContentView(R.layout.fail_view);
        }
    }

    public void animalClick1(View view) {
        ((ImageView)findViewById(R.id.animalView1)).setImageResource(pic[5]);
        if ( picmap.get(String.valueOf(pic[5])).equals(String.valueOf( ((TextView)findViewById(R.id.animalText)).getText())) ){
            //((TextView)findViewById(R.id.score_view)).setText("1");
            score++;
            ((ImageView)findViewById(R.id.animalView0)).setImageResource(pic[3]);
            ((ImageView)findViewById(R.id.animalView3)).setImageResource(pic[2]);
            ((ImageView)findViewById(R.id.animalView2)).setImageResource(pic[0]);
            ((TextView)findViewById(R.id.score_view)).setText(String.valueOf(score));

            if (score == 3){
                setContentView(R.layout.success_view);
            }
        } else {
            setContentView(R.layout.fail_view);
        }
    }

    public void animalClick3(View view) {
        setContentView(R.layout.fail_view);
    }

    public  void again(View view) {
        score = 0;
        setContentView(R.layout.game_view);
    }
}
