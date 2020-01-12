package cn.lmf;

import cn.lmf.entity.DocEntity;
import cn.lmf.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;

public class ResolveJson {
    public static DocEntity resovle() {
        String demoJson = "{\n" +
                "  \"version\": \"5.2.1\",\n" +
                "  \"author\": \"lmf\",\n" +
                "  \"foreword\": {\n" +
                "    \"purpose\": \"该文档xxxx\",\n" +
                "    \"nounExplains\": [{\n" +
                "      \"noun\": \"token\",\n" +
                "      \"explain\": \"令牌\"\n" +
                "    },\n" +
                "      {\n" +
                "        \"noun\": \"transid\",\n" +
                "        \"explain\": \"业务编码\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"reference\": \"12345\"\n" +
                "  },\n" +
                "  \"overview\": {\n" +
                "    \"background\": \"这里填写需求背景\",\n" +
                "    \"userType\": \"省公司\"\n" +
                "  },\n" +
                "  \"apiInfos\": [{\n" +
                "    \"apiCode\": \"35T00\",\n" +
                "    \"apiName\": \"全国在网用户数查询\",\n" +
                "    \"demandSource\": \"北京省公司\",\n" +
                "    \"description\": \"省公司可以通过该接口查询全国在网物联卡用户数（除已销户的所有OneLink-PB和OneLink-CT的物联卡总数）\",\n" +
                "    \"rules\": [\"该接口面向所有省公司客户\"],\n" +
                "    \"apiFunction\": {\n" +
                "      \"apiUrl\": \"pr/query/national-user-total\",\n" +
                "      \"requestMethod\": \"POST/GET\",\n" +
                "      \"requestParams\": [{\n" +
                "        \"name\": \"msisdn\",\n" +
                "        \"required\": true,\n" +
                "        \"defaultValue\": \"\",\n" +
                "        \"detail\": \"一种卡号\"\n" +
                "      },\n" +
                "        {\n" +
                "          \"name\": \"date\",\n" +
                "          \"required\": \"false\",\n" +
                "          \"default\": \"\",\n" +
                "          \"detail\": \"日期\"\n" +
                "        }\n" +
                "      ],\n" +
                "\n" +
                "      \"responseParams\": [{\n" +
                "        \"name\": \"totalCount\",\n" +
                "        \"required\": \"true\",\n" +
                "        \"default\": \"\",\n" +
                "        \"detail\": \"全国在网用户数\"\n" +
                "      }]\n" +
                "    }\n" +
                "  }]\n" +
                "}";
        String simpleJson = "{\"foreword\":{\"purpose\":\"该文档xxxx\",\"nounExplains\":[{\"noun\":\"token\",\"explain\":\"令牌\"},{\"noun\":\"transid\",\"explain\":\"业务编码\"}],\"reference\":\"12345\"},\"overview\":{\"background\":\"这里填写需求背景\",\"userType\":\"省公司\"},\"apiInfos\":[{\"apiCode\":\"35T00\",\"apiName\":\"全国在网用户数查询\",\"demandSource\":\"北京省公司\",\"description\":\"省公司可以通过该接口查询全国在网物联卡用户数（除已销户的所有OneLink-PB和OneLink-CT的物联卡总数）\",\"rules\":[\"该接口面向所有省公司客户\"],\"apiFunction\":{\"apiUrl\":\"pr/query/national-user-total\",\"requestMethod\":\"POST/GET\",\"requestParams\":[{\"name\":\"msisdn\",\"required\":true,\"defaultValue\":\"\",\"detail\":\"一种卡号\"},{\"name\":\"date\",\"required\":\"false\",\"default\":\"\",\"detail\":\"日期\"}],\"responseParams\":[{\"name\":\"totalCount\",\"required\":\"true\",\"default\":\"\",\"detail\":\"全国在网用户数\"}]}}]}";
        String json = "{\"foreword\":{\"purpose\":\"该文档xxxx\",\"noun\":[\"token\",\"transid\",\"msisdn\"],\"explain\":[\"令牌\",\"业务编码\",\"卡号\"],\"nounExplain\":[{\"noun\":\"token\",\"explain\":\"令牌\"},{\"noun\":\"transid\",\"explain\":\"业务编码\"}],\"reference\":\"12345\"},\"overview\":{\"backgroud\":\"这里填写需求背景\",\"userType\":\"省公司\"},\"apis\":[{\"apiCode\":\"35T00\",\"apiName\":\"全国在网用户数查询\",\"demandSource\":\"北京省公司\",\"description\":\"省公司可以通过该接口查询全国在网物联卡用户数（除已销户的所有OneLink-PB和OneLink-CT的物联卡总数）\",\"rules\":[\"该接口面向所有省公司客户\"],\"function\":{\"apiUrl\":\"pr/query/national-user-total\",\"requestMethod\":\"POST/GET\",\"requestParams\":[{\"name\":\"msisdn\",\"required\":true,\"defaultValue\":\"\",\"detail\":\"一种卡号\"},{\"name\":\"date\",\"required\":\"false\",\"default\":\"\",\"detail\":\"日期\"}],\"responseParams\":[{\"name\":\"totalCount\",\"required\":\"true\",\"default\":\"\",\"detail\":\"全国在网用户数\"}]}}]}";
        DocEntity entity = JsonUtil.parseJson(demoJson, new TypeReference<DocEntity>() {
        });
        System.out.println(entity);
        return entity;
    }
}
