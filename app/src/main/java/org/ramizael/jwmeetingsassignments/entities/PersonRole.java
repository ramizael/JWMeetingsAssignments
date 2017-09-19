package org.ramizael.jwmeetingsassignments.entities;

import com.orm.SugarRecord;

/**
 * Created by andres.alcantar on 18/09/2017.
 */

public class PersonRole extends SugarRecord {
    Person person;
    Role role;

    public PersonRole() {
    }

    public PersonRole(Person person, Role role) {
        this.person = person;
        this.role = role;
    }
}
