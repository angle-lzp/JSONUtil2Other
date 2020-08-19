package com.angle.domain;

import java.util.Arrays;
import java.util.List;

public class Gift {

    private String name;
    private Integer age;
    private List<String> list;
    private Long[] arr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Long[] getArr() {
        return arr;
    }

    public void setArr(Long[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
