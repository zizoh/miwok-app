package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an arraylist of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "lutti", R.mipmap.ic_launcher));
        words.add(new Word("two", "otiiko", R.mipmap.ic_launcher));
        words.add(new Word("three", "tolookosu", R.mipmap.ic_launcher));
        words.add(new Word("four", "oyyisa", R.mipmap.ic_launcher));
        words.add(new Word("five", "massokka", R.mipmap.ic_launcher));
        words.add(new Word("six", "temmokka", R.mipmap.ic_launcher));
        words.add(new Word("seven", "kenekaku", R.mipmap.ic_launcher));
        words.add(new Word("eight", "kawinta", R.mipmap.ic_launcher));
        words.add(new Word("nine", "wo'e", R.mipmap.ic_launcher));
        words.add(new Word("ten", "na'aacha", R.mipmap.ic_launcher));

        // Create an {@link WordAdapter}, whose data source is a list of {@Word}s. The
        // adapter knows how to create list items in the list
        WordAdapter adapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} created above sox that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument which is the {@link WordAdapter} with the variable name adapter.
        listView.setAdapter(adapter);
    }
}
