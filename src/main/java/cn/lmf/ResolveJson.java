package cn.lmf;

import cn.lmf.entity.DocEntity;
import cn.lmf.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;

public class ResolveJson {
    public static void main(String[] args) {
        String simpleJson = "{\"foreword\":{\"purpose\":\"该文档xxxx\",\"nounExplains\":[{\"noun\":\"token\",\"explain\":\"令牌\"},{\"noun\":\"transid\",\"explain\":\"业务编码\"}],\"reference\":\"12345\"},\"overview\":{\"background\":\"这里填写需求背景\",\"userType\":\"省公司\"},\"apiInfos\":[{\"apiCode\":\"35T00\",\"apiName\":\"全国在网用户数查询\",\"demandSource\":\"北京省公司\",\"description\":\"省公司可以通过该接口查询全国在网物联卡用户数（除已销户的所有OneLink-PB和OneLink-CT的物联卡总数）\",\"rules\":[\"该接口面向所有省公司客户\"],\"apiFunction\":{\"apiUrl\":\"pr/query/national-user-total\",\"requestMethod\":\"POST/GET\",\"requestParams\":[{\"name\":\"msisdn\",\"required\":true,\"defaultValue\":\"\",\"detail\":\"一种卡号\"},{\"name\":\"date\",\"required\":\"false\",\"default\":\"\",\"detail\":\"日期\"}],\"responseParams\":[{\"name\":\"totalCount\",\"required\":\"true\",\"default\":\"\",\"detail\":\"全国在网用户数\"}]}}]}";
        String json = "{\"foreword\":{\"purpose\":\"该文档xxxx\",\"noun\":[\"token\",\"transid\",\"msisdn\"],\"explain\":[\"令牌\",\"业务编码\",\"卡号\"],\"nounExplain\":[{\"noun\":\"token\",\"explain\":\"令牌\"},{\"noun\":\"transid\",\"explain\":\"业务编码\"}],\"reference\":\"12345\"},\"overview\":{\"backgroud\":\"这里填写需求背景\",\"userType\":\"省公司\"},\"apis\":[{\"apiCode\":\"35T00\",\"apiName\":\"全国在网用户数查询\",\"demandSource\":\"北京省公司\",\"description\":\"省公司可以通过该接口查询全国在网物联卡用户数（除已销户的所有OneLink-PB和OneLink-CT的物联卡总数）\",\"rules\":[\"该接口面向所有省公司客户\"],\"function\":{\"apiUrl\":\"pr/query/national-user-total\",\"requestMethod\":\"POST/GET\",\"requestParams\":[{\"name\":\"msisdn\",\"required\":true,\"defaultValue\":\"\",\"detail\":\"一种卡号\"},{\"name\":\"date\",\"required\":\"false\",\"default\":\"\",\"detail\":\"日期\"}],\"responseParams\":[{\"name\":\"totalCount\",\"required\":\"true\",\"default\":\"\",\"detail\":\"全国在网用户数\"}]}}]}";
        DocEntity entity = JsonUtil.parseJson(simpleJson, new TypeReference<DocEntity>() {});
        System.out.println(entity);
    }
}
