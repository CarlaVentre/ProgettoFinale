package com.mcs.be.course.dto;


import java.io.Serializable;
import java.math.BigDecimal;

public class ArticleDto implements Serializable {

    private Long id;
    private String title;
    private String picture;
    private String plot;
    private BigDecimal cost;
    private String tag;
    private Boolean like;

    public ArticleDto() {
    }

    public ArticleDto(Long id, String title, String picture, String plot, BigDecimal cost, String tag, Boolean like) {
        this.id = id;
        this.title = title;
        this.picture = picture;
        this.plot = plot;
        this.cost=cost;
        this.tag = tag;
        this.like = like;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getLike() {
        return like;
    }

    public void setLike(Boolean like) {
        this.like = like;
    }

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

    
}
