package com.gradedproject.q1;

class AdminDepartment extends SuperDepartment {
    
    public String departmentName() {
        return "Welcome to AdminDepartment";
    }

    public String getTodaysWork() {
        return "complete your documents submissions";
    }

    public String getWorkDeadline() {
        return "complete by EOD";
    }
}