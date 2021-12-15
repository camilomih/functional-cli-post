package com.platzi.functionalproject;

import java.util.List;
import java.util.Objects;

public class Post {

    private String id;
    private String image;
    private Integer likes;
    private List<String> tags;
    private String text;
    private String publishDate;
    private Object owner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public Object getOwner() {
        return owner;
    }

    public void setOwner(Object owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(id, post.id) && Objects.equals(image, post.image) && Objects.equals(likes, post.likes) && Objects.equals(tags, post.tags) && Objects.equals(text, post.text) && Objects.equals(publishDate, post.publishDate) && Objects.equals(owner, post.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, image, likes, tags, text, publishDate, owner);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", likes=" + likes +
                ", tags=" + tags +
                ", text='" + text + '\'' +
                ", publishDate='" + publishDate + '\'' +
                ", owner=" + owner +
                '}';
    }
}
