/*
 * Copyright 2011, Mysema Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.query.lucene;

import com.mysema.query.types.Operator;
import com.mysema.query.types.OperatorImpl;

/**
 * @author tiwe
 *
 */
public final class LuceneOps {

    private static final String NS = LuceneOps.class.getName();

    static final Operator<Object> LUCENE_QUERY = new OperatorImpl<Object>(NS, "LUCENE_QUERY");

    static final Operator<String> PHRASE = new OperatorImpl<String>(NS, "LUCENE_PHRASE");

    static final Operator<String> TERM = new OperatorImpl<String>(NS, "LUCENE_TERM");

    private LuceneOps() {}

}
