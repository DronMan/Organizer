package com.company.timetable;

import com.haulmont.cuba.web.testsupport.TestContainer;

import java.util.ArrayList;
import java.util.Arrays;

public class TimetableWebTestContainer extends TestContainer {

    public TimetableWebTestContainer() {
        appComponents = Arrays.asList(
                "com.haulmont.cuba",
                "com.haulmont.addon.helium");
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the web module
                "com/company/timetable/web-app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/haulmont/cuba/web/testsupport/test-web-app.properties"
        );
    }

    public static class Common extends TimetableWebTestContainer {

        // A common singleton instance of the test container which is initialized once for all tests
        public static final TimetableWebTestContainer.Common INSTANCE = new TimetableWebTestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void before() throws Throwable {
            if (!initialized) {
                super.before();
                initialized = true;
            }
            setupContext();
        }

        @Override
        public void after() {
            cleanupContext();
            // never stops - do not call super
        }
    }
}