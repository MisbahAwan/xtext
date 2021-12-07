/**
 */
package zNotationEcore;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.Schema#getSchemastate <em>Schemastate</em>}</li>
 *   <li>{@link zNotationEcore.Schema#getSchemaTitle <em>Schema Title</em>}</li>
 *   <li>{@link zNotationEcore.Schema#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see zNotationEcore.ZNotationEcorePackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Schemastate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemastate</em>' reference.
	 * @see #setSchemastate(SchemaState)
	 * @see zNotationEcore.ZNotationEcorePackage#getSchema_Schemastate()
	 * @model
	 * @generated
	 */
	SchemaState getSchemastate();

	/**
	 * Sets the value of the '{@link zNotationEcore.Schema#getSchemastate <em>Schemastate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schemastate</em>' reference.
	 * @see #getSchemastate()
	 * @generated
	 */
	void setSchemastate(SchemaState value);

	/**
	 * Returns the value of the '<em><b>Schema Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Title</em>' attribute.
	 * @see #setSchemaTitle(String)
	 * @see zNotationEcore.ZNotationEcorePackage#getSchema_SchemaTitle()
	 * @model
	 * @generated
	 */
	String getSchemaTitle();

	/**
	 * Sets the value of the '{@link zNotationEcore.Schema#getSchemaTitle <em>Schema Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Title</em>' attribute.
	 * @see #getSchemaTitle()
	 * @generated
	 */
	void setSchemaTitle(String value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link zNotationEcore.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see zNotationEcore.ZNotationEcorePackage#getSchema_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelation();

} // Schema
