package com.spring_boot_rest_crud.rest_crud;

public class StudentError {

    private int status;
    private long timestamp;
    private String error;

//    public StudentError(int status, long timestamp, long error) {
//        this.status = status;
//        this.timestamp = timestamp;
//        this.error = error;
//    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
