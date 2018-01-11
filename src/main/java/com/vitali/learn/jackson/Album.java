package com.vitali.learn.jackson;

import lombok.Getter;

@Getter
public class Album {

    private String title;

    public Album(String title) {
        this.title = title;
    }
}
