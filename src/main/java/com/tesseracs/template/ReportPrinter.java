package com.tesseracs.template;

public final class ReportPrinter {
    private ReportPrinter() {
    }

    public static String render(SessionPlan plan) {
        long completed = plan.tasks().stream()
            .filter(task -> "done".equals(task.status()))
            .count();

        StringBuilder builder = new StringBuilder();
        builder.append("Project: ").append(plan.name()).append('\n');
        builder.append("Goal: ").append(plan.goal()).append('\n');
        builder.append("Progress: ")
            .append(completed)
            .append('/')
            .append(plan.tasks().size())
            .append(" tasks completed")
            .append('\n');
        builder.append("Open work:").append('\n');

        for (SessionPlan.Task task : plan.tasks()) {
            if (!"done".equals(task.status())) {
                builder.append("- ")
                    .append(task.title())
                    .append(" (")
                    .append(task.owner())
                    .append(')')
                    .append('\n');
            }
        }

        return builder.toString().trim();
    }
}
