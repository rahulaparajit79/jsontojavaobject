package com.praxis.video.model;

//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//import android.support.annotation.NonNull;


public class Bookmark {


    private int id;
    private String bookmarkName;
    private Long duration;
    private String bookmarkpath;
    private int courseId;
    private int lectureId;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBookmarkName() {
        return bookmarkName;
    }
    public void setBookmarkName(String bookmarkName) {
        this.bookmarkName = bookmarkName;
    }



    public String getBookmarkpath() {
        return bookmarkpath;
    }

    public void setBookmarkpath(String bookmarkpath) {
        this.bookmarkpath = bookmarkpath;
    }


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
