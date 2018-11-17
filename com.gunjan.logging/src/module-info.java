module com.gunjan.logging {
    exports com.gunjan.logger;
    exports com.gunjan.logger.helper to com.gunjan.test;
    exports com.gunjan.logger.internal;
    opens com.gunjan.logger.internal;
}