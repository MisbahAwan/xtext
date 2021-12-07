/**
 */
package zNotationEcore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import zNotationEcore.SchemaState;
import zNotationEcore.Variable;
import zNotationEcore.ZNotationEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.impl.SchemaStateImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link zNotationEcore.impl.SchemaStateImpl#getStateType <em>State Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaStateImpl extends MinimalEObjectImpl.Container implements SchemaState {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The default value of the '{@link #getStateType() <em>State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateType()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStateType() <em>State Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateType()
	 * @generated
	 * @ordered
	 */
	protected String stateType = STATE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZNotationEcorePackage.Literals.SCHEMA_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentEList<Variable>(Variable.class, this,
					ZNotationEcorePackage.SCHEMA_STATE__VARIABLE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStateType() {
		return stateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateType(String newStateType) {
		String oldStateType = stateType;
		stateType = newStateType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZNotationEcorePackage.SCHEMA_STATE__STATE_TYPE,
					oldStateType, stateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ZNotationEcorePackage.SCHEMA_STATE__VARIABLE:
			return ((InternalEList<?>) getVariable()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ZNotationEcorePackage.SCHEMA_STATE__VARIABLE:
			return getVariable();
		case ZNotationEcorePackage.SCHEMA_STATE__STATE_TYPE:
			return getStateType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ZNotationEcorePackage.SCHEMA_STATE__VARIABLE:
			getVariable().clear();
			getVariable().addAll((Collection<? extends Variable>) newValue);
			return;
		case ZNotationEcorePackage.SCHEMA_STATE__STATE_TYPE:
			setStateType((String) newValue);
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
		case ZNotationEcorePackage.SCHEMA_STATE__VARIABLE:
			getVariable().clear();
			return;
		case ZNotationEcorePackage.SCHEMA_STATE__STATE_TYPE:
			setStateType(STATE_TYPE_EDEFAULT);
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
		case ZNotationEcorePackage.SCHEMA_STATE__VARIABLE:
			return variable != null && !variable.isEmpty();
		case ZNotationEcorePackage.SCHEMA_STATE__STATE_TYPE:
			return STATE_TYPE_EDEFAULT == null ? stateType != null : !STATE_TYPE_EDEFAULT.equals(stateType);
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
		result.append(" (StateType: ");
		result.append(stateType);
		result.append(')');
		return result.toString();
	}

} //SchemaStateImpl
