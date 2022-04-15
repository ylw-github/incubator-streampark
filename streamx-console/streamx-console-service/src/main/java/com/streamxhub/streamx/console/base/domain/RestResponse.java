/*
 * Copyright (c) 2019 The StreamX Project
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.streamxhub.streamx.console.base.domain;

import java.util.HashMap;

/**
 * @author benjobs
 */
public class RestResponse extends HashMap<String, Object> {

    private static final String STATUS_SUCCESS = "success";
    private static final String ERROR_SUCCESS = "error";

    private static final long serialVersionUID = -8713837118340960775L;

    public static RestResponse success(Object data) {
        RestResponse resp = new RestResponse();
        resp.put("status", STATUS_SUCCESS);
        resp.put("data", data);
        return resp;
    }

    public static RestResponse fail(String message) {
        RestResponse resp = new RestResponse();
        resp.put("status", ERROR_SUCCESS);
        resp.put("message", message);
        resp.put("data", null);
        return resp;
    }

    public static RestResponse create() {
        return new RestResponse();
    }

    public RestResponse message(String message) {
        this.put("message", message);
        return this;
    }

    public RestResponse data(Object data) {
        this.put("data", data);
        return this;
    }

    @Override
    public RestResponse put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
