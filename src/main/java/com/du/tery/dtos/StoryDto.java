package com.du.tery.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StoryDto {
    private Long id;

    @NonNull
    private String title;

    @NonNull
    private String text;

    private Date date;
}
