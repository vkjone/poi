/*
 * Copyright (c) 2017, China Mobile IOT All Rights Reserved.
 */

package cn.lmf.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * json工具类, 基于jackson. fastjson在特定情况下的序列化/反序列化有问题 <br/>
 * 2017年2月23日 GaoYili v1.0.0
 */
public final class JsonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
    }

    /**
     * 使用泛型方法，把json字符串转换为相应的JavaBean对象。 <br/>
     * (1)转换为普通parse(json,User.class) <br/>
     * (2)转换为List,如 List(User) ,将第二个参数传递为User[].class. <br/>
     * 然后使用Arrays.asList();方法把得到的数组转换为特定类型的List
     *
     * @param jsonStr
     * @param valueType
     * @return
     */
    public static <T> T parseJson(String jsonStr, Class<T> valueType) {
        try {
            return objectMapper.readValue(jsonStr, valueType);
        } catch (Exception e) {
            System.out.println("解析json错误");
            return null;
        }
    }

    /**
     * 处理复杂泛型
     * 
     * @param jsonStr
     * @param typeReference
     * @param <T>
     * @return
     */
    public static <T> T parseJson(String jsonStr, TypeReference typeReference) {
        try {
            return objectMapper.readValue(jsonStr, typeReference);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("解析json错误");
            return null;
        }
    }

    /**
     * Map 转obj
     * 
     * @param map
     * @param valueType
     * @param <T>
     * @return
     */
    public static <T> T parseObject(Map map, Class<T> valueType) {
        try {
            return objectMapper.convertValue(map, valueType);
        } catch (Exception e) {
            System.out.println("解析json错误");
            return null;
        }
    }

    /**
     * 泛型支持多级节点转换为相应JavaBean
     * 
     * @param jsonStr
     * @param parentClass
     * @param elementClasses
     * @param <T>
     * @return
     */
    public static <T> T parseJson(String jsonStr, Class<?> parentClass, Class<?>... elementClasses) {
        JavaType javaType = getCollectionType(parentClass, elementClasses);
        try {
            return objectMapper.readValue(jsonStr, javaType);
        } catch (IOException e) {
            System.out.println("解析json错误");
            return null;
        }
    }

    /**
     * 把JavaBean转换为json字符串
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            System.out.println("解析json错误");
            return null;
        }
    }

    public static <T> List<T> parseList(String jsonStr, Class<T> c) {
        JavaType javaType = getCollectionType(ArrayList.class, c);
        try {
            return objectMapper.readValue(jsonStr, javaType);
        } catch (IOException e) {
            System.out.println("解析json错误");
            return null;
        }
    }

    private static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        return objectMapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }
}
