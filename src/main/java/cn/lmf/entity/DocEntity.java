package cn.lmf.entity;

import java.util.List;

public class DocEntity {
    String author;
    String version;
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
