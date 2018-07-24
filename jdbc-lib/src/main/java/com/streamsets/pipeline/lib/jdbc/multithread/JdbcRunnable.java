/*
 * Copyright 2017 StreamSets Inc.
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

package com.streamsets.pipeline.lib.jdbc.multithread;

import com.streamsets.pipeline.api.BatchContext;
import com.streamsets.pipeline.api.StageException;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface JdbcRunnable {
  /**
   * Create record and add it to {@link com.streamsets.pipeline.api.BatchMaker}
   */
  void createAndAddRecord(
          ResultSet rs,
          TableRuntimeContext tableRuntimeContext,
          BatchContext batchContext,
          boolean is_mssql_cdc
  ) throws SQLException, StageException;

  /**
   * If "schema change" configuration is enabled, then check and generate schema change event
   */
  void generateSchemaChanges(BatchContext batchContext) throws SQLException;
}
