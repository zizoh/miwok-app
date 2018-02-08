package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an arraylist of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus", R.mipmap.ic_launcher));
        words.add(new Word("What is your name?", "tinnә oyaase'nә", R.mipmap.ic_launcher));
        words.add(new Word("My name is...", "oyaaset...", R.mipmap.ic_launcher));
        words.add(new Word("How are you feeling?", "michәksәs?", R.mipmap.ic_launcher));
        words.add(new Word("I’m feeling good.", "kuchi achit", R.mipmap.ic_launcher));
        words.add(new Word("Are you coming?", "әәnәs'aa?", R.mipmap.ic_launcher));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", R.mipmap.ic_launcher));
        words.add(new Word("I’m coming.", "әәnәm", R.mipmap.ic_launcher));
        words.add(new Word("Let’s go.", "yoowutis", R.mipmap.ic_launcher));
        words.add(new Word("Come here.", "әnni'nem", R.mipmap.ic_launcher));

        // Create an {@link WordAdapter}, whose data source is a list of {@Word}s. The
        // adapter knows how to create list items in the list
        WordAdapter adapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} created above so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument which is the {@link WordAdapter} with the variable name adapter.
        listView.setAdapter(adapter);
    }
}
