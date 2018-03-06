package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an arraylist of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red",
                "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("green",
                "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("brown",
                "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("gray",
                "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("black",
                "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("white",
                "kelelli", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("dusty yellow",
                "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("mustard yellow",
                "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        // Create an {@link WordAdapter}, whose data source is a list of {@Word}s. The
        // adapter knows how to create list items in the list
        WordAdapter adapter =
                new WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} created above so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument which is the {@link WordAdapter} with the variable name adapter.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the {@link Word} object at the given position the user clicked on
                Word word = words.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getmAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}
