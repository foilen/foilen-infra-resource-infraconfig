/*
    Foilen Infra Resource Infra Config
    https://github.com/foilen/foilen-infra-resource-infraconfig
    Copyright (c) 2018 Foilen (http://foilen.com)

    The MIT License
    http://opensource.org/licenses/MIT

 */
package com.foilen.infra.resource.infraconfig;

import com.foilen.infra.plugin.core.system.junits.JunitsHelper;
import com.foilen.infra.plugin.core.system.junits.ResourcesDump;
import com.foilen.infra.plugin.v1.core.service.IPResourceService;
import com.foilen.infra.plugin.v1.core.service.internal.InternalChangeService;
import com.foilen.smalltools.tools.JsonTools;

public class LaunchWebApp extends com.foilen.infra.plugin.core.system.fake.LaunchWebApp {

    public static void main(String[] args) {
        main(args, LaunchWebApp.class);
    }

    @Override
    protected void createFakeData(IPResourceService resourceService, InternalChangeService internalChangeService) {
        ResourcesDump resourcesDump = JsonTools.readFromResource("import.json", ResourcesDump.class, getClass());
        JunitsHelper.dumpImport(resourceService, internalChangeService, resourcesDump);
    }

}
