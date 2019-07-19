package com.gunjan.test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import com.gunjan.logger.Logger;
import com.gunjan.logger.helper.LoggingHelper;
import com.gunjan.logger.internal.PrintToConsole;
import com.gunjan.search.BinarySearch;
import com.gunjan.service.api.MsgService;
import com.gunjan.util.Util;

public class AppMain
{
    Logger logger = new Logger();
    LoggingHelper loggingHelper = new LoggingHelper();
    PrintToConsole printToConsole = new PrintToConsole();
    // Able to use Util class from com.gunjan.util module
    // because of transitive requires in com.gunjan.search module
    static Util util = new Util();
    
    public void test()
    {
        try
        {
            BinarySearch binarySearch = new BinarySearch();
            int[] array = new int[] {5, 3, 7, 2, 8, 3, 7, 3};
            util.printArray(array);
            int index = binarySearch.binarySearch(array, 9);
            logger.log(index);
            
            List<MsgService> msgServices = MsgService.getInstances();
            for(MsgService msgService : msgServices)
            {
                msgService.showMessage("A test message");
            }
            
            Method m = PrintToConsole.class.getDeclaredMethod("printConsole");
            m.setAccessible(true);
            m.invoke(printToConsole);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        new AppMain().test();
        //System.in.read();
    }
}