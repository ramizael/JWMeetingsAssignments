package org.ramizael.jwmeetingsassignments.entities;

import com.orm.SugarRecord;

import java.util.Date;
import java.util.List;

/**
 * Created by andres.alcantar on 18/09/2017.
 */

public class Meeting extends SugarRecord {

    List<Assignment> assignments;
    Date meetingDate;

    public Meeting() {
    }

    public Meeting(List<Assignment> assignments, Date meetingDate) {
        this.assignments = assignments;
        this.meetingDate = meetingDate;
    }
}
