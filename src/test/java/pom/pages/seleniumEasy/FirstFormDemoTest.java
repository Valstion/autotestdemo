package pom.pages.seleniumEasy;

import pom.pages.Common;

public class FirstFormDemoTest {
    public static void setup() {
        Common.setUp();
    }

    public static void open(String url) {
        Common.openUrl(url);
    }

    public static void close() {
        Common.close();
    }
}
