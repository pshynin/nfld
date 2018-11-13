package com.teams.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.UUID;

/**
 * Created by pshynin on Nov, 2018
 *
 * TODO: https://api.nfl.com/docs/league/models/team/index.html#TeamType
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamType {
    private UUID id;
    private int season;
    private String fullName;
    private String nickName;
    private String abbr;
    private String cityStateRegion;

    enum teamType {
        TEAM, PRO
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public String getCityStateRegion() {
        return cityStateRegion;
    }

    public void setCityStateRegion(String cityStateRegion) {
        this.cityStateRegion = cityStateRegion;
    }

    @Override
    public String toString() {
        return "TeamType{" +
                "id=" + id +
                ", season=" + season +
                ", fullName='" + fullName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", abbr='" + abbr + '\'' +
                ", cityStateRegion='" + cityStateRegion + '\'' +
                '}';
    }
}
