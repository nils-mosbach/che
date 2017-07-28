/*******************************************************************************
 * Copyright (c) 2012-2017 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.deploy;

import com.google.inject.servlet.ServletModule;

import org.eclipse.che.inject.DynaModule;

/**
 * Single-user version Che specific bindings
 *
 * @author Max Shaposhnik (mshaposh@redhat.com)
 *
 */
@DynaModule
public class CheWsMasterServletModule extends ServletModule {

    @Override
    protected void configureServlets() {
        filter("/api/*").through(org.eclipse.che.api.local.filters.EnvironmentInitializationFilter.class);
    }
}
