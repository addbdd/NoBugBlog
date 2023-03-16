package top.nobug.exception;

/**
 * @Description: 非法请求异常
 * @Author: wen
 * @Date: 2023-01-03
 */

public class BadRequestException extends RuntimeException {
	public BadRequestException() {
	}

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}
}
