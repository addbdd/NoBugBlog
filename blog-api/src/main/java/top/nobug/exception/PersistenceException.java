package top.nobug.exception;

/**
 * @Description: 持久化异常
 * @Author: wen
 * @Date: 2023-01-14
 */

public class PersistenceException extends RuntimeException {
	public PersistenceException() {
	}

	public PersistenceException(String message) {
		super(message);
	}

	public PersistenceException(String message, Throwable cause) {
		super(message, cause);
	}
}
