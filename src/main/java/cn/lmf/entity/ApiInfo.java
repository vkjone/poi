package cn.lmf.entity;

import java.util.List;

public class ApiInfo {
    String apiCode;
    String apiName;
    String demandSource;
    String description;
    List<String> rules;
    ApiFunction apiFunction;

    public String getApiCode() {
        return apiCode;
    }

    public void setApiCode(String apiCode) {
        this.apiCode = apiCode;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getDemandSource() {
        return demandSource;
    }

    public void setDemandSource(String demandSource) {
        this.demandSource = demandSource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getRules() {
        return rules;
    }

    public void setRules(List<String> rules) {
        this.rules = rules;
    }

    public ApiFunction getApiFunction() {
        return apiFunction;
    }

    public void setApiFunction(ApiFunction apiFunction) {
        this.apiFunction = apiFunction;
    }
}
