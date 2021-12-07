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

import zNotationEcore.Schema;
import zNotationEcore.ZNotationEcorePackage;
import zNotationEcore.ZNotationModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZNotation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.impl.ZNotationModelImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link zNotationEcore.impl.ZNotationModelImpl#getModelName <em>Model Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZNotationModelImpl extends MinimalEObjectImpl.Container implements ZNotationModel {
	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schema;

	/**
	 * The default value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelName() <em>Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelName()
	 * @generated
	 * @ordered
	 */
	protected String modelName = MODEL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZNotationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZNotationEcorePackage.Literals.ZNOTATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchema() {
		if (schema == null) {
			schema = new EObjectContainmentEList<Schema>(Schema.class, this,
					ZNotationEcorePackage.ZNOTATION_MODEL__SCHEMA);
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelName() {
		return modelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelName(String newModelName) {
		String oldModelName = modelName;
		modelName = newModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZNotationEcorePackage.ZNOTATION_MODEL__MODEL_NAME,
					oldModelName, modelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ZNotationEcorePackage.ZNOTATION_MODEL__SCHEMA:
			return ((InternalEList<?>) getSchema()).basicRemove(otherEnd, msgs);
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
		case ZNotationEcorePackage.ZNOTATION_MODEL__SCHEMA:
			return getSchema();
		case ZNotationEcorePackage.ZNOTATION_MODEL__MODEL_NAME:
			return getModelName();
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
		case ZNotationEcorePackage.ZNOTATION_MODEL__SCHEMA:
			getSchema().clear();
			getSchema().addAll((Collection<? extends Schema>) newValue);
			return;
		case ZNotationEcorePackage.ZNOTATION_MODEL__MODEL_NAME:
			setModelName((String) newValue);
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
		case ZNotationEcorePackage.ZNOTATION_MODEL__SCHEMA:
			getSchema().clear();
			return;
		case ZNotationEcorePackage.ZNOTATION_MODEL__MODEL_NAME:
			setModelName(MODEL_NAME_EDEFAULT);
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
		case ZNotationEcorePackage.ZNOTATION_MODEL__SCHEMA:
			return schema != null && !schema.isEmpty();
		case ZNotationEcorePackage.ZNOTATION_MODEL__MODEL_NAME:
			return MODEL_NAME_EDEFAULT == null ? modelName != null : !MODEL_NAME_EDEFAULT.equals(modelName);
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
		result.append(" (ModelName: ");
		result.append(modelName);
		result.append(')');
		return result.toString();
	}

} //ZNotationModelImpl
