package com.gradedproject.q1;

public class main{
public static void main(String[] args) {
    // AdminDepartment
    AdminDepartment adminDept = new AdminDepartment();
    System.out.println(adminDept.departmentName());
    System.out.println(adminDept.getTodaysWork());
    System.out.println(adminDept.getWorkDeadline());
    System.out.println(adminDept.isTodayAHoliday());
    System.out.println();
    // HrDepartment
    HrDepartment hrDept = new HrDepartment();
    System.out.println(hrDept.departmentName());
    System.out.println(hrDept.doActivity());
    System.out.println(hrDept.getTodaysWork());
    System.out.println(hrDept.getWorkDeadline());
    System.out.println(hrDept.isTodayAHoliday());
    System.out.println();
    // TechDepartment
    TechDepartment techDept = new TechDepartment();
    System.out.println(techDept.departmentName());
    System.out.println(techDept.getTodaysWork());
    System.out.println(techDept.getWorkDeadline());
    System.out.println(techDept.getTechStackInformation());
    System.out.println(techDept.isTodayAHoliday());

}
}