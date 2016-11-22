/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.gremlin.tinkergraph.jsr223;

import org.apache.tinkerpop.gremlin.jsr223.AbstractGremlinPlugin;
import org.apache.tinkerpop.gremlin.jsr223.Customizer;
import org.apache.tinkerpop.gremlin.jsr223.DefaultImportCustomizer;
import org.apache.tinkerpop.gremlin.tinkergraph.process.computer.TinkerGraphComputer;
import org.apache.tinkerpop.gremlin.tinkergraph.process.computer.TinkerGraphComputerView;
import org.apache.tinkerpop.gremlin.tinkergraph.process.computer.TinkerMapEmitter;
import org.apache.tinkerpop.gremlin.tinkergraph.process.computer.TinkerMemory;
import org.apache.tinkerpop.gremlin.tinkergraph.process.computer.TinkerMessenger;
import org.apache.tinkerpop.gremlin.tinkergraph.process.computer.TinkerReduceEmitter;
import org.apache.tinkerpop.gremlin.tinkergraph.process.computer.TinkerWorkerPool;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerEdge;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerElement;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerFactory;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraph;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerGraphVariables;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerHelper;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerIoRegistry;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerIoRegistryV2d0;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerProperty;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerVertex;
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerVertexProperty;

import java.util.Optional;

/**
 * @author Stephen Mallette (http://stephen.genoprime.com)
 */
public final class TinkerGraphGremlinPlugin extends AbstractGremlinPlugin {
    private static final String MODULE_NAME = "tinkerpop.tinkergraph";

    public TinkerGraphGremlinPlugin() {
        super(MODULE_NAME, DefaultImportCustomizer.build().addClassImports(
                TinkerEdge.class,
                TinkerElement.class,
                TinkerFactory.class,
                TinkerGraph.class,
                TinkerGraphVariables.class,
                TinkerHelper.class,
                TinkerIoRegistry.class,
                TinkerIoRegistryV2d0.class,
                TinkerProperty.class,
                TinkerVertex.class,
                TinkerVertexProperty.class,
                TinkerGraphComputer.class,
                TinkerGraphComputerView.class,
                TinkerMapEmitter.class,
                TinkerMemory.class,
                TinkerMessenger.class,
                TinkerReduceEmitter.class,
                TinkerWorkerPool.class).create());
    }

    @Override
    public Optional<Customizer[]> getCustomizers() {
        return null;
    }
}
