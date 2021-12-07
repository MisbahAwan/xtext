/**
 */
package zNotationEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Change Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.StateChangeOperator#getStateChangeType <em>State Change Type</em>}</li>
 * </ul>
 *
 * @see zNotationEcore.ZNotationEcorePackage#getStateChangeOperator()
 * @model
 * @generated
 */
public interface StateChangeOperator extends EObject {
	/**
	 * Returns the value of the '<em><b>State Change Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Change Type</em>' attribute.
	 * @see #setStateChangeType(String)
	 * @see zNotationEcore.ZNotationEcorePackage#getStateChangeOperator_StateChangeType()
	 * @model
	 * @generated
	 */
	String getStateChangeType();

	/**
	 * Sets the value of the '{@link zNotationEcore.StateChangeOperator#getStateChangeType <em>State Change Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Change Type</em>' attribute.
	 * @see #getStateChangeType()
	 * @generated
	 */
	void setStateChangeType(String value);

} // StateChangeOperator
