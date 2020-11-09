package com.daleyzou.design.action.visitor;

/**
 * FulltimeEmployee
 * @description TODO
 * @author daleyzou
 * @date 2020年11月09日 13:18
 * @version 1.0.0
 */
public class FulltimeEmployee implements Employee {
    private String name;
    private Double weeklyWage;
    private Double workTime;

    public FulltimeEmployee(String name, Double weeklyWage, Double workTime) {
        this.name = name;
        this.weeklyWage = weeklyWage;
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeeklyWage() {
        return weeklyWage;
    }

    public void setWeeklyWage(Double weeklyWage) {
        this.weeklyWage = weeklyWage;
    }

    public Double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Double workTime) {
        this.workTime = workTime;
    }

    @Override
    public void accept(Department handle) {
        handle.visit(this);
    }
}
