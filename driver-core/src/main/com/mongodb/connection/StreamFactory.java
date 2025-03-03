/*
 * Copyright 2008-present MongoDB, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mongodb.connection;

import com.mongodb.ServerAddress;

/**
 * A factory for streams.
 *
 * @since 3.0
 * @deprecated There is no replacement for this interface.
 */
@Deprecated
public interface StreamFactory {
    /**
     * Create a Stream to the given address
     *
     * @param serverAddress the address
     * @return the stream
     */
    Stream create(ServerAddress serverAddress);
}
