package org.ramizael.jwmeetingsassignments.entities;

import com.orm.SugarRecord;

/**
 * Created by andres.alcantar on 18/09/2017.
 */

public class Person extends SugarRecord {

    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
