package com.example.madlibs_ad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class FillInTheBlanks_AD extends AppCompatActivity {
    public static final String NOUN1 = "NOUN1";
    public static final String VERB1 = "VERB1";
    public static final String ADVERB1 = "ADVERB1";
    public static final String VERB2 = "VERB2";
    public static final String PLURALNOUN = "PLURALNOUN";
    public static final String ADJECTIVE1 = "ADJECTIVE1";
    public static final String ADVERB2 = "ADVERB2";
    public static final String ADJECTIVE2 = "ADJECTIVE2";
    public boolean canAdvance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_in_the_blanks_ad);
    }
    public void submitWords(View view){
        canAdvance = true;
        Intent intent = new Intent(this, FullStory_AD.class);
        EditText noun1 = (EditText) findViewById(R.id.editTextTextPersonName);
        if(TextUtils.isEmpty(noun1.getText().toString())){
            noun1.setError("Missing noun");
            canAdvance = false;
        }
        else {
            intent.putExtra(NOUN1, noun1.getText().toString());
        }
        EditText verb1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        if(TextUtils.isEmpty(verb1.getText().toString())){
            verb1.setError("Missing verb");
            canAdvance = false;
        }
        else {
            intent.putExtra(VERB1, verb1.getText().toString());
        }
        EditText adverb1 = (EditText) findViewById(R.id.editTextTextPersonName3);
        if(TextUtils.isEmpty(adverb1.getText().toString())){
            adverb1.setError("Missing adverb");
            canAdvance = false;
        }
        else{
            intent.putExtra(ADVERB1, adverb1.getText().toString());
        }
        EditText verb2 = (EditText) findViewById(R.id.editTextTextPersonName4);
        if(TextUtils.isEmpty(verb2.getText().toString())){
            verb2.setError("Missing verb");
            canAdvance = false;
        }
        else{
            intent.putExtra(VERB2, verb2.getText().toString());
        }
        EditText pluralnoun = (EditText) findViewById(R.id.editTextTextPersonName5);
        if(TextUtils.isEmpty(pluralnoun.getText().toString())){
            pluralnoun.setError("Missing plural noun");
            canAdvance = false;
        }
        else{
            intent.putExtra(PLURALNOUN, pluralnoun.getText().toString());
        }
        EditText adjective1 = (EditText) findViewById(R.id.editTextTextPersonName6);
        if(TextUtils.isEmpty(adjective1.getText().toString())){
            adjective1.setError("Missing adjective");
            canAdvance = false;
        }
        else {
            intent.putExtra(ADJECTIVE1, adjective1.getText().toString());
        }
        EditText adverb2 = (EditText) findViewById(R.id.editTextTextPersonName7);
        if(TextUtils.isEmpty(adverb2.getText().toString())){
            adverb2.setError("Missing adverb");
            canAdvance = false;
        }
        else{
            intent.putExtra(ADVERB2, adverb2.getText().toString());
        }
        EditText adjective2 = (EditText) findViewById(R.id.editTextTextPersonName8);
        if(TextUtils.isEmpty(adjective2.getText().toString())){
            adjective2.setError("Missing adjective");
            canAdvance = false;
        }
        else{
            intent.putExtra(ADJECTIVE2, adjective2.getText().toString());
        }
        if(canAdvance){
            startActivity(intent);
        }
    }
}