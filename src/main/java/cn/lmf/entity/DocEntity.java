package cn.lmf.entity;

import java.util.List;

public class DocEntity {
    Foreword foreword;
    Overview overview;
    List<ApiInfo> apiInfos;

    public Foreword getForeword() {
        return foreword;
    }

    public void setForeword(Foreword foreword) {
        this.foreword = foreword;
    }

    public Overview getOverview() {
        return overview;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    public List<ApiInfo> getApiInfos() {
        return apiInfos;
    }

    public void setApiInfos(List<ApiInfo> apiInfos) {
        this.apiInfos = apiInfos;
    }
}

class Foreword{
    String purpose;
    String reference;
    List<NounExplain> nounExplains;

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<NounExplain> getNounExplains() {
        return nounExplains;
    }

    public void setNounExplains(List<NounExplain> nounExplains) {
        this.nounExplains = nounExplains;
    }

    static class NounExplain{
        String noun;
        String explain;

        public String getNoun() {
            return noun;
        }

        public void setNoun(String noun) {
            this.noun = noun;
        }

        public String getExplain() {
            return explain;
        }

        public void setExplain(String explain) {
            this.explain = explain;
        }
    }
}

class Overview{
    String background;
    String userType;

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}

class ApiInfo{
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

    static class ApiFunction{
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

    static class ParamInfo{
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
