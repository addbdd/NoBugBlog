package top.nobug.exception;

/**
 * @Description: 404异常
 * @Author: wen
 * @Date: 2023-01-14
 */

public class NotFoundException extends RuntimeException {
	public NotFoundException() {
	}

	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
