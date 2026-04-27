package com.tesseracs.template;

import java.util.List;

public record SessionPlan(String name, String goal, List<Task> tasks) {
    public static SessionPlan sample() {
        return new SessionPlan(
            "Tesseracs template refresh",
            "Offer a practical Java starting point",
            List.of(
                new Task("Use a standard folder layout", "done", "template"),
                new Task("Improve run instructions", "done", "docs"),
                new Task("Replace sample data", "next", "you")
            )
        );
    }

    public record Task(String title, String status, String owner) {
    }
}
