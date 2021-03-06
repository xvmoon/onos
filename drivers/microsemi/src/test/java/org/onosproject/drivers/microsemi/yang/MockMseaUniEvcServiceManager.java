/*
 * Copyright 2017-present Open Networking Laboratory
 *
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
package org.onosproject.drivers.microsemi.yang;

import org.onosproject.drivers.microsemi.yang.impl.MseaUniEvcServiceManager;
import org.onosproject.yang.MockYangRuntimeManager;
import org.onosproject.yang.runtime.impl.DefaultYangModelRegistry;
import org.onosproject.yang.serializers.xml.MockYangSerializerContext;
import org.onosproject.yang.serializers.xml.XmlSerializer;

public class MockMseaUniEvcServiceManager extends MseaUniEvcServiceManager {
    @Override
    public void activate() {
        yCtx = new MockYangSerializerContext();
        xSer = new XmlSerializer();
        yangModelRegistry = new MockYangRuntimeManager();
        ((MockYangRuntimeManager) yangModelRegistry).setModelRegistry(
                (DefaultYangModelRegistry) yCtx.getContext());
        ((MockYangRuntimeManager) yangModelRegistry).activate();
    }
}
