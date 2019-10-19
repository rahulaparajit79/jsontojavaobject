package jsonparser.mpmodel;


import java.util.List;

public class ResponseObject<T> {

    private int responseCode;
    private String errorDesc;
    T data;

    public String getResponseDesc() {
        return errorDesc;
    }

    public ResponseObject<T> setResponseDesc(String errorDesc) {
        this.errorDesc = errorDesc;
        return this;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public ResponseObject<T> setResponseCode(int errorCode) {
        this.responseCode = errorCode;
        return this;
    }

    public T getData() {
        return data;
    }


    public void setData(T data) {
        this.data = data;
    }

}
