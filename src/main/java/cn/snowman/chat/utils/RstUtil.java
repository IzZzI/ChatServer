package cn.snowman.chat.utils;

import cn.snowman.chat.entity.ResultEntity;

public class RstUtil {

    public static ResultEntity setRst(Object body, int rstCode, String msg, int errorCode) {
        ResultEntity result = new ResultEntity();
        if (rstCode == 1) {
            result.setSuccess(true);
        } else {
            result.setSuccess(false);
        }
        result.setErrorCode(errorCode);
        result.setBody(body);
        result.setMsg(msg);
        return result;
    }

    public static ResultEntity setRst(Object body, int rstCode, String msg) {
        ResultEntity result = new ResultEntity();
        if (rstCode == 1) {
            result.setSuccess(true);
        } else {
            result.setSuccess(false);
        }
        result.setBody(body);
        result.setMsg(msg);
        return result;
    }

    public static ResultEntity setRst(Object body, int rstCode, int errorCode) {
        ResultEntity result = new ResultEntity();
        if (rstCode == 1) {
            result.setSuccess(true);
        } else {
            result.setSuccess(false);
        }
        result.setErrorCode(errorCode);
        result.setBody(body);
        return result;
    }

    public static ResultEntity setRst(Object body, int rstCode) {
        ResultEntity result = new ResultEntity();
        if (rstCode == 1) {
            result.setSuccess(true);
        } else {
            result.setSuccess(false);
        }
        result.setBody(body);
        return result;
    }
}
