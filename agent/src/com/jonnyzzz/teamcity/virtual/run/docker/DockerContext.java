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

package com.jonnyzzz.teamcity.virtual.run.docker;

import com.jonnyzzz.teamcity.virtual.VMConstants;
import com.jonnyzzz.teamcity.virtual.run.VMRunnerContext;
import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.BuildRunnerContext;
import jetbrains.buildServer.util.StringUtil;
import jetbrains.buildServer.vcs.VcsRoot;
import org.jetbrains.annotations.NotNull;

/**
 * @author Eugene Petrenko (eugene.petrenko@gmail.com)
 */
public class DockerContext extends VMRunnerContext {
  public DockerContext(@NotNull final BuildRunnerContext context) {
    super(context);
  }

  @NotNull
  public String getImageName() throws RunBuildException {
    final String image = myContext.getRunnerParameters().get(VMConstants.PARAMETER_DOCKER_IMAGE_NAME);
    if (StringUtil.isEmptyOrSpaces(image)) throw new RunBuildException("Docker image is not specified");
    return image;
  }

  @NotNull
  public Boolean getPullImage() {
    final Boolean pull = Boolean.parseBoolean(myContext.getRunnerParameters().get(VMConstants.PARAMETER_DOCKER_PULL_IMAGE));
    return pull;
  }


  @NotNull
  public String getContainerName() {
    final String unique = myContext.getBuild().getBuildNumber();// + "_"
    return "teamcity_" + unique;
  }
}
