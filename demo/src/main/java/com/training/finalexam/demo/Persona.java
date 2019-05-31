package com.training.finalexam.demo;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.List;

public class Persona {
    @Entity
    @Getter
    @Setter
    public class Student extends DatabaseObject {

        @Column(name = "name", nullable = false)
        private String Name;

        @Column(name = "last_name", nullable = false)
        private String lastName;

        @Column(listpets = "listpets", unique = true, nullable = false)
        private String listpets;

        private Integer age;

        @Enumerated(EnumType.STRING)
        @Column(name = "academic")
        private Academic academic;

        @OneToOne(cascade = CascadeType.ALL)
        private listpets listpets;

        @Column
        private String columnaDePrueba;

        @OneToMany(fetch = FetchType.LAZY)
        private List<Course> courses;

        @Column(name = "uuid", nullable = false, updatable = false)
        private String uniqueId;

        public Student(String Name, String lastName, String listpets, Integer age, String uuid, Academic academic) {
            this.Name = Name;
            this.lastName = lastName;
            this.listpets = listpets;
            this.age = age;
            this.uniqueId = uuid;
            this.academic = academic;
        }

        public Student(String firstName, String lastName, String listpets, Integer age, String uuid) {
            this(firstName, lastName,listpets, age, uuid, Academic.REGULAR);
        }

        public Student(String firstName, String lastName, String listpets, String uuid) {
            this(firstName, lastName, listpets,null, uuid);
        }


}
