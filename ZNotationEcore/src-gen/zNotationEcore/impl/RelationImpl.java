/**
 */
package zNotationEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import zNotationEcore.Relation;
import zNotationEcore.ZNotationEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.impl.RelationImpl#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link zNotationEcore.impl.RelationImpl#getRelatedTo <em>Related To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The default value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected String relationType = RELATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelatedTo() <em>Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATED_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelatedTo() <em>Related To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected String relatedTo = RELATED_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZNotationEcorePackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelationType() {
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationType(String newRelationType) {
		String oldRelationType = relationType;
		relationType = newRelationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZNotationEcorePackage.RELATION__RELATION_TYPE,
					oldRelationType, relationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelatedTo() {
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedTo(String newRelatedTo) {
		String oldRelatedTo = relatedTo;
		relatedTo = newRelatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZNotationEcorePackage.RELATION__RELATED_TO,
					oldRelatedTo, relatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ZNotationEcorePackage.RELATION__RELATION_TYPE:
			return getRelationType();
		case ZNotationEcorePackage.RELATION__RELATED_TO:
			return getRelatedTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ZNotationEcorePackage.RELATION__RELATION_TYPE:
			setRelationType((String) newValue);
			return;
		case ZNotationEcorePackage.RELATION__RELATED_TO:
			setRelatedTo((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ZNotationEcorePackage.RELATION__RELATION_TYPE:
			setRelationType(RELATION_TYPE_EDEFAULT);
			return;
		case ZNotationEcorePackage.RELATION__RELATED_TO:
			setRelatedTo(RELATED_TO_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ZNotationEcorePackage.RELATION__RELATION_TYPE:
			return RELATION_TYPE_EDEFAULT == null ? relationType != null : !RELATION_TYPE_EDEFAULT.equals(relationType);
		case ZNotationEcorePackage.RELATION__RELATED_TO:
			return RELATED_TO_EDEFAULT == null ? relatedTo != null : !RELATED_TO_EDEFAULT.equals(relatedTo);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (RelationType: ");
		result.append(relationType);
		result.append(", RelatedTo: ");
		result.append(relatedTo);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
