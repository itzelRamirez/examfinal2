package com.training.finalexam.demo;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

public class pet {
        @Entity
        @Getter
        @Setter
        public class Pet extends DatabaseObject {

            @Column(name = "name", nullable = false)
            public String Name;

            @Column(name = "raceName", nullable = false)
            public String raceName;

            @Column(animaltype = "aminalType", unique = true, nullable = false)
            public String animalType;

            public Integer age;

            @Enumerated(EnumType.STRING)
            @Column(name = "academic")

            @OneToOne(cascade = CascadeType.ALL)
            public animaltipe animalType;

            @Column
            private String columnaDePrueba;


            @Column(name = "uuid", nullable = false, updatable = false)
            private String uniqueId;

            public Pet(String Name, String raceName, String animalType, Integer age, String uuid) {
                this.Name = Name;
                this.raceName = raceName;
                this.animalType = animalType;
                this.age = age;
            }

            public Pet(String Name, String raceName, String animalType, Integer age, String uuid) {
                this(Name, raceName,animalType, age, uuid);
            }


            }


        }
