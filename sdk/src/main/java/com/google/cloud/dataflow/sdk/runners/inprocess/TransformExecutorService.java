/*
 * Copyright (C) 2016 Google Inc.
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
package com.google.cloud.dataflow.sdk.runners.inprocess;

/**
 * Schedules and completes {@link TransformExecutor TransformExecutors}, controlling concurrency as
 * appropriate for the {@link StepAndKey} the executor exists for.
 */
interface TransformExecutorService {
  /**
   * Schedule the provided work to be eventually executed.
   */
  void schedule(TransformExecutor<?> work);

  /**
   * Finish executing the provided work. This may cause additional
   * {@link TransformExecutor TransformExecutors} to be evaluated.
   */
  void complete(TransformExecutor<?> completed);
}

