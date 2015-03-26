/*
 * Copyright 2015 Rodrigo M. Tato Rothamel <rotatomel@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.ia.jadeproject;

import jade.core.Agent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo M. Tato Rothamel <rotatomel@gmail.com>
 */
public class TestAgent extends Agent {

    private static final Logger LOG = Logger.getLogger(TestAgent.class.getName());

    @Override
    public void doActivate() {
        super.doActivate();
        LOG.log(Level.INFO, "I''m active! {0}", getLocalName());
    }

    @Override
    protected void setup() {
        super.setup();
        LOG.log(Level.INFO, "I''ve been set up! {0}", getLocalName());
    }

}
