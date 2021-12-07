/**
 */
package zNotationEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.Relation#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link zNotationEcore.Relation#getRelatedTo <em>Related To</em>}</li>
 * </ul>
 *
 * @see zNotationEcore.ZNotationEcorePackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' attribute.
	 * @see #setRelationType(String)
	 * @see zNotationEcore.ZNotationEcorePackage#getRelation_RelationType()
	 * @model
	 * @generated
	 */
	String getRelationType();

	/**
	 * Sets the value of the '{@link zNotationEcore.Relation#getRelationType <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' attribute.
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(String value);

	/**
	 * Returns the value of the '<em><b>Related To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To</em>' attribute.
	 * @see #setRelatedTo(String)
	 * @see zNotationEcore.ZNotationEcorePackage#getRelation_RelatedTo()
	 * @model
	 * @generated
	 */
	String getRelatedTo();

	/**
	 * Sets the value of the '{@link zNotationEcore.Relation#getRelatedTo <em>Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related To</em>' attribute.
	 * @see #getRelatedTo()
	 * @generated
	 */
	void setRelatedTo(String value);

} // Relation
