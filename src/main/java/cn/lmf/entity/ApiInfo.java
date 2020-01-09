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

    static class ApiFunction {
        String apiUrl;
        String requestMethod;
        List<ParamInfo> requestParams;
        List<ParamInfo> responseParams;

        public String getApiUrl() {
            return apiUrl;
        }

        public void setApiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
        }

        public String getRequestMethod() {
            return requestMethod;
        }

        public void setRequestMethod(String requestMethod) {
            this.requestMethod = requestMethod;
        }

        public List<ParamInfo> getRequestParams() {
            return requestParams;
        }

        public void setRequestParams(List<ParamInfo> requestParams) {
            this.requestParams = requestParams;
        }

        public List<ParamInfo> getResponseParams() {
            return responseParams;
        }

        public void setResponseParams(List<ParamInfo> responseParams) {
            this.responseParams = responseParams;
        }
    }

    static class ParamInfo {
        String name;
        String required;
        String defaultValue;
        String detail;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRequired() {
            return required;
        }

        public void setRequired(String required) {
            this.required = required;
        }

        public String getDefaultValue() {
            return defaultValue;
        }

        public void setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }
    }
}
