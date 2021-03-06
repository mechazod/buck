/*
 * Copyright (c) Facebook, Inc. and its affiliates.
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

package com.facebook.buck.parser;

import com.facebook.buck.event.BuckEventBus;
import com.facebook.buck.io.watchman.Watchman;
import com.facebook.buck.parser.api.PackageFileManifest;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.nio.file.Path;

/** A pipeline that provides a {@link PackageFileManifest} for a given package file. */
public class PackageFileParsePipeline extends GenericFileParsePipeline<PackageFileManifest> {

  public PackageFileParsePipeline(
      PipelineNodeCache<Path, PackageFileManifest> cache,
      PackageFileParserPool packageFileParserPool,
      ListeningExecutorService executorService,
      BuckEventBus eventBus,
      Watchman watchman) {
    super(cache, packageFileParserPool, executorService, eventBus, watchman);
  }
}
