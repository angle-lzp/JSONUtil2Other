package com.angle.test;

import com.angle.domain.Gift;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JsonDemo {
    public static void main(String[] args) {
        String jsonStr = "{name:34}";
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        System.out.println(jsonObject);
        System.out.println(jsonObject.optInt("name"));


        List<String> list = new ArrayList<>();
        list.add("making");
        list.add("joining");
        Long[] arr = new Long[]{1L, 2L, 3L, 4L};
        Gift gift = new Gift();
        gift.setName("lucy");
        gift.setAge(22);
        gift.setList(list);
        gift.setArr(arr);
        JSONObject jsonObj = JSONObject.fromObject(gift);
        System.out.println(jsonObj);


    }
}