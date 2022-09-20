package com.example.madlibs_ad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FullStory_AD extends AppCompatActivity {

    float width;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_story_ad);

        Intent intent = getIntent();
        String noun1 = intent.getStringExtra(FillInTheBlanks_AD.NOUN1);
        String verb1 = intent.getStringExtra(FillInTheBlanks_AD.VERB1);
        String adverb1 = intent.getStringExtra(FillInTheBlanks_AD.ADVERB1);
        String verb2 = intent.getStringExtra(FillInTheBlanks_AD.VERB2);
        String pluralnoun = intent.getStringExtra(FillInTheBlanks_AD.PLURALNOUN);
        String adjective1 = intent.getStringExtra(FillInTheBlanks_AD.ADJECTIVE1);
        String adverb2 = intent.getStringExtra(FillInTheBlanks_AD.ADVERB2);
        String adjective2 = intent.getStringExtra(FillInTheBlanks_AD.ADJECTIVE2);

        TextView Noun1 = findViewById(R.id.noun1);
        TextView Verb1 = findViewById(R.id.verb1);
        TextView Adverb1 = findViewById(R.id.adverb1);
        TextView Verb2 = findViewById(R.id.verb2);
        TextView PluralNoun = findViewById(R.id.pluralnoun);
        TextView Adjective1 = findViewById(R.id.adjective1);
        TextView Adverb2 = findViewById(R.id.adverb2);
        TextView Adjective2 = findViewById(R.id.adjective2);

        Noun1.setText(noun1);
        Verb1.setText(verb1);
        Adverb1.setText(adverb1);
        Verb2.setText(verb2);
        PluralNoun.setText(pluralnoun);
        Adjective1.setText(adjective1);
        Adverb2.setText(adverb2);
        Adjective2.setText(adjective2);
    }
}