package org.ramizael.jwmeetingsassignments.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import org.ramizael.jwmeetingsassignments.R;
import org.ramizael.jwmeetingsassignments.entities.Person;
import org.ramizael.jwmeetingsassignments.utils.Utils;

public class CreatePersonActivity extends AppCompatActivity {

    CreatePersonActivity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_person);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                savePerson();

                Utils.goToPersonActivity(view, activity);
            }
        });
    }

    private boolean savePerson() {

        EditText name;
        EditText age;
        CheckBox status;

        name = (EditText) findViewById(R.id.person_input_name);
        age = (EditText) findViewById(R.id.person_input_age);
        status = (CheckBox) findViewById(R.id.person_checkBox_status);

        Person person = new Person(name.getText().toString(), Integer.valueOf(age.getText().toString()), status.isChecked());

        person.save();

        return person.getId() != null;

    }

}
