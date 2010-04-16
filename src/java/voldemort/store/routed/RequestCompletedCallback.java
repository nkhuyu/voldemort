/*
 * Copyright 2010 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package voldemort.store.routed;

import voldemort.cluster.Node;
import voldemort.utils.ByteArray;

public class RequestCompletedCallback {

    private final Node node;

    private final ByteArray key;

    private final long requestTime;

    private final Object result;

    public RequestCompletedCallback(Node node, ByteArray key, long requestTime, Object result) {
        this.node = node;
        this.key = key;
        this.requestTime = requestTime;
        this.result = result;
    }

    public Node getNode() {
        return node;
    }

    public ByteArray getKey() {
        return key;
    }

    public long getRequestTime() {
        return requestTime;
    }

    public Object getResult() {
        return result;
    }

}