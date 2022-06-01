package com.apple.json;

import com.alibaba.fastjson.JSONObject;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JSONDemo001 {
    public static void main(String[] args) {
        JSONObject myj = new JSONObject();
        myj.put("name", "jiaojiao");
        myj.put("age", "18");
        myj.put("city", "beijing");

        System.out.println(myj.toJSONString());

        filter(myj);

        System.out.println(myj.toJSONString());
    }

    public static void filter(JSONObject obj) {
        //获取json对象的封装的键值对集合
        Set<Map.Entry<String, Object>> entrySet = obj.entrySet();
        //获取迭代器对象   因为对集合进行遍历的时候，需要使用迭代器进行删除
        Iterator<Map.Entry<String, Object>> it = entrySet.iterator();
        //对集合中元素进行迭代
        for (; it.hasNext(); ) {
            //得到json中的一个键值对
            Map.Entry<String, Object> entry = it.next();
            //如果sink_columns中不包含  遍历出的属性    将其删除
            if ("age".equals(entry.getKey())) {
                it.remove();
            }
        }
    }
}
