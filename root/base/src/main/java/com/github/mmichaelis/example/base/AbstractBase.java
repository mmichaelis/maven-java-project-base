package com.github.mmichaelis.example.base;

import static java.lang.invoke.MethodHandles.lookup;
import static java.util.Objects.requireNonNull;
import static org.slf4j.LoggerFactory.getLogger;

import org.slf4j.Logger;

import edu.umd.cs.findbugs.annotations.NonNull;

public class AbstractBase {
  private static final Logger LOG = getLogger(lookup().lookupClass());

  @NonNull private String id = "";

  @NonNull
  public String getId() {
    return id;
  }

  public AbstractBase setId(@NonNull String id) {
    this.id = requireNonNull(id, "id must not be null.");
    return this;
  }
}
