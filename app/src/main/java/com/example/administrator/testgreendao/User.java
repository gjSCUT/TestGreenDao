package com.example.administrator.testgreendao;

import org.greenrobot.greendao.annotation.*;

@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;

    @Property(nameInDb = "USERNAME")
    private String name;

    @NotNull
    private int repos;

    @Transient
    private int tempUsageCount;

    @Generated(hash = 2019277320)
    public User(Long id, String name, int repos) {
        this.id = id;
        this.name = name;
        this.repos = repos;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRepos() {
        return repos;
    }

    public void setRepos(int repos) {
        this.repos = repos;
    }

    public int getTempUsageCount() {
        return tempUsageCount;
    }

    public void setTempUsageCount(int tempUsageCount) {
        this.tempUsageCount = tempUsageCount;
    }
}