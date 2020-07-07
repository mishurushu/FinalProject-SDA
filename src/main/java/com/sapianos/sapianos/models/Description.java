package com.sapianos.sapianos.models;

import javax.persistence.*;

@Entity
@Table(name = "description")
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "descriptionId")
    private int descriptionId;

    public Description(){

    }

    public Description(int descriptionId) {
        this.descriptionId = descriptionId;
    }

    public int getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }

    @Override
    public String toString() {
        return "Description{" +
                "descriptionId=" + descriptionId +
                '}';
    }
}
