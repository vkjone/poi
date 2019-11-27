package cn.lmf.entity;

public class ErrorCodeMetadata {
    private String errorCode;
    private String ccmpErrorCode;
    private String msg;
    private String desc;
    private String errorCodeType;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getCcmpErrorCode() {
        return ccmpErrorCode;
    }

    public void setCcmpErrorCode(String ccmpErrorCode) {
        this.ccmpErrorCode = ccmpErrorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getErrorCodeType() {
        return errorCodeType;
    }

    public void setErrorCodeType(String errorCodeType) {
        this.errorCodeType = errorCodeType;
    }
}
