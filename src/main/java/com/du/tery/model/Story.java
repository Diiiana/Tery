package com.du.tery.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
public class Story {

    @Id
    @GeneratedValue
    private UUID storyId;

    @NotNull
    @Column(length = 50)
    private String title;

    @Column(length = 150)
    private String description;

    @Lob
    @Column(length = 1024)
    private String text;

    @ManyToMany(mappedBy = "stories")
    private Set<UserAccount> authors;
}
