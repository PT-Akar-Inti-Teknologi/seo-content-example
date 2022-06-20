package org.ait.project.seo.example.shared.utils;

public class Helper {

    private Helper() {
        throw new IllegalStateException("Helper utility class");
    }

    public static String generateUrl(String title) {
        return title.replaceAll("[^A-Za-z0-9]+", "-").toLowerCase();
    }
}
