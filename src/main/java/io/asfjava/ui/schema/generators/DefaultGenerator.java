package io.asfjava.ui.schema.generators;

import java.lang.reflect.Field;

import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.asfjava.ui.schema.interfaces.SchemaGenerator;

public final class DefaultGenerator implements SchemaGenerator {
	@Override
	public ArrayNode generate(ObjectNode fieldFormDefinition, ArrayNode formDefinition, Field field) {
		return formDefinition;
	}

}
