/**
 *   Copyright 2017 Pratapi Hemant Patel
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *   
 */
package com.github.cric.common.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Match {

    private int matchId;
    private boolean matchStarted;
    private Team firstTeam;
    private Team secondTeam;

    public int getMatchId() {

        return matchId;
    }

    public boolean isMatchStarted() {

        return matchStarted;
    }

    public Team getFirstTeam() {

        return firstTeam;
    }

    public Team getSecondTeam() {

        return secondTeam;
    }

    public Match setMatchId(int matchId) {

        this.matchId = matchId;
        return this;
    }

    public Match setMatchStarted(boolean matchStarted) {

        this.matchStarted = matchStarted;
        return this;
    }

    public Match setFirstTeam(Team firstTeam) {

        this.firstTeam = firstTeam;
        return this;
    }

    public Match setSecondTeam(Team secondTeam) {

        this.secondTeam = secondTeam;
        return this;
    }
    
    @Override
    public String toString() {

        return new ToStringBuilder(this)
        .append(matchId)
        .append(matchStarted)
        .append(firstTeam)
        .append(secondTeam)
        .build();
    }
}
