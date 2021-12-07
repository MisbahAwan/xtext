/**
 */
package zNotationEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZNotation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.ZNotationModel#getSchema <em>Schema</em>}</li>
 *   <li>{@link zNotationEcore.ZNotationModel#getModelName <em>Model Name</em>}</li>
 * </ul>
 *
 * @see zNotationEcore.ZNotationEcorePackage#getZNotationModel()
 * @model
 * @generated
 */
public interface ZNotationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link zNotationEcore.Schema}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see zNotationEcore.ZNotationEcorePackage#getZNotationModel_Schema()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getSchema();

	/**
	 * Returns the value of the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Name</em>' attribute.
	 * @see #setModelName(String)
	 * @see zNotationEcore.ZNotationEcorePackage#getZNotationModel_ModelName()
	 * @model
	 * @generated
	 */
	String getModelName();

	/**
	 * Sets the value of the '{@link zNotationEcore.ZNotationModel#getModelName <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Name</em>' attribute.
	 * @see #getModelName()
	 * @generated
	 */
	void setModelName(String value);

} // ZNotationModel
