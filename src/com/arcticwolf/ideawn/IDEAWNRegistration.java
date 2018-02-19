package com.arcticwolf.ideawn;

import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NotNull;

public class IDEAWNRegistration implements ApplicationComponent {
    @NotNull
    public String getComponentName() {
        return "IDEAWN";
    }

    public void initComponent() {
    }

    public void disposeComponent() {
    }
}
