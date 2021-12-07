/**
 */
package zNotationEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.SchemaState#getVariable <em>Variable</em>}</li>
 *   <li>{@link zNotationEcore.SchemaState#getStateType <em>State Type</em>}</li>
 * </ul>
 *
 * @see zNotationEcore.ZNotationEcorePackage#getSchemaState()
 * @model
 * @generated
 */
public interface SchemaState extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link zNotationEcore.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see zNotationEcore.ZNotationEcorePackage#getSchemaState_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>State Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Type</em>' attribute.
	 * @see #setStateType(String)
	 * @see zNotationEcore.ZNotationEcorePackage#getSchemaState_StateType()
	 * @model
	 * @generated
	 */
	String getStateType();

	/**
	 * Sets the value of the '{@link zNotationEcore.SchemaState#getStateType <em>State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Type</em>' attribute.
	 * @see #getStateType()
	 * @generated
	 */
	void setStateType(String value);

} // SchemaState
