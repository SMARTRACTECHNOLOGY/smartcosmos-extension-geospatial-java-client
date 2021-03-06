package net.smartcosmos.objects.extension.geospatial.model;

/*
 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
 * SMART COSMOS Geospatial Extension Java Client
 * ===============================================================================
 * Copyright (C) 2013 - 2016 Smartrac Technology Fletcher, Inc.
 * ===============================================================================
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
 * #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#
 */

import com.fasterxml.jackson.annotation.JsonView;
import net.smartcosmos.util.json.JsonGenerationView;

public class Crs
{
    @JsonView(JsonGenerationView.Minimum.class)
    private CrsType type;

    @JsonView(JsonGenerationView.Minimum.class)
    private CrsProperties properties;

    public CrsType getType()
    {
        return type;
    }

    public void setType(CrsType type)
    {
        this.type = type;
    }

    public CrsProperties getProperties()
    {
        return properties;
    }

    public void setProperties(CrsProperties properties)
    {
        this.properties = properties;
    }
}
