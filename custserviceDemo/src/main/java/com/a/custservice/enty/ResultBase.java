package com.a.custservice.enty;

import java.io.Serializable;

public class ResultBase implements Serializable{

	private String  result= "1";
    private String  message= "成功";
    
    public ResultBase(String result,String message) {
        this.result = result;
        this.message = message;
    }
    public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private Object data;

    public ResultBase() {
        super();
    }
    
    public ResultBase(Object data) {
        this.data = data;
    }

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
    
}
