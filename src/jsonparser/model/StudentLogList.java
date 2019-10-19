/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser.model;

import java.util.List;

/**
 *
 * @author rahul-ubuntu
 */
public class StudentLogList {
    
    private List<StudentLogDetails> studentLogs;

    /**
     * @return the studentLogs
     */
    public List<StudentLogDetails> getStudentLogs() {
        return studentLogs;
    }

    /**
     * @param studentLogs the studentLogs to set
     */
    public void setStudentLogs(List<StudentLogDetails> studentLogs) {
        this.studentLogs = studentLogs;
    }
    
    public void appendLogs(List<StudentLogDetails> studentLogs) {
        this.studentLogs.addAll(studentLogs);
    }
    
}
