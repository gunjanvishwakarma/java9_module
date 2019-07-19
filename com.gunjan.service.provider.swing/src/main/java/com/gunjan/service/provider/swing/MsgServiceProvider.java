package com.gunjan.service.provider.swing;

import javax.swing.*;

import com.gunjan.service.api.MsgService;

public class MsgServiceProvider {
    
    public static MsgService provider() {
        return new MsgServiceProviderImpl();
    }
    
    private static class MsgServiceProviderImpl implements MsgService
    {
        @Override
        public void showMessage(String msg) {
            JOptionPane.showMessageDialog(null, "From Msg Provider: " + msg);
        }
    }
}