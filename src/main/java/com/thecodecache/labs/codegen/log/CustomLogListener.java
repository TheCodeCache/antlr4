package com.thecodecache.labs.codegen.log;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Custom Log Listener
 * 
 * @author manoranjan
 */
public class CustomLogListener extends LogBaseListener {

	private List<LogEntry> entries = new ArrayList<>();
	private LogEntry current;

	@Override
	public void enterEntry(LogParser.EntryContext ctx) {
		this.current = new LogEntry();
	}

	@Override
	public void enterTimestamp(LogParser.TimestampContext ctx) {
		String europeanDatePattern = "yyyy-MMM-dd HH:mm:ss";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(europeanDatePattern);
		this.current.setTimestamp(LocalDateTime.parse(ctx.getText(), formatter));
	}

	@Override
	public void enterMessage(LogParser.MessageContext ctx) {
		this.current.setMessage(ctx.getText());
	}

	@Override
	public void enterLevel(LogParser.LevelContext ctx) {
		this.current.setLevel(ctx.getText());
	}

	@Override
	public void exitEntry(LogParser.EntryContext ctx) {
		this.entries.add(this.current);
	}

	public List<LogEntry> getEntries() {
		return entries;
	}

	public void setEntries(List<LogEntry> entries) {
		this.entries = entries;
	}

	public LogEntry getCurrent() {
		return current;
	}

	public void setCurrent(LogEntry current) {
		this.current = current;
	}
}