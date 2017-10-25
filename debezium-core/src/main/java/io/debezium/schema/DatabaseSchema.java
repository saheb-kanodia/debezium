/*
 * Copyright Debezium Authors.
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package io.debezium.schema;

public interface DatabaseSchema {

    void applySchemaChange(SchemaChangeEvent schemaChange);

    DataCollectionSchema getDataCollectionSchema(DataCollectionId id);
}
