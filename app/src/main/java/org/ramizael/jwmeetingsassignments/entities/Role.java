package org.ramizael.jwmeetingsassignments.entities;

import com.orm.SugarRecord;

/**
 * Created by andres.alcantar on 18/09/2017.
 */

public class Role extends SugarRecord {
    String roleName;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }
}
