package net.smartcosmos.extension.geospatial.rest;

/*
 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
 * SMART COSMOS Objects Test
 * ===============================================================================
 * Copyright (C) 2013 - 2016 Smartrac Technology Fletcher, Inc.
 * ===============================================================================
 * SMARTRAC Technology Fletcher, Inc.
 * 267 Cane Creek Rd, Fletcher, NC, 28732, USA
 * 
 * All Rights Reserved.
 * 
 * This software is the confidential and proprietary information of
 * SMARTRAC Technology Fletcher, Inc. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement
 * you entered into with Smartrac Technology Fletcher, Inc.
 * #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#
 */

/**
 * Integration tests for the Smart Cosmos Objects API.
 * This file contains tests for ObjectIT functionality, as specified here:
 * <p>
 * <a href="https://api.smartcosmos.net/objects/index.html#geospatial-endpoints">
 * https://api.smartcosmos.net/objects/index.html#geospatial-endpoints
 * </a>
 * <p>
 * Note: every returned GeoJSON element in these tests has been run through geojsonhint.
 * This is by no means a definitive test of compliance, but it's better than nothing.
 * <p>
 * Installing geojsonhint: https://github.com/mapbox/geojsonhint
 * <p>
 * Initially created by tcross on October 28, 2015
 */
public class GeospatialRestIT
{
//    @ClassRule
//    public static final DropwizardAppRule<SmartCosmosConfiguration> RULE = new DropwizardAppRule<>(
//        ObjectsApplication.class, resourceFilePath("/integration-test-config.yml"));
//
//
//    //
//    // initialized in @BeforeClass method, and taken from:
//    // http://geojson.org/geojson-spec.html#appendix-a-geometry-examples
//    //
//    static GeometricShape point1;
//    static GeometricShape point2; // named CRS testing
//    static GeometricShape point3; // linked CRS testing
//    static GeometricShape point4; // PUT error testing
//    static GeometricShape point5; // POST error testing
//    static GeometricShape point6; // findByName testing
//    static GeometricShape point7; // findByName testing
//    static GeometricShape point8; // findByName testing
//    static GeometricShape lineString1;
//    static GeometricShape polygon1;
//    static GeometricShape polygonWithHole1;
//    static GeometricShape multiPoint1;
//    static GeometricShape multiPoint2;
//    static GeometricShape multiLineString1;
//    static GeometricShape multiPolygon1;
//    static GeometricShape geometryCollection1;
//    static GeometricShape feature1;
//    static GeometricShape feature2;
//    static GeometricShape featureCollection1;
//
//    static Crs namedCrs;
//    static Crs linkedCrs;
//
//    /**
//     * Create a complete per specification set of GeoJSON elements for testing.
//     * <p>
//     * Specification:
//     * <p>
//     * <a href="http://geojson.org/geojson-spec.html">
//     * http://geojson.org/geojson-spec.html
//     * </a>
//     */
//    @BeforeClass
//    public static void initialize()
//    {
//        ObjectMapper mapper = new ObjectMapper();
//
//        ///////////
//        // point //
//        ///////////
//        point1 = new GeometricShape();
//        point1.setType(GeometricType.Point);
//        ArrayNode point1Coordinates = mapper.createArrayNode();
//        point1Coordinates.add(100.0).add(0.0);
//        point1.setCoordinates(point1Coordinates);
//
//        ////////////////////////////////////
//        // point2 (for named CRS testing) //
//        ////////////////////////////////////
//        point2 = new GeometricShape();
//        point2.setType(GeometricType.Point);
//        ArrayNode point2Coordinates = mapper.createArrayNode();
//        point2Coordinates.add(101.0).add(1.0);
//        point2.setCoordinates(point2Coordinates);
//
//        /////////////////////////////////////
//        // point3 (for linked CRS testing) //
//        /////////////////////////////////////
//        point3 = new GeometricShape();
//        point3.setType(GeometricType.Point);
//        ArrayNode point3Coordinates = mapper.createArrayNode();
//        point3Coordinates.add(102.0).add(2.0);
//        point3.setCoordinates(point3Coordinates);
//
//        /////////////////////////////////////////
//        // point4 (for error response testing) //
//        /////////////////////////////////////////
//        point4 = new GeometricShape();
//        point4.setType(GeometricType.Point);
//        ArrayNode point4Coordinates = mapper.createArrayNode();
//        point4Coordinates.add(103.0).add(3.0);
//        point4.setCoordinates(point4Coordinates);
//
//        /////////////////////////////////////////
//        // point5 (for error response testing) //
//        /////////////////////////////////////////
//        point5 = new GeometricShape();
//        point5.setType(GeometricType.Point);
//        ArrayNode point5Coordinates = mapper.createArrayNode();
//        point5Coordinates.add(104.0).add(4.0);
//        point5.setCoordinates(point5Coordinates);
//
//        /////////////////////////////////////////
//        // point6 (for find by name testing) ////
//        /////////////////////////////////////////
//        point6 = new GeometricShape();
//        point6.setType(GeometricType.Point);
//        ArrayNode point6Coordinates = mapper.createArrayNode();
//        point6Coordinates.add(106.0).add(6.0);
//        point6.setCoordinates(point6Coordinates);
//
//        /////////////////////////////////////////
//        // point7 (for find by name testing) ////
//        /////////////////////////////////////////
//        point7 = new GeometricShape();
//        point7.setType(GeometricType.Point);
//        ArrayNode point7Coordinates = mapper.createArrayNode();
//        point7Coordinates.add(107.0).add(7.0);
//        point7.setCoordinates(point7Coordinates);
//
//        /////////////////////////////////////////
//        // point8 (for find by name testing) ////
//        /////////////////////////////////////////
//        point8 = new GeometricShape();
//        point8.setType(GeometricType.Point);
//        ArrayNode point8Coordinates = mapper.createArrayNode();
//        point8Coordinates.add(108.0).add(8.0);
//        point8.setCoordinates(point8Coordinates);
//
//        ////////////////
//        // lineString //
//        ////////////////
//        lineString1 = new GeometricShape();
//        lineString1.setType(GeometricType.LineString);
//
//        ArrayNode lineString1Coordinates = mapper.createArrayNode();
//
//        ArrayNode lineString1Coordinate1 = mapper.createArrayNode();
//        lineString1Coordinate1.add(100.0).add(0.0);
//
//        ArrayNode lineString1Coordinate2 = mapper.createArrayNode();
//        lineString1Coordinate2.add(101.0).add(1.0);
//
//        lineString1Coordinates.add(lineString1Coordinate1);
//        lineString1Coordinates.add(lineString1Coordinate2);
//        lineString1.setCoordinates(lineString1Coordinates);
//
//        /////////////
//        // polygon //
//        /////////////
//        polygon1 = new GeometricShape();
//        polygon1.setType(GeometricType.Polygon);
//
//        ArrayNode polygon1OuterCoordinates = mapper.createArrayNode();
//        ArrayNode polygon1Coordinates = mapper.createArrayNode();
//
//        ArrayNode polygon1Coordinate1 = mapper.createArrayNode();
//        polygon1Coordinate1.add(100.0).add(0.0);
//
//        ArrayNode polygon1Coordinate2 = mapper.createArrayNode();
//        polygon1Coordinate2.add(101.0).add(0.0);
//
//        ArrayNode polygon1Coordinate3 = mapper.createArrayNode();
//        polygon1Coordinate3.add(101.0).add(1.0);
//
//        ArrayNode polygon1Coordinate4 = mapper.createArrayNode();
//        polygon1Coordinate4.add(100.0).add(1.0);
//
//        ArrayNode polygon1Coordinate5 = mapper.createArrayNode();
//        polygon1Coordinate5.add(100.0).add(0.0);
//
//        polygon1Coordinates.add(polygon1Coordinate1);
//        polygon1Coordinates.add(polygon1Coordinate2);
//        polygon1Coordinates.add(polygon1Coordinate3);
//        polygon1Coordinates.add(polygon1Coordinate4);
//        polygon1Coordinates.add(polygon1Coordinate5);
//
//        polygon1OuterCoordinates.add(polygon1Coordinates);
//        polygon1.setCoordinates(polygon1OuterCoordinates);
//
//        /////////////////////
//        // polygonWithHole //
//        /////////////////////
//        polygonWithHole1 = new GeometricShape();
//        polygonWithHole1.setType(GeometricType.Polygon);
//
//        ArrayNode polygonWithHole1OuterCoordinates = mapper.createArrayNode();
//        ArrayNode polygonWithHole1_Polygon_Coordinates = mapper.createArrayNode();
//        ArrayNode polygonWithHole1_Hole_Coordinates = mapper.createArrayNode();
//
//        ArrayNode polygonWithHole1_Polygon_Coordinate1 = mapper.createArrayNode();
//        polygonWithHole1_Polygon_Coordinate1.add(100.0).add(0.0);
//
//        ArrayNode polygonWithHole1_Polygon_Coordinate2 = mapper.createArrayNode();
//        polygonWithHole1_Polygon_Coordinate2.add(101.0).add(0.0);
//
//        ArrayNode polygonWithHole1_Polygon_Coordinate3 = mapper.createArrayNode();
//        polygonWithHole1_Polygon_Coordinate3.add(101.0).add(1.0);
//
//        ArrayNode polygonWithHole1_Polygon_Coordinate4 = mapper.createArrayNode();
//        polygonWithHole1_Polygon_Coordinate4.add(100.0).add(1.0);
//
//        ArrayNode polygonWithHole1_Polygon_Coordinate5 = mapper.createArrayNode();
//        polygonWithHole1_Polygon_Coordinate5.add(100.0).add(0.0);
//
//        ArrayNode polygonWithHole1_Hole_Coordinate1 = mapper.createArrayNode();
//        polygonWithHole1_Hole_Coordinate1.add(100.2).add(0.2);
//
//        ArrayNode polygonWithHole1_Hole_Coordinate2 = mapper.createArrayNode();
//        polygonWithHole1_Hole_Coordinate2.add(100.8).add(0.2);
//
//        ArrayNode polygonWithHole1_Hole_Coordinate3 = mapper.createArrayNode();
//        polygonWithHole1_Hole_Coordinate3.add(100.8).add(0.8);
//
//        ArrayNode polygonWithHole1_Hole_Coordinate4 = mapper.createArrayNode();
//        polygonWithHole1_Hole_Coordinate4.add(100.2).add(0.8);
//
//        ArrayNode polygonWithHole1_Hole_Coordinate5 = mapper.createArrayNode();
//        polygonWithHole1_Hole_Coordinate5.add(100.2).add(0.2);
//
//        polygonWithHole1_Polygon_Coordinates.add(polygonWithHole1_Polygon_Coordinate1);
//        polygonWithHole1_Polygon_Coordinates.add(polygonWithHole1_Polygon_Coordinate2);
//        polygonWithHole1_Polygon_Coordinates.add(polygonWithHole1_Polygon_Coordinate3);
//        polygonWithHole1_Polygon_Coordinates.add(polygonWithHole1_Polygon_Coordinate4);
//        polygonWithHole1_Polygon_Coordinates.add(polygonWithHole1_Polygon_Coordinate5);
//
//        polygonWithHole1_Hole_Coordinates.add(polygonWithHole1_Hole_Coordinate1);
//        polygonWithHole1_Hole_Coordinates.add(polygonWithHole1_Hole_Coordinate2);
//        polygonWithHole1_Hole_Coordinates.add(polygonWithHole1_Hole_Coordinate3);
//        polygonWithHole1_Hole_Coordinates.add(polygonWithHole1_Hole_Coordinate4);
//        polygonWithHole1_Hole_Coordinates.add(polygonWithHole1_Hole_Coordinate5);
//
//        polygonWithHole1OuterCoordinates.add(polygonWithHole1_Polygon_Coordinates);
//        polygonWithHole1OuterCoordinates.add(polygonWithHole1_Hole_Coordinates);
//        polygonWithHole1.setCoordinates(polygonWithHole1OuterCoordinates);
//
//        //////////////////
//        // multiPolygon //
//        //////////////////
//        multiPolygon1 = new GeometricShape();
//        multiPolygon1.setType(GeometricType.MultiPolygon);
//
//        ArrayNode multiPolygon1Coordinates = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon1_OuterCoordinates = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon2_OuterCoordinates = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon3_OuterCoordinates = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon1_Coordinates = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon2_Coordinates = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon3_Coordinates = mapper.createArrayNode();
//
//        ArrayNode multiPolygon1_Polygon1_Coordinate1 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon1_Coordinate2 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon1_Coordinate3 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon1_Coordinate4 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon1_Coordinate5 = mapper.createArrayNode();
//
//        ArrayNode multiPolygon1_Polygon2_Coordinate1 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon2_Coordinate2 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon2_Coordinate3 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon2_Coordinate4 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon2_Coordinate5 = mapper.createArrayNode();
//
//        ArrayNode multiPolygon1_Polygon3_Coordinate1 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon3_Coordinate2 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon3_Coordinate3 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon3_Coordinate4 = mapper.createArrayNode();
//        ArrayNode multiPolygon1_Polygon3_Coordinate5 = mapper.createArrayNode();
//
//        multiPolygon1_Polygon1_Coordinate1.add(102.0).add(2.0);
//        multiPolygon1_Polygon1_Coordinate2.add(103.0).add(2.0);
//        multiPolygon1_Polygon1_Coordinate3.add(103.0).add(3.0);
//        multiPolygon1_Polygon1_Coordinate4.add(102.0).add(3.0);
//        multiPolygon1_Polygon1_Coordinate5.add(102.0).add(2.0);
//
//        multiPolygon1_Polygon2_Coordinate1.add(100.0).add(0.0);
//        multiPolygon1_Polygon2_Coordinate2.add(101.0).add(0.0);
//        multiPolygon1_Polygon2_Coordinate3.add(101.0).add(1.0);
//        multiPolygon1_Polygon2_Coordinate4.add(100.0).add(1.0);
//        multiPolygon1_Polygon2_Coordinate5.add(100.0).add(0.0);
//
//        multiPolygon1_Polygon3_Coordinate1.add(100.2).add(0.2);
//        multiPolygon1_Polygon3_Coordinate2.add(100.8).add(0.2);
//        multiPolygon1_Polygon3_Coordinate3.add(100.8).add(0.8);
//        multiPolygon1_Polygon3_Coordinate4.add(100.2).add(0.8);
//        multiPolygon1_Polygon3_Coordinate5.add(100.2).add(0.2);
//
//        multiPolygon1_Polygon1_Coordinates.add(multiPolygon1_Polygon1_Coordinate1);
//        multiPolygon1_Polygon1_Coordinates.add(multiPolygon1_Polygon1_Coordinate2);
//        multiPolygon1_Polygon1_Coordinates.add(multiPolygon1_Polygon1_Coordinate3);
//        multiPolygon1_Polygon1_Coordinates.add(multiPolygon1_Polygon1_Coordinate4);
//        multiPolygon1_Polygon1_Coordinates.add(multiPolygon1_Polygon1_Coordinate5);
//
//        multiPolygon1_Polygon2_Coordinates.add(multiPolygon1_Polygon2_Coordinate1);
//        multiPolygon1_Polygon2_Coordinates.add(multiPolygon1_Polygon2_Coordinate2);
//        multiPolygon1_Polygon2_Coordinates.add(multiPolygon1_Polygon2_Coordinate3);
//        multiPolygon1_Polygon2_Coordinates.add(multiPolygon1_Polygon2_Coordinate4);
//        multiPolygon1_Polygon2_Coordinates.add(multiPolygon1_Polygon2_Coordinate5);
//
//        multiPolygon1_Polygon3_Coordinates.add(multiPolygon1_Polygon3_Coordinate1);
//        multiPolygon1_Polygon3_Coordinates.add(multiPolygon1_Polygon3_Coordinate2);
//        multiPolygon1_Polygon3_Coordinates.add(multiPolygon1_Polygon3_Coordinate3);
//        multiPolygon1_Polygon3_Coordinates.add(multiPolygon1_Polygon3_Coordinate4);
//        multiPolygon1_Polygon3_Coordinates.add(multiPolygon1_Polygon3_Coordinate5);
//
//        multiPolygon1_Polygon1_OuterCoordinates.add(multiPolygon1_Polygon1_Coordinates);
//        multiPolygon1_Polygon2_OuterCoordinates.add(multiPolygon1_Polygon2_Coordinates);
//        multiPolygon1_Polygon3_OuterCoordinates.add(multiPolygon1_Polygon3_Coordinates);
//        multiPolygon1Coordinates.add(multiPolygon1_Polygon1_OuterCoordinates);
//        multiPolygon1Coordinates.add(multiPolygon1_Polygon2_OuterCoordinates);
//        multiPolygon1Coordinates.add(multiPolygon1_Polygon3_OuterCoordinates);
//        multiPolygon1.setCoordinates(multiPolygon1Coordinates);
//
//        /////////////////
//        // multiPoint (//
//        /////////////////
//        multiPoint1 = new GeometricShape();
//        multiPoint1.setType(GeometricType.MultiPoint);
//
//        ArrayNode multipointCoordinates = mapper.createArrayNode();
//
//        ArrayNode multipointCoordinate1 = mapper.createArrayNode();
//        multipointCoordinate1.add(100.0).add(0.0);
//
//        ArrayNode multipointCoordinate2 = mapper.createArrayNode();
//        multipointCoordinate2.add(101.0).add(1.0);
//
//        multipointCoordinates.add(multipointCoordinate1);
//        multipointCoordinates.add(multipointCoordinate2);
//        multiPoint1.setCoordinates(multipointCoordinates);
//
//        ///////////////////////////////////
//        // multiPoint2 (for bbox testing //
//        ///////////////////////////////////
//        multiPoint2 = new GeometricShape();
//        multiPoint2.setType(GeometricType.MultiPoint);
//
//        ArrayNode multipoint2Coordinates = mapper.createArrayNode();
//
//        ArrayNode multipoint2Coordinate1 = mapper.createArrayNode();
//        multipoint2Coordinate1.add(101.0).add(0.0);
//
//        ArrayNode multipoint2Coordinate2 = mapper.createArrayNode();
//        multipoint2Coordinate2.add(102.0).add(1.0);
//
//        multipoint2Coordinates.add(multipoint2Coordinate1);
//        multipoint2Coordinates.add(multipoint2Coordinate2);
//        multiPoint2.setCoordinates(multipoint2Coordinates);
//
//        float[] bbox = new float[]{-110.0f, -111.0f, 112.0f, 113.0f};
//        multiPoint2.setBbox(bbox);
//
//        /////////////////////
//        // MultiLineString //
//        /////////////////////
//        multiLineString1 = new GeometricShape();
//        multiLineString1.setType(GeometricType.MultiLineString);
//
//        ArrayNode multiLineString1Coordinates = mapper.createArrayNode();
//        ArrayNode multiLineString1_String1_Coordinates = mapper.createArrayNode();
//        ArrayNode multiLineString1_String2_Coordinates = mapper.createArrayNode();
//
//        ArrayNode multiLineString1_String1_Coordinate1 = mapper.createArrayNode();
//        multiLineString1_String1_Coordinate1.add(100.0).add(0.0);
//
//        ArrayNode multiLineString1_String1_Coordinate2 = mapper.createArrayNode();
//        multiLineString1_String1_Coordinate2.add(101.0).add(1.0);
//
//        ArrayNode multiLineString1_String2_Coordinate1 = mapper.createArrayNode();
//        multiLineString1_String2_Coordinate1.add(102.0).add(2.0);
//
//        ArrayNode multiLineString1_String2_Coordinate2 = mapper.createArrayNode();
//        multiLineString1_String2_Coordinate2.add(103.0).add(3.0);
//
//        multiLineString1_String1_Coordinates.add(multiLineString1_String1_Coordinate1);
//        multiLineString1_String1_Coordinates.add(multiLineString1_String1_Coordinate2);
//
//        multiLineString1_String2_Coordinates.add(multiLineString1_String2_Coordinate1);
//        multiLineString1_String2_Coordinates.add(multiLineString1_String2_Coordinate2);
//
//        multiLineString1Coordinates.add(multiLineString1_String1_Coordinates);
//        multiLineString1Coordinates.add(multiLineString1_String2_Coordinates);
//        multiLineString1.setCoordinates(multiLineString1Coordinates);
//
//
//        ////////////////////////
//        // geometryCollection //
//        ////////////////////////
//        geometryCollection1 = new GeometricShape();
//        geometryCollection1.setType(GeometricType.GeometryCollection);
//
//        List<GeometricShape> geometries = new ArrayList<GeometricShape>();
//        geometries.add(point1);
//        geometries.add(lineString1);
//        geometryCollection1.setGeometries(geometries);
//
//        /////////////
//        // Feature //
//        /////////////
//        feature1 = new GeometricShape();
//        feature1.setType(GeometricType.Feature);
//        feature1.setGeometry(multiPolygon1);
//
//        feature2 = new GeometricShape();
//        feature2.setType(GeometricType.Feature);
//        feature2.setGeometry(geometryCollection1);
//
//        ObjectNode feature1Properties = mapper.createObjectNode();
//        ObjectNode feature2Properties = mapper.createObjectNode();
//
//        feature1Properties.put("a key", "a value");
//        feature1Properties.put("another key", "another value");
//        feature2Properties.put("a key for feature2", "a value for feature2");
//        feature2Properties.put("another key for feature2", "another value for feature2");
//
//        feature1.setProperties(feature1Properties);
//        feature2.setProperties(feature2Properties);
//
//        ///////////////////////
//        // FeatureCollection //
//        ///////////////////////
//        List<GeometricShape> features = new ArrayList<GeometricShape>();
//        features.add(feature1);
//        features.add(feature2);
//
//        featureCollection1 = new GeometricShape();
//        featureCollection1.setType(GeometricType.FeatureCollection);
//        featureCollection1.setFeatures(features);
//
//        /////////////////
//        // Crs (named) //
//        /////////////////
//        namedCrs = new Crs();
//        namedCrs.setType(CrsType.name);
//        CrsProperties namedProperties = new CrsProperties();
//        namedProperties.setName("urn:ogc:def:crs:OGC:1.3:CRS84");
//        namedCrs.setProperties(namedProperties);
//
//        //////////////////
//        // Crs (linked) //
//        //////////////////
//        linkedCrs = new Crs();
//        linkedCrs.setType(CrsType.link);
//        CrsProperties linkedProperties = new CrsProperties();
//        linkedProperties.setHref("http://example.com/crs/42");
//        linkedProperties.setType("proj4");
//        linkedCrs.setProperties(linkedProperties);
//
//    }
//
//    /**
//     * Create the point specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint point.json
//     */
//    @Test
//    public void testPoint()
//    {
//        //
//        // create the point
//        //
//
//        Map<String, Object> createPointBody = new HashMap<>();
//        // required
//        createPointBody.put(NAME_FIELD, "integrationtest:geospatial:Point1");
//        createPointBody.put(TYPE_FIELD, "Point");
//        createPointBody.put("geometricShape", point1);
//        // optional
//        createPointBody.put(DESCRIPTION_FIELD, "a point");
//        createPointBody.put(ACTIVE_FIELD, false);
//        createPointBody.put(MONIKER_FIELD, "a moniker");
//
//        // @formatter:off
//        String point1Urn =
//            given()
//                .contentType("application/json")
//                .body(createPointBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get point back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + point1Urn + "/?view=Full")
//        .then()
//            .statusCode(200)
//            .body("geometricShape.crs", equalTo(null))
//            .body("geometricShape.properties", equalTo(null))
//            .body("geometricShape.type", equalTo("Point"))
//            .body("geometricShape.coordinates.get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("moniker", equalTo("a moniker"))
//            .body("description", equalTo("a point"))
//            .body("activeFlag", equalTo(false));
//        // @formatter:on
//    }
//
//    /**
//     * Create the lineString specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint lineString.json
//     */
//    @Test
//    public void testLineString()
//    {
//        //
//        // create the lineString
//        //
//        Map<String, Object> createLineStringBody = new HashMap<>();
//        createLineStringBody.put(NAME_FIELD, "integrationtest:geospatial:LineString1");
//        createLineStringBody.put(TYPE_FIELD, "LineString");
//        createLineStringBody.put("geometricShape", lineString1);
//
//        // @formatter:off
//        String lineString1Urn =
//            given()
//                .contentType("application/json")
//                .body(createLineStringBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get lineString back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + lineString1Urn)
//        .then()
//            .statusCode(200)
//            .body("geometricShape.type", equalTo("LineString"))
//            .body("geometricShape.coordinates.get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(1).toDouble()", closeTo(1.0, 0.01));
//        // @formatter:on
//    }
//
//    /**
//     * Create the polygon specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint polygon.json
//     */
//    @Test
//    public void testPolygon()
//    {
//        //
//        // create the polygon
//        //
//        Map<String, Object> createPolygonBody = new HashMap<>();
//        createPolygonBody.put(NAME_FIELD, "integrationtest:geospatial:polygon1");
//        createPolygonBody.put(TYPE_FIELD, "Polygon");
//        createPolygonBody.put("geometricShape", polygon1);
//
//        // @formatter:off
//        String polygon1Urn =
//            given()
//                .contentType("application/json")
//                .body(createPolygonBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get polygon back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + polygon1Urn)
//        .then()
//            .statusCode(200)
//            .body("geometricShape.type", equalTo("Polygon"))
//            .body("geometricShape.coordinates.get(0).get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(2).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(2).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(3).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(3).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(4).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(4).get(1).toDouble()", closeTo(0.0, 0.01));
//        // @formatter:on
//    }
//
//    /**
//     * Create the polygonWithHole specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint polygon.json
//     */
//    @Test
//    public void testPolygonWithHole()
//    {
//        //
//        // create the polygon
//        //
//        Map<String, Object> createPolygonBody = new HashMap<>();
//        createPolygonBody.put(NAME_FIELD, "integrationtest:geospatial:polygonWithHole1");
//        createPolygonBody.put(TYPE_FIELD, "Polygon");
//        createPolygonBody.put("geometricShape", polygonWithHole1);
//
//        // @formatter:off
//        String polygonWithHole1Urn =
//            given()
//                .contentType("application/json")
//                .body(createPolygonBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get polygon back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + polygonWithHole1Urn)
//        .then()
//            .statusCode(200)
//            .body("geometricShape.type", equalTo("Polygon"))
//            .body("geometricShape.coordinates.get(0).get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(2).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(2).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(3).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(3).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(4).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(4).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.coordinates.get(1).get(1).get(0).toDouble()", closeTo(100.8, 0.01))
//            .body("geometricShape.coordinates.get(1).get(1).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.coordinates.get(1).get(2).get(0).toDouble()", closeTo(100.8, 0.01))
//            .body("geometricShape.coordinates.get(1).get(2).get(1).toDouble()", closeTo(0.8, 0.01))
//            .body("geometricShape.coordinates.get(1).get(3).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.coordinates.get(1).get(3).get(1).toDouble()", closeTo(0.8, 0.01))
//            .body("geometricShape.coordinates.get(1).get(4).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.coordinates.get(1).get(4).get(1).toDouble()", closeTo(0.2, 0.01));
//        // @formatter:on
//    }
//
//    /**
//     * Create the multiPolygon specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint multiPolygon.json
//     */
//    @Test
//    public void testMultiPolygon()
//    {
//        //
//        // create the multiPolygon
//        //
//        Map<String, Object> createMultiPolygonBody = new HashMap<>();
//        createMultiPolygonBody.put(NAME_FIELD, "integrationtest:geospatial:multiPolygon1");
//        createMultiPolygonBody.put(TYPE_FIELD, "MultiPolygon");
//        createMultiPolygonBody.put("geometricShape", multiPolygon1);
//
//        // @formatter:off
//        String multiPolygon1Urn =
//            given()
//                .contentType("application/json")
//                .body(createMultiPolygonBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get multiPolygon back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + multiPolygon1Urn)
//        .then()
//            .statusCode(200)
//            .body("geometricShape.type", equalTo("MultiPolygon"))
//            .body("geometricShape.coordinates.get(0).get(0).get(0).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(0).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(1).get(0).toDouble()", closeTo(103.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(1).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(2).get(0).toDouble()", closeTo(103.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(2).get(1).toDouble()", closeTo(3.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(3).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(3).get(1).toDouble()", closeTo(3.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(4).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(4).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(1).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(2).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(2).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(3).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(3).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(4).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).get(4).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(0).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(0).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(1).get(0).toDouble()", closeTo(100.8, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(1).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(2).get(0).toDouble()", closeTo(100.8, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(2).get(1).toDouble()", closeTo(0.8, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(3).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(3).get(1).toDouble()", closeTo(0.8, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(4).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.coordinates.get(2).get(0).get(4).get(1).toDouble()", closeTo(0.2, 0.01));
//        // @formatter:on
//    }
//
//    /**
//     * Create the multiPoint specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint multiPoint.json
//     */
//    @Test
//    public void testMultiPoint()
//    {
//        //
//        // create the multiPoint
//        //
//
//        Map<String, Object> createMultiPointBody = new HashMap<>();
//        // required
//        createMultiPointBody.put(NAME_FIELD, "integrationtest:geospatial:MultiPoint1");
//        createMultiPointBody.put(TYPE_FIELD, "MultiPoint");
//        createMultiPointBody.put("geometricShape", multiPoint1);
//        // optional
//        createMultiPointBody.put(DESCRIPTION_FIELD, "a multiPoint");
//        createMultiPointBody.put(ACTIVE_FIELD, true);
//        createMultiPointBody.put(MONIKER_FIELD, "a moniker for the multiPoint");
//
//        // @formatter:off
//        String multiPoint1Urn =
//            given()
//                .contentType("application/json")
//                .body(createMultiPointBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get multiPoint back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + multiPoint1Urn + "/?view=Full")
//        .then()
//            .statusCode(200)
//            .body("geometricShape.crs", equalTo(null))
//            .body("geometricShape.properties", equalTo(null))
//            .body("geometricShape.type", equalTo("MultiPoint"))
//            .body("geometricShape.coordinates.get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("moniker", equalTo("a moniker for the multiPoint"))
//            .body("description", equalTo("a multiPoint"))
//            .body("activeFlag", equalTo(true));
//        // @formatter:on
//    }
//
//    /**
//     * Create the multiLineString specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint multiLineString.json
//     */
//    @Test
//    public void testMultiLineString()
//    {
//        //
//        // create the multiLineString
//        //
//        Map<String, Object> createMultiLineStringBody = new HashMap<>();
//        createMultiLineStringBody.put(NAME_FIELD, "integrationtest:geospatial:MultiLineString1");
//        createMultiLineStringBody.put(TYPE_FIELD, "MultiLineString");
//        createMultiLineStringBody.put("geometricShape", multiLineString1);
//
//        // @formatter:off
//        String multiLineString1Urn =
//            given()
//                .contentType("application/json")
//                .body(createMultiLineStringBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get multiLineString back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + multiLineString1Urn)
//        .then()
//            .statusCode(200)
//            .body("geometricShape.type", equalTo("MultiLineString"))
//            .body("geometricShape.coordinates.get(0).get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).get(1).toDouble()", closeTo(1.0, 0.01));
//        // @formatter:on
//    }
//
//    /**
//     * Create the geometryCollection specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint geometryCollection.json
//     */
//    @Test
//    public void testGeometryCollection()
//    {
//        //
//        // create the geometryCollection
//        //
//        Map<String, Object> createGeometryCollectionBody = new HashMap<>();
//        createGeometryCollectionBody.put(NAME_FIELD, "integrationtest:geospatial:GeometryCollection1");
//        createGeometryCollectionBody.put(TYPE_FIELD, "GeometryCollection");
//        createGeometryCollectionBody.put("geometricShape", geometryCollection1);
//
//        // @formatter:off
//        String geometryCollection1Urn =
//            given()
//                .contentType("application/json")
//                .body(createGeometryCollectionBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get geometryCollection back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + geometryCollection1Urn)
//        .then()
//            .statusCode(200)
//
//            .body("geometricShape.type", equalTo("GeometryCollection"))
//            .body("geometricShape.geometries.get(0).type", equalTo("Point"))
//            .body("geometricShape.geometries.get(0).coordinates.get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.geometries.get(0).coordinates.get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.geometries.get(1).type", equalTo("LineString"))
//            .body("geometricShape.geometries.get(1).coordinates.get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.geometries.get(1).coordinates.get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.geometries.get(1).coordinates.get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.geometries.get(1).coordinates.get(1).get(1).toDouble()", closeTo(1.0, 0.01));
//        // @formatter:on
//    }
//
//    /**
//     * Create the feature specified as feature1 in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint feature.json
//     */
//    @Test
//    public void testFeature()
//    {
//        //
//        // create the feature
//        //
//        Map<String, Object> createFeatureBody = new HashMap<>();
//        createFeatureBody.put(NAME_FIELD, "integrationtest:geospatial:Feature1");
//        createFeatureBody.put(TYPE_FIELD, "Feature");
//        createFeatureBody.put("geometricShape", feature1);
//
//        // @formatter:off
//        String feature1Urn =
//            given()
//                .contentType("application/json")
//                .body(createFeatureBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get feature back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + feature1Urn)
//        .then()
//            .statusCode(200)
//            .body("geometricShape.type", equalTo("Feature"))
//            .body("geometricShape.geometry.type", equalTo("MultiPolygon"))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(0).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(0).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(1).get(0).toDouble()", closeTo(103.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(1).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(2).get(0).toDouble()", closeTo(103.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(2).get(1).toDouble()", closeTo(3.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(3).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(3).get(1).toDouble()", closeTo(3.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(4).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(0).get(0).get(4).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(1).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(2).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(2).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(3).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(3).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(4).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(1).get(0).get(4).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(0).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(0).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(1).get(0).toDouble()", closeTo(100.8, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(1).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(2).get(0).toDouble()", closeTo(100.8, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(2).get(1).toDouble()", closeTo(0.8, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(3).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(3).get(1).toDouble()", closeTo(0.8, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(4).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.geometry.coordinates.get(2).get(0).get(4).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.properties.get('a key')", equalTo("a value"))
//            .body("geometricShape.properties.get('another key')", equalTo("another value"));
//        // @formatter:on
//    }
//
//    /**
//     * Create the featureCollection specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint featureCollection.json
//     */
//    @Test
//    public void testFeatureCollection()
//    {
//        //
//        // create the featureCollection
//        //
//        Map<String, Object> createFeatureCollectionBody = new HashMap<>();
//        createFeatureCollectionBody.put(NAME_FIELD, "integrationtest:geospatial:FeatureCollection1");
//        createFeatureCollectionBody.put(TYPE_FIELD, "FeatureCollection");
//        createFeatureCollectionBody.put("geometricShape", featureCollection1);
//
//        // @formatter:off
//        String featureCollection1Urn =
//            given()
//                .contentType("application/json")
//                .body(createFeatureCollectionBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get featureCollection back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + featureCollection1Urn)
//        .then()
//            .statusCode(200)
//            .body("geometricShape.type", equalTo("FeatureCollection"))
//            .body("geometricShape.features.get(0).type", equalTo("Feature"))
//            .body("geometricShape.features.get(0).geometry.type", equalTo("MultiPolygon"))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(0).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(0).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(1).get(0).toDouble()", closeTo(103.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(1).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(2).get(0).toDouble()", closeTo(103.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(2).get(1).toDouble()", closeTo(3.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(3).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(3).get(1).toDouble()", closeTo(3.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(4).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(0).get(0).get(4).get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(1).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(2).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(2).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(3).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(3).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(4).get(0).toDouble()", closeTo(100.0, 0.01))
//        .body("geometricShape.features.get(0).geometry.coordinates.get(1).get(0).get(4).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(0).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(0).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(1).get(0).toDouble()", closeTo(100.8, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(1).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(2).get(0).toDouble()", closeTo(100.8, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(2).get(1).toDouble()", closeTo(0.8, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(3).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(3).get(1).toDouble()", closeTo(0.8, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(4).get(0).toDouble()", closeTo(100.2, 0.01))
//            .body("geometricShape.features.get(0).geometry.coordinates.get(2).get(0).get(4).get(1).toDouble()", closeTo(0.2, 0.01))
//            .body("geometricShape.features.get(0).properties.get('a key')", equalTo("a value"))
//            .body("geometricShape.features.get(0).properties.get('another key')", equalTo("another value"))
//            .body("geometricShape.features.get(1).type", equalTo("Feature"))
//            .body("geometricShape.features.get(1).geometry.type", equalTo("GeometryCollection"))
//            .body("geometricShape.features.get(1).geometry.geometries.get(0).type", equalTo("Point"))
//            .body("geometricShape.features.get(1).geometry.geometries.get(0).coordinates.get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.features.get(1).geometry.geometries.get(0).coordinates.get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.features.get(1).geometry.geometries.get(1).type", equalTo("LineString"))
//            .body("geometricShape.features.get(1).geometry.geometries.get(1).coordinates.get(0).get(0).toDouble()", closeTo(100.0, 0.01))
//            .body("geometricShape.features.get(1).geometry.geometries.get(1).coordinates.get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.features.get(1).geometry.geometries.get(1).coordinates.get(1).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.features.get(1).geometry.geometries.get(1).coordinates.get(1).get(1).toDouble()", closeTo(1.0, 0.01));
//        // @formatter:on
//    }
//
//    /**
//     * Attach the named CRS from initialize() to the Point created in initialize, update the point,
//     * pull it back from the database, and make sure the CRS is there.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint pointWithNamedCrs.json
//     */
//    @Test
//    public void testUpdatePointWithNamedCrs()
//    {
//        //
//        // create (PUT) the initial point
//        //
//        Map<String, Object> createPointBody = new HashMap<>();
//        // required
//        createPointBody.put(NAME_FIELD, "integrationtest:geospatial:Point2");
//        createPointBody.put(TYPE_FIELD, "Point");
//        createPointBody.put("geometricShape", point1);
//        // optional
//        createPointBody.put(DESCRIPTION_FIELD, "a second point");
//        createPointBody.put(ACTIVE_FIELD, true);
//        createPointBody.put(MONIKER_FIELD, "a moniker for the second point");
//
//        // @formatter:off
//        String point2Urn =
//            given()
//                .contentType("application/json")
//                .body(createPointBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // it's in the database, and now we can update it with the named CRS
//        //
//        point2.setCrs(namedCrs);
//
//        // update body should only need URN and updated GeometricShape object
//        Map<String, Object> updatePointBody = new HashMap<>();
//        updatePointBody.put(URN_FIELD, point2Urn);
//        updatePointBody.put("geometricShape", point2);
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .body(updatePointBody)
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .post(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//        .then()
//            .statusCode(204);
//        // @formatter:on
//
//        //
//        // get point back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + point2Urn + "/?view=Full")
//        .then()
//            .statusCode(200)
//            .body("geometricShape.crs.type", equalTo("name"))
//            .body("geometricShape.crs.properties.get('name')", equalTo("urn:ogc:def:crs:OGC:1.3:CRS84"))
//            .body("geometricShape.properties", equalTo(null))
//            .body("geometricShape.type", equalTo("Point"))
//            .body("geometricShape.coordinates.get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("moniker", equalTo("a moniker for the second point"))
//            .body("description", equalTo("a second point"))
//            .body("activeFlag", equalTo(true));
//        // @formatter:on
//    }
//
//    /**
//     * Attach the linked CRS from initialize() to the Point created in initialize, update the point,
//     * pull it back from the database, and make sure the CRS is there.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint pointWithLinkedCrs.json
//     */
//    @Test
//    public void testUpdatePointWithLinkedCrs()
//    {
//        //
//        // create (PUT) the initial point
//        //
//        Map<String, Object> createPointBody = new HashMap<>();
//        // required
//        createPointBody.put(NAME_FIELD, "integrationtest:geospatial:Point3");
//        createPointBody.put(TYPE_FIELD, "Point");
//        createPointBody.put("geometricShape", point3);
//        // optional
//        createPointBody.put(DESCRIPTION_FIELD, "a third point");
//        createPointBody.put(ACTIVE_FIELD, true);
//        createPointBody.put(MONIKER_FIELD, "a moniker for the third point");
//
//        // @formatter:off
//        String point3Urn =
//            given()
//                .contentType("application/json")
//                .body(createPointBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // it's in the database, and now we can update it with the named CRS
//        //
//        point3.setCrs(linkedCrs);
//
//        // update body should only need URN and updated GeometricShape object
//        Map<String, Object> updatePointBody = new HashMap<>();
//        updatePointBody.put(URN_FIELD, point3Urn);
//        updatePointBody.put("geometricShape", point3);
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .body(updatePointBody)
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .post(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//        .then()
//            .statusCode(204);
//        // @formatter:on
//
//        //
//        // get point back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + point3Urn + "/?view=Full")
//        .then()
//            .statusCode(200)
//            .body("geometricShape.crs.type", equalTo("link"))
//            .body("geometricShape.crs.properties.get('type')", equalTo("proj4"))
//            .body("geometricShape.crs.properties.get('href')", equalTo("http://example.com/crs/42"))
//            .body("geometricShape.crs.properties.get('name')", equalTo(null))
//            .body("geometricShape.properties", equalTo(null))
//            .body("geometricShape.type", equalTo("Point"))
//            .body("geometricShape.coordinates.get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.coordinates.get(1).toDouble()", closeTo(2.0, 0.01))
//            .body("moniker", equalTo("a moniker for the third point"))
//            .body("description", equalTo("a third point"))
//            .body("activeFlag", equalTo(true));
//        // @formatter:on
//    }
//
//    /**
//     * Create the multiPoint (with bbox) specified in initialize(), stuff in in the database, yank it back out,
//     * and verify that the fields we set in initialize() have been populated.
//     * <p>
//     * In a side channel, copy the returned JSON into a file (to get the returned
//     * JSON in stdout, force a failure by setting the return code of the GET call
//     * to something other than 200), and run the file through:
//     * <p>
//     * % geojsonhint multiPointWithBbox.json
//     */
//    @Test
//    public void testMultiPointWithBbox()
//    {
//        //
//        // create the multiPoint
//        //
//
//        Map<String, Object> createMultiPointWithBboxBody = new HashMap<>();
//        // required
//        createMultiPointWithBboxBody.put(NAME_FIELD, "integrationtest:geospatial:MultiPoint2");
//        createMultiPointWithBboxBody.put(TYPE_FIELD, "MultiPoint");
//        createMultiPointWithBboxBody.put("geometricShape", multiPoint2);
//        // optional
//        createMultiPointWithBboxBody.put(DESCRIPTION_FIELD, "a multiPoint with bounding box");
//        createMultiPointWithBboxBody.put(ACTIVE_FIELD, true);
//        createMultiPointWithBboxBody.put(MONIKER_FIELD, "a moniker for the multiPoint with bounding box");
//
//        // @formatter:off
//        String multiPoint2Urn =
//            given()
//                .contentType("application/json")
//                .body(createMultiPointWithBboxBody)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get multiPoint back from database, and have a look at the stored geoJson
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + multiPoint2Urn + "/?view=Full")
//        .then()
//            .statusCode(200)
//            .body("geometricShape.crs", equalTo(null))
//            .body("geometricShape.properties", equalTo(null))
//            .body("geometricShape.type", equalTo("MultiPoint"))
//            .body("geometricShape.bbox.get(0).toDouble()", closeTo(-110.0, 0.01))
//            .body("geometricShape.bbox.get(1).toDouble()", closeTo(-111.0, 0.01))
//            .body("geometricShape.bbox.get(2).toDouble()", closeTo(112.0, 0.01))
//            .body("geometricShape.bbox.get(3).toDouble()", closeTo(113.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(0).toDouble()", closeTo(101.0, 0.01))
//            .body("geometricShape.coordinates.get(0).get(1).toDouble()", closeTo(0.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(0).toDouble()", closeTo(102.0, 0.01))
//            .body("geometricShape.coordinates.get(1).get(1).toDouble()", closeTo(1.0, 0.01))
//            .body("moniker", equalTo("a moniker for the multiPoint with bounding box"))
//            .body("description", equalTo("a multiPoint with bounding box"))
//            .body("activeFlag", equalTo(true));
//        // @formatter:on
//    }
//
//    /**
//     * Create the point4 specified in initialize(), try to stuff it in the database
//     * with no type field in the request body, and verify that the server returns 400
//     * in response to the missing required field.
//     *
//     * Then add the type into the body, but take the auth out of the request, and verify
//     * that the server returns 401 in response.
//     */
//    @Test
//    public void testErrorResponsesPut()
//    {
//        //
//        // create the request body without a type field
//        //
//        Map<String, Object> createPoint4Body = new HashMap<>();
//        // required
//        createPoint4Body.put(NAME_FIELD, "integrationtest:geospatial:Point4");
//        // NO TYPE FIELD! createPoint4Body.put(TYPE_FIELD, "Point");
//        createPoint4Body.put("geometricShape", point4);
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .body(createPoint4Body)
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//        .then()
//            .statusCode(400);
//        // @formatter:on
//
//        //
//        // add the type field back in, but take the auth out of the request
//        //
//        createPoint4Body.put(TYPE_FIELD, "Point");
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .body(createPoint4Body)
//            //.auth()
//            //.preemptive()
//            //.basic(getServerContext().getEmailAddress(), getServerContext().getCredentials())
//        .when()
//            .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//        .then()
//            .statusCode(401);
//        // @formatter:on
//
//    }
//
//    /**
//     * Create the point5 specified in initialize(),and stuff it in the database.
//     * Attempt an update with no URN field in the request body to verify that this returns 400.
//     * Attempt an update with no auth in the request to verify that this returns 401.
//     */
//    @Test
//    public void testErrorResponsesPost()
//    {
//        //
//        // create the Point and stuff it in the database
//        //
//        Map<String, Object> createPoint5Body = new HashMap<>();
//        // required
//        createPoint5Body.put(NAME_FIELD, "integrationtest:geospatial:Point4");
//        createPoint5Body.put(TYPE_FIELD, "Point");
//        createPoint5Body.put("geometricShape", point5);
//
//        // @formatter:off
//        String point5urn =
//            given()
//                .contentType("application/json")
//                .body(createPoint5Body)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // attempt an update with no URN in the request body
//        //
//        createPoint5Body.put(DESCRIPTION_FIELD, "a description for point5");
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .body(createPoint5Body)
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .post(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//        .then()
//            .statusCode(400);
//        // @formatter:on
//
//        //
//        // add the URN to the body, but remove auth from the request
//        //
//        createPoint5Body.put(URN_FIELD, point5urn);
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .body(createPoint5Body)
//            //.auth()
//            //.preemptive()
//            //.basic(getServerContext().getEmailAddress(), getServerContext().getCredentials())
//        .when()
//            .post(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//        .then()
//            .statusCode(401);
//        // @formatter:on
//
//        //
//        // put the auth back in and verify the update
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .body(createPoint5Body)
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .post(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//        .then()
//            .statusCode(204);
//        // @formatter:on
//
//        //
//        // get the point back from the database, and verify that description has been updated
//        //
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/" + point5urn + "/?view=Full")
//        .then()
//            .statusCode(200)
//            .body("geometricShape.crs", equalTo(null))
//            .body("geometricShape.properties", equalTo(null))
//            .body("geometricShape.type", equalTo("Point"))
//            .body("geometricShape.coordinates.get(0).toDouble()", closeTo(104.0, 0.01))
//            .body("geometricShape.coordinates.get(1).toDouble()", closeTo(4.0, 0.01))
//            .body("description", equalTo("a description for point5"));
//        // @formatter:on
//
//    }
//
//    /**
//     * Create the three points specified in initialize(), with names "bl", "bla", and "blah".
//     * Stuff them in the database, and use the GET find by name endpoint to pull appropriate
//     * numbers of them back out.
//     *
//     * Note that "nameLike" really means "nameStartsWith", which is a big problem throughout Objects.
//     */
//    @Test
//    public void testFindByName()
//    {
//        //
//        // create point6
//        //
//        Map<String, Object> createPoint6Body = new HashMap<>();
//        // required
//        createPoint6Body.put(NAME_FIELD, "bl");
//        createPoint6Body.put(TYPE_FIELD, "Point");
//        createPoint6Body.put("geometricShape", point6);
//
//        // @formatter:off
//        String point6Urn =
//            given()
//                .contentType("application/json")
//                .body(createPoint6Body)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // create point7
//        //
//        Map<String, Object> createPoint7Body = new HashMap<>();
//        // required
//        createPoint7Body.put(NAME_FIELD, "bla");
//        createPoint7Body.put(TYPE_FIELD, "Point");
//        createPoint7Body.put("geometricShape", point7);
//
//        // @formatter:off
//        String point7Urn =
//            given()
//                .contentType("application/json")
//                .body(createPoint7Body)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // create point8
//        //
//        Map<String, Object> createPoint8Body = new HashMap<>();
//        // required
//        createPoint8Body.put(NAME_FIELD, "blah");
//        createPoint8Body.put(TYPE_FIELD, "Point");
//        createPoint8Body.put("geometricShape", point8);
//
//        // @formatter:off
//        String point8Urn =
//            given()
//                .contentType("application/json")
//                .body(createPoint8Body)
//                .auth()
//                .preemptive()
//                .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//            .when()
//                .put(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial")
//            .then()
//                .statusCode(201).extract().path("message");
//        // @formatter:on
//
//        //
//        // get points back from database with ?nameLike=, and have a look at the counts
//        //
//
//        // we call it name like, but really it's nameStartsWith, so "l" with return 0
//        // and status 204 instead of the 2 and status 200 we'd see in a better world
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/?nameLike=" + "urf" + "&view=Full")
//        .then()
//            .statusCode(204);
//        // @formatter:on
//
//        // "bl" should return all three
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/?nameLike=" + "bl" + "&view=Full")
//        .then()
//            .statusCode(200)
//            .body("size()", is(3));
//        // @formatter:on
//
//        // "bla" should return two
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/?nameLike=" + "bla" + "&view=Full")
//        .then()
//            .statusCode(200)
//            .body("size()", is(2));
//        // @formatter:on
//
//        // "blah" should return only one
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/?nameLike=" + "blah" + "&view=Full")
//        .then()
//            .statusCode(200)
//            .body("size()", is(1));
//        // @formatter:on
//
//        // "blahx" should return none, i.e., an empty body and status 204
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            .auth()
//            .preemptive()
//            .basic(AbstractServerTest.getServerContext().getEmailAddress(), AbstractServerTest.getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/?nameLike=" + "blahx" + "&view=Full")
//        .then()
//            .statusCode(204);
//        // @formatter:on
//
//        // verify that with no authentication we get the expected 401 back
//
//        // @formatter:off
//        given()
//            .contentType("application/json")
//            //.auth()
//            //.preemptive()
//            //.basic(getServerContext().getEmailAddress(), getServerContext().getCredentials())
//        .when()
//            .get(AbstractServerTest.getServerContext().getServerUrl() + "/rest/geospatial/?nameLike=" + "blah" + "&view=Full")
//        .then()
//            .statusCode(401);
//        // @formatter:on
//
//    }
//
//    private static String resourceFilePath(String config)
//    {
//        URL resource = GeospatialRestIT.class.getResource(config);
//        final String path = resource.toString();
//        // This is a hack because we will parse the configuration file before DW does.
//        ObjectsApplication.setConfigFilePath(path);
//        return path;
//    }
//
}

