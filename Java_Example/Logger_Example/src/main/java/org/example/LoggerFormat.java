package org.example;

import java.text.SimpleDateFormat;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LoggerFormat extends Formatter {
    @Override
    public String format(LogRecord record) {
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:MM:ss ");
        return record.getLevel() + " : " + format.format(record.getMillis())
                + " " + record.getMessage() + "\n";
    }
}
