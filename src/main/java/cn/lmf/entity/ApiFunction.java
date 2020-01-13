package cn.lmf.entity;

import java.util.List;

public class ApiFunction {
    String apiUrl;
    String requestMethod;
    List<ParamInfo> requestParams;
    List<ParamInfo> responseParams;
    List<String> successResponseExample;
    List<String> failResponseExample;

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

    public List<String> getSuccessResponseExample() {
        return successResponseExample;
    }

    public void setSuccessResponseExample(List<String> successResponseExample) {
        this.successResponseExample = successResponseExample;
    }

    public List<String> getFailResponseExample() {
        return failResponseExample;
    }

    public void setFailResponseExample(List<String> failResponseExample) {
        this.failResponseExample = failResponseExample;
    }
}
