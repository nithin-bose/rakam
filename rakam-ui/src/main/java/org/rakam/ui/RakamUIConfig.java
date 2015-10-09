/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rakam.ui;

import io.airlift.configuration.Config;
import org.rakam.ui.RakamUIModule.CustomPageBackend;

import java.io.File;
import java.util.Locale;

public class RakamUIConfig {
    private File uiDirectory = new File("rakam-ui/src/main/resources/rakam-ui-master/app");
    private CustomPageBackend customPageBackend = CustomPageBackend.JDBC;
    private File customPageBackendDirectory;
    private boolean enableUi = true;

    @Config("ui.directory")
    public RakamUIConfig setUIDirectory(File uiDirectory) {
        this.uiDirectory = uiDirectory;
        return this;
    }

    public boolean getEnableUI() {
        return enableUi;
    }

    @Config("ui.enable")
    public RakamUIConfig setEnableUI(boolean enableUi) {
        this.enableUi = enableUi;
        return this;
    }

    public File getUIDirectory() {
        return uiDirectory;
    }

    @Config("ui.custom-page.backend")
    public RakamUIConfig setCustomPageBackend(String customPageBackend) {
        this.customPageBackend = CustomPageBackend.valueOf(customPageBackend.toUpperCase(Locale.CHINESE));
        return this;
    }

    public CustomPageBackend getCustomPageBackend() {
        return customPageBackend;
    }

    @Config("ui.custom-page.backend.directory")
    public RakamUIConfig setCustomPageBackendDirectory(File customPageBackendDirectory) {
        this.customPageBackendDirectory = customPageBackendDirectory;
        return this;
    }

    public File getCustomPageBackendDirectory() {
        return customPageBackendDirectory;
    }
}
