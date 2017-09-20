package org.ramizael.jwmeetingsassignments.entities;

import com.orm.SugarRecord;

/**
 * Created by andres.alcantar on 18/09/2017.
 */

public class Person extends SugarRecord {

    private String name;
    private Integer age;
    private Boolean status;

    public Person() {
    }

    public Person(String name, Integer age, Boolean status) {
        this.name = name;
        this.age = age;
        this.status = status;
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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
