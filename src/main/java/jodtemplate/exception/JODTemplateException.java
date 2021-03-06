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
package jodtemplate.exception;

public class JODTemplateException extends Exception {

    public JODTemplateException() {
        super();
    }

    public JODTemplateException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public JODTemplateException(final String message) {
        super(message);
    }

    public JODTemplateException(final Throwable cause) {
        super(cause);
    }

}
