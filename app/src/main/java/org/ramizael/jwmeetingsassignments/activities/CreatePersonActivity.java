package org.ramizael.jwmeetingsassignments.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import org.ramizael.jwmeetingsassignments.R;
import org.ramizael.jwmeetingsassignments.entities.Person;

public class CreatePersonActivity extends AppCompatActivity {



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

                boolean success = savePerson();



                Snackbar.make(view, "Person added " + success, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private boolean savePerson() {

        EditText name;
        EditText age;

        name = (EditText) findViewById(R.id.person_input_name);
        age = (EditText) findViewById(R.id.person_input_age);

        Person person = new Person(name.getText().toString(), Integer.valueOf(age.getText().toString()));

        person.update();


        return person.getId() != null && Person.findById(Person.class, person.getId()) != null;

    }

}