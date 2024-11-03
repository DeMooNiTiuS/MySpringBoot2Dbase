package ru.massalskiy.MySpringBoot2Dbase.entity;

import lombok.Getter;

@Getter
public class ActionResult<T> {
    private final T Value;
    private final boolean status;
    public ActionResult(T value, boolean status) {
        Value = value;
        this.status = status;
    }
}