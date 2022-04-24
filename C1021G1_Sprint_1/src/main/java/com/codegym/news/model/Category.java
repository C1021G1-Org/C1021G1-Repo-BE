package com.codegym.news.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @Id
    private Integer id;

    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<News> news;

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<News> getNews() {
        return news;
    }

    public void setNews(Set<News> news) {
        this.news = news;
    }
}
