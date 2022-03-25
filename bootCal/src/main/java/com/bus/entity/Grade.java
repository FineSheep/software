package com.bus.entity;

import javax.persistence.*;

public class Grade {
    @Id
    @Column(name = "grade_id")
    private Integer gradeId;

    private Integer grade;

    @Column(name = "grade_sum")
    private Integer gradeSum;

    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * @return grade_id
     */
    public Integer getGradeId() {
        return gradeId;
    }

    /**
     * @param gradeId
     */
    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * @return grade
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * @param grade
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * @return grade_sum
     */
    public Integer getGradeSum() {
        return gradeSum;
    }

    /**
     * @param gradeSum
     */
    public void setGradeSum(Integer gradeSum) {
        this.gradeSum = gradeSum;
    }

    /**
     * @return admin_id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * @param adminId
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "gradeId=" + gradeId +
                ", grade=" + grade +
                ", gradeSum=" + gradeSum +
                ", adminId=" + adminId +
                '}';
    }
}