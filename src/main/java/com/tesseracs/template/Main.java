package com.tesseracs.template;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        SessionPlan project = SessionPlan.sample();
        System.out.println(ReportPrinter.render(project));
    }
}
