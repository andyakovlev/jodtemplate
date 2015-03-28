/*
 * 
 * Copyright 2015 Andrey Yakovlev
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
 * 
 */
package jodtemplate.template;

import jodtemplate.style.StylizedString;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import freemarker.template.Version;
import org.apache.commons.lang3.StringEscapeUtils;

public class JODTemplateObjectWrapper extends DefaultObjectWrapper {

    public JODTemplateObjectWrapper(final Version incompatibleImprovements) {
        super(incompatibleImprovements);
    }

    @Override
    public TemplateModel wrap(final Object obj) throws TemplateModelException {
        if (obj instanceof String) {
            return super.wrap(StringEscapeUtils.escapeXml10((String) obj));
        }
        return super.wrap(obj);
    }

    @Override
    protected TemplateModel handleUnknownType(final Object obj) throws TemplateModelException {
        if (obj instanceof StylizedString) {
            final String className = obj.getClass().getName();
            final StylizedString stylized = (StylizedString) obj;
            return super.wrap("<!-- stylized " + className + ": " + stylized.getText() + "-->");
        }
        return super.handleUnknownType(obj);
    }
}
