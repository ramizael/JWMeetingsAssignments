package org.ramizael.jwmeetingsassignments.utils;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.ramizael.jwmeetingsassignments.activities.CreatePersonActivity;
import org.ramizael.jwmeetingsassignments.activities.PersonListActivity;

/**
 * Created by andres.alcantar on 20/09/2017.
 */

public class Utils {

    public static void goToCreatePersonActivity(View view, AppCompatActivity activity) {
        Intent intent = new Intent(activity, CreatePersonActivity.class);
        activity.startActivity(intent);
    }

    public static void goToPersonActivity(View view, AppCompatActivity activity ) {
        Intent intent = new Intent(activity, PersonListActivity.class);
        activity.startActivity(intent);
    }
}
