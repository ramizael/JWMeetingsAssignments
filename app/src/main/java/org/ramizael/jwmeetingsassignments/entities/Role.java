package org.ramizael.jwmeetingsassignments.entities;

import com.orm.SugarRecord;
import com.orm.dsl.Unique;

/**
 * Created by andres.alcantar on 18/09/2017.
 */

public class Role extends SugarRecord {
    @Unique
    String roleName;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }
}
