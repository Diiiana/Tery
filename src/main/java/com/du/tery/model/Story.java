package com.du.tery.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity(name = "STORY")
public class Story {

    @Id
    @GeneratedValue
    @Column(name = "STORY_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "TEXT")
    @Lob
    private String text;

    @Column(name = "DATE")
    private Date date;

    @ManyToMany(mappedBy = "stories")
    private Set<UserAccount> users;
}

