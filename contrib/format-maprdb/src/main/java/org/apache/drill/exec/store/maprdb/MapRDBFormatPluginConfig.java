/**
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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.drill.exec.store.maprdb;

import org.apache.drill.common.logical.FormatPluginConfig;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("maprdb")  @JsonInclude(Include.NON_DEFAULT)
public class MapRDBFormatPluginConfig implements FormatPluginConfig {

  private boolean allTextMode = false;
  private boolean readAllNumbersAsDouble = false;

  @Override
  public int hashCode() {
    return 53;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (getClass() != obj.getClass()) {
      return false;
    }

    MapRDBFormatPluginConfig other = (MapRDBFormatPluginConfig)obj;

    if (readAllNumbersAsDouble != other.readAllNumbersAsDouble) {
      return false;
    }

    if (allTextMode != other.allTextMode) {
      return false;
    }

    return true;
  }

  public boolean isReadAllNumbersAsDouble() {
    return readAllNumbersAsDouble;
  }

  public boolean isAllTextMode() {
    return allTextMode;
  }

  @JsonProperty("allTextMode")
  public void setAllTextMode(boolean mode) {
    allTextMode = mode;
  }

  @JsonProperty("readAllNumbersAsDouble")
  public void setReadAllNumbersAsDouble(boolean read) {
    readAllNumbersAsDouble = read;
  }
}
