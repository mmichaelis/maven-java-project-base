# maven-java-project-base
A basic repository I use as template.

# Tip: IntelliJ Idea Templates

## Live Templates

**Important: Set context soon:** Especially some options are only visible if
you have selected the corresponding context. So for example the option to use
static import if possible is activated as soon as you choose *Java* as context.

### Logger with MethodHandles

The following logger is copy-and-paste-safe, which is that you can safely
copy it to another class without creating unwanted shared loggers.

* **Live Template Group:** output

* **Abbreviation:** logger

* **Description:**  Logger with Java 7 MethodHandles

* **Template Text:**

    ```java
    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(java.lang.invoke.MethodHandles.lookup().lookupClass());
    ```

* **Context:** Java: declaration

* **Options:**
    * **Expand With:** Enter
    * ☑ Reformat according to style
    * ☑ Use static import if possible
    * ☑ Shorten FQ names

### Objects.requireNonNull

As you might know any `@NonNull` annotation is not checked at runtime. So if you
want to provide a fail-fast API you might want to check method parameters with
`Objects.requireNonNull` to ensure that a parameter is really non-null.

The following is a surround-template, which is, that you select the variable name
you want to check and use this template to surround it with `Objects.requireNonNull`
and a message proposal.

* **Live Template Group:** surround

* **Abbreviation:** RNN

* **Description:** Objects.requireNonNull with Message

* **Template Text:**

    ```java
    java.util.Objects.requireNonNull($SELECTION$, "$SELECTION$ must not be null.")$END$
    ```

* **Context:** Java: statement, expression, declaration

* **Options:**
    * **Expand With:** Tab
    * ☑ Reformat according to style
    * ☑ Use static import if possible
    * ☑ Shorten FQ names

#### See Also

* [Portable Logger Names with Java 7 Method Handles | JavaWorld][JW-MethodHandles] (Dustin Marx, Jan 2013)

<!-- References -->

[JW-MethodHandles]: <https://www.javaworld.com/article/2074637/core-java/portable-logger-names-with-java-7-method-handles.html> "Portable Logger Names with Java 7 Method Handles | JavaWorld"
