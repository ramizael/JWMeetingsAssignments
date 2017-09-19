package org.ramizael.jwmeetingsassignments.entities;

import com.orm.SugarRecord;

import java.util.Date;

/**
 * Created by andres.alcantar on 18/09/2017.
 */

public class Assignment extends SugarRecord {
    Role role;
    Date date;
    Person person;

    public Assignment() {
    }


}
