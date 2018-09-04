package com.wl.entity;

import java.math.BigDecimal;

public class TbClass {
    private BigDecimal classId;

    private String className;

    private String classIntro;

    public BigDecimal getClassId() {
        return classId;
    }

    public void setClassId(BigDecimal classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getClassIntro() {
        return classIntro;
    }

    public void setClassIntro(String classIntro) {
        this.classIntro = classIntro == null ? null : classIntro.trim();
    }
}