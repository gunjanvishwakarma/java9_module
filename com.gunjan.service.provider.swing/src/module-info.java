module com.gunjan.service.provider.swing {
    requires com.gunjan.service.api;
    requires java.desktop;
    provides com.gunjan.service.api.MsgService with com.gunjan.service.provider.swing.MsgServiceProvider;
}