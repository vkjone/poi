package cn.lmf.entity;

import java.util.List;

public class ApiFunction {
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
