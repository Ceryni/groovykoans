/**
 * Copyright 2012 The original author or authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.groovykoans.koan09

class NukeInterceptor implements Interceptor {

    boolean isAuthorized = true

    @Override
    Object beforeInvoke(Object obj, String methodName, Object[] args) {
        // ------------ START EDITING HERE ----------------------
        if (methodName == 'nukeCity') isAuthorized = args[0] == 'admin'

        // ------------ STOP EDITING HERE  ----------------------
    }

    @Override
    Object afterInvoke(Object obj, String methodName, Object[] args, Object result) {
        // ------------ START EDITING HERE ----------------------
        // After Review, could also reset the authorization check here instead in the before...
        //isAuthorized = true
        result
        // ------------ STOP EDITING HERE  ----------------------
    }

    @Override
    boolean doInvoke() {
        // ------------ START EDITING HERE ----------------------
        isAuthorized
        // ------------ STOP EDITING HERE  ----------------------
    }
}

