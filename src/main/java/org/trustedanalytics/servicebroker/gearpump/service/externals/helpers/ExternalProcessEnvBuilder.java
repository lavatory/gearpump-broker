/**
 * Copyright (c) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trustedanalytics.servicebroker.gearpump.service.externals.helpers;

public class ExternalProcessEnvBuilder {
    private static final String JAVA_OPTION_PREFIX = "-D";

    private ExternalProcessEnvBuilder() {
    }

    public static String buildJavaParam(String key, String value) {
        StringBuilder javaParam = new StringBuilder();
        javaParam.append(JAVA_OPTION_PREFIX)
                .append(key)
                .append("=")
                .append(value);
        return javaParam.toString();
    }
}
