/*
 * Copyright 2000-2014 Eugene Petrenko
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jonnyzzz.teamcity.virtual;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;

import static com.jonnyzzz.teamcity.virtual.VMConstants.*;

/**
 * @author Eugene Petrenko (eugene.petrenko@gmail.com)
 */
public class FormBean {

  @NotNull
  public String getVm() {
    return PARAMETER_VM;
  }

  @NotNull
  public String getScript() {
    return PARAMETER_SCRIPT;
  }

  @NotNull
  public String getDockerImageName() {
    return PARAMETER_DOCKER_IMAGE_NAME;
  }

  @NotNull
  public String getVagrantImageName() {
    return PARAMETER_VAGRANT_IMAGE_NAME;
  }

  @NotNull
  public String getVagrantImageUrl() {
    return PARAMETER_VAGRANT_IMAGE_URL;
  }

  @NotNull
  public Collection<VM> getVms() {
    return Arrays.asList(VM.values());
  }
}