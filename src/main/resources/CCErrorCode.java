public enum CCErrorCode { 
	SUCCESS("0", "正确", "正确"),
	ERR12141("12141", "当前停机原因不符合自主发起复机操作要求,只有主动申请停机一个原因的才允许自主复机", "当前停机原因不符合自主发起复机操作要求,只有主动申请停机一个原因的才允许自主复机"),
	ERR12142("12142", "不知道", "不知道"),

    /**
     * 错误码
     */
    private String code;
    /**
     * 错误描述
     */
    private String msg;

    /**
     * 描述
     * V5详细解释
     * 主要用于内部错误信息描述
     */
    private String description;

    CCErrorCode(String code, String msg, String description) {
        this.code = code;
        this.msg = msg;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getDescription() {
        return description;
    }

    public void setCode(String code) { this.code = code; }

    public void setMsg(String msg) { this.msg = msg; }

    public void setDescription(String description) { this.description = description; }
}
