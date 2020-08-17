package cn.design.demo;

import com.google.common.collect.Maps;
import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * @author zhangkun
 * @create 2020-08-13 10:16 AM
 * @desc
 **/

public class TestContoller {


    public static void main(String[] args) {
        TreeRangeMap<Integer,Integer> map = TreeRangeMap.create();
        System.out.println("closed:"+ Range.closed(1, 2));
        map.put(Range.closed(1, 5), 1);

        map.put(Range.closed(2, 6), 2);
        map.put(Range.closed(4, 8), 3);

        System.out.println(JSON.toJSONString(map));
        Integer i =   map.get(6);
        System.out.println(i);
    }
}
