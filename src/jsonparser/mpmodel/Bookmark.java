/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser.mpmodel;

/**
 *
 * @author Rahul
 */
public class Bookmark {

    private int hash;
    private String title;
    private int courseId;
    private int lectureId;
    private double duration;
    private String videoLectureName;

    public Bookmark() {
        this.hash = this.hashCode();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the courseId
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    /**
     * @return the lectureId
     */
    public int getLectureId() {
        return lectureId;
    }

    /**
     * @param lectureId the lectureId to set
     */
    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    /**
     * @return the position
     */
    public double getDuration() {
        return duration;
    }

    /**
     * @param position the position to set
     */
    public void setDuration(double position) {
        this.duration = position;
    }

    /**
     * @return the videoLectureName
     */
    public String getVideoLectureName() {
        return videoLectureName;
    }

    /**
     * @param videoLectureName the videoLectureName to set
     */
    public void setVideoLectureName(String videoLectureName) {
        this.videoLectureName = videoLectureName;
    }

    /**
     * @return the hash
     */
    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

}
