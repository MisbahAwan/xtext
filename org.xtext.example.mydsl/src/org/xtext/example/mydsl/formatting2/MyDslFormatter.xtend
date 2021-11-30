/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.xtext.example.mydsl.services.MyDslGrammarAccess
import zNotationEcore.SchemaState
import zNotationEcore.ZNotationModel

class MyDslFormatter extends AbstractFormatter2 {
	
	@Inject extension MyDslGrammarAccess

	def dispatch void format(ZNotationModel zNotationModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (schema : zNotationModel.schema) {
			schema.format
		}
	}

	def dispatch void format(SchemaState schemaState, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (variable : schemaState.variable) {
			variable.format
		}
	}
	
}