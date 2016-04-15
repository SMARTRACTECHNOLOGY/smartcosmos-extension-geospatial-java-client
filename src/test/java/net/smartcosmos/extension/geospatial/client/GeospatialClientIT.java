package net.smartcosmos.extension.geospatial.client;

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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import net.smartcosmos.client.connectivity.ServerContext;
import net.smartcosmos.client.connectivity.ServiceException;
import net.smartcosmos.objects.extension.geospatial.client.GeospatialFactory;
import net.smartcosmos.objects.extension.geospatial.client.IGeospatialClient;
import net.smartcosmos.objects.extension.geospatial.model.GeometricShape;
import net.smartcosmos.objects.extension.geospatial.model.GeometricType;
import net.smartcosmos.objects.extension.geospatial.model.GeospatialBuilder;
import net.smartcosmos.objects.extension.geospatial.model.IGeospatialEntry;
import net.smartcosmos.pojo.base.ResponseEntity;
import org.junit.Assert;

import java.util.Collection;

public class GeospatialClientIT
{
    private static final String USERNAME = "api@smartrac-group.com";

    private static final String PASSWORD = "1CGVWWCUp9$1";

    private static final String BADGE_OBJECT_URN = "urn:rfid:badge:18c81eac-a3be-4244-8542-04a2f0b909f3";

    private static final String GEOSPATIAL_URN = "urn:uuid:db1626e5-19fa-43aa-bca4-bbcd4706c52e";

    public static void main(String[] args) throws ServiceException, JsonProcessingException
    {
        GeospatialClientIT instance = new GeospatialClientIT();
//        instance.createGeospatialEntry();
        instance.query();
    }

    private void query() throws ServiceException
    {
        ServerContext context = new ServerContext(USERNAME, PASSWORD, "http://localhost:8080");
        IGeospatialClient client = GeospatialFactory.createClient(context);

        Collection<IGeospatialEntry> matches = client.findByNameLike("ba");
        Assert.assertTrue(matches.size() == 1);
    }

    private void createGeospatialEntry() throws ServiceException, JsonProcessingException
    {
        ServerContext context = new ServerContext(USERNAME, PASSWORD, "http://localhost:8080");
        IGeospatialClient client = GeospatialFactory.createClient(context);

        /*
{
    "type": "Feature",
    "bbox": [-180.0, -90.0, 180.0, 90.0],
    "geometry": {
        "type": "Polygon",
        "coordinates": [
            [
                [-180.0, 10.0],
                [20.0, 90.0],
                [180.0, -5.0],
                [-30.0, -90.0]
            ]
        ]
    }
}
         */


        ObjectMapper mapper = new ObjectMapper();

        ArrayNode corner1 = mapper.createArrayNode();
        DoubleNode corner1X = new DoubleNode(-180.0d);
        DoubleNode corner1Y = new DoubleNode(10.0d);
        corner1.add(corner1X).add(corner1Y);

        ArrayNode corner2 = mapper.createArrayNode();
        DoubleNode corner2X = new DoubleNode(20.0d);
        DoubleNode corner2Y = new DoubleNode(90.0d);
        corner2.add(corner2X).add(corner2Y);

        ArrayNode corner3 = mapper.createArrayNode();
        DoubleNode corner3X = new DoubleNode(180.0d);
        DoubleNode corner3Y = new DoubleNode(-5.0d);
        corner3.add(corner3X).add(corner3Y);

        ArrayNode corner4 = mapper.createArrayNode();
        DoubleNode corner4X = new DoubleNode(-30.0d);
        DoubleNode corner4Y = new DoubleNode(-90.0d);
        corner4.add(corner4X).add(corner4Y);

        ArrayNode box1 = mapper.createArrayNode();
        box1.add(corner1)
                .add(corner2)
                .add(corner3)
                .add(corner4);

        ArrayNode coordinates = mapper.createArrayNode();
        coordinates.add(box1);

        GeometricShape shape = new GeometricShape()
                .setType(GeometricType.Feature)
                .setBbox(new float[]{-180.0f, -90.0f, 180.0f, 90.0f})
                .setGeometry(new GeometricShape()
                        .setType(GeometricType.Polygon)
                        .setCoordinates(coordinates));

//        String jsonOutput = mapper.writeValueAsString(shape);
//        System.out.println(jsonOutput);

        IGeospatialEntry entry = new GeospatialBuilder(shape)
                .setType("foo")
                .setName("bar")
                .setDescription("baaq")
                .setActive(true)
                .build();

        ResponseEntity responseEntity = client.create(entry);
        responseEntity.log();
    }
}
