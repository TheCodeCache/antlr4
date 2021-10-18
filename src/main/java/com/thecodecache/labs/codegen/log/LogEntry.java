package com.thecodecache.labs.codegen.log;

import java.time.LocalDateTime;

/**
 * Log-Entry Model Object (DTO)
 * 
 * @author manoranjan
 */
public class LogEntry {

	// log level
	private String level;
	// log message
	private String message;
	// log timestamp
	private LocalDateTime timestamp;

	// setters and getters

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
}
