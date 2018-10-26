package com.qcwoshou.exception;

import com.qcwoshou.core.exception.BaseServiceException;

import java.io.Serializable;

public class GoodsException extends BaseServiceException implements Serializable{

	private static final long serialVersionUID = 8279565169607633172L;

	public GoodsException(Integer responseCode, String responseMsg) {
		super(responseCode, responseMsg);
	}

	public GoodsException(Integer responseCode) {
		super(responseCode);
	}
}
