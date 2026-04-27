# Tesseracs - Java Template

A small but more realistic Java starter for [Tesseracs](https://github.com/tesseracs) chat sessions.

Clone URL: `https://github.com/tesseracs/templates.java`

## What this template shows

- A normal `src/main/java` folder layout.
- Separate classes for project data and console rendering.
- No Gradle or Maven requirement for the first run.

## Layout

- `src/main/java/com/tesseracs/template/Main.java` - entry point.
- `src/main/java/com/tesseracs/template/SessionPlan.java` - immutable record types and sample data.
- `src/main/java/com/tesseracs/template/ReportPrinter.java` - summary formatting.
- `run.sh` - compiles into `out/` and runs the main class.

## Run

```sh
./run.sh
```

If you prefer manual commands:

```sh
javac -d out src/main/java/com/tesseracs/template/*.java
java -cp out com.tesseracs.template.Main
```

## Suggested next edits

- Replace `sample()` with data from files, APIs, or arguments.
- Add more packages under `com.tesseracs.template` as the project grows.
- Introduce Maven or Gradle later if dependency management becomes useful.
