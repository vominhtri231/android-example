package com.truiton.foregroundservice;

public class Constants {
    public interface ACTION {
        String MAIN_ACTION = "com.truiton.foregroundservice.action.main";
        String PREV_ACTION = "com.truiton.foregroundservice.action.prev";
        String PLAY_ACTION = "com.truiton.foregroundservice.action.play";
        String NEXT_ACTION = "com.truiton.foregroundservice.action.next";
        String STARTFOREGROUND_ACTION = "com.truiton.foregroundservice.action.startforeground";
        String STOPFOREGROUND_ACTION = "com.truiton.foregroundservice.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        int FOREGROUND_SERVICE = 101;
    }
}
