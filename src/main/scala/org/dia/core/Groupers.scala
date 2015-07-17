/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dia.core

import org.joda.time.DateTime

import scala.collection.mutable.ListBuffer
import scala.language.implicitConversions

/**
 * Functions needed to map keys to values
 */
object Groupers {

  /**
   * Sort of an identity mapping
   * @param key
   * @param value
   * @return
   */
  //TODO better name?
  def mapDayUrls(key: Any, value: Any) : ListBuffer[String] = {
    var urls = new ListBuffer[String]
    val actualValue = value.asInstanceOf[ListBuffer[String]]
    val actualKey = key.asInstanceOf[DateTime]
    actualValue
  }

  //TODO better name?
  def mapUrls(key:Any, value:Any) : ListBuffer[sTensor] = {
    var urls = new ListBuffer[String]
    val actualKey = key.asInstanceOf[Int]
    val actualValue = value.asInstanceOf[String]
    urls+=actualValue
    urls
    null
  }
}

