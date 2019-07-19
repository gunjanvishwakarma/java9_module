package com.gunjan.logger;

import com.gunjan.logger.helper.LoggingHelper;

public class Logger
{
    LoggingHelper loggingHelper = new LoggingHelper();
    
    public void log(String msg, Throwable t)
    {
        loggingHelper.print(msg);
        t.printStackTrace();
    }
    
    public void log(String msg)
    {
        loggingHelper.print(msg);
    }
    
    public void log(int msg)
    {
        loggingHelper.print(String.valueOf(msg));
    }
}
