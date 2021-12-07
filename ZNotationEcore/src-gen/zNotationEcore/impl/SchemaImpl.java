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
import zNotationEcore.Relation;
import zNotationEcore.Schema;
import zNotationEcore.SchemaState;
import zNotationEcore.ZNotationEcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link zNotationEcore.impl.SchemaImpl#getSchemastate <em>Schemastate</em>}</li>
 *   <li>{@link zNotationEcore.impl.SchemaImpl#getSchemaTitle <em>Schema Title</em>}</li>
 *   <li>{@link zNotationEcore.impl.SchemaImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
	/**
	 * The cached value of the '{@link #getSchemastate() <em>Schemastate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemastate()
	 * @generated
	 * @ordered
	 */
	protected SchemaState schemastate;

	/**
	 * The default value of the '{@link #getSchemaTitle() <em>Schema Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaTitle() <em>Schema Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaTitle()
	 * @generated
	 * @ordered
	 */
	protected String schemaTitle = SCHEMA_TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZNotationEcorePackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaState getSchemastate() {
		if (schemastate != null && schemastate.eIsProxy()) {
			InternalEObject oldSchemastate = (InternalEObject) schemastate;
			schemastate = (SchemaState) eResolveProxy(oldSchemastate);
			if (schemastate != oldSchemastate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZNotationEcorePackage.SCHEMA__SCHEMASTATE,
							oldSchemastate, schemastate));
			}
		}
		return schemastate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaState basicGetSchemastate() {
		return schemastate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemastate(SchemaState newSchemastate) {
		SchemaState oldSchemastate = schemastate;
		schemastate = newSchemastate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZNotationEcorePackage.SCHEMA__SCHEMASTATE,
					oldSchemastate, schemastate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaTitle() {
		return schemaTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaTitle(String newSchemaTitle) {
		String oldSchemaTitle = schemaTitle;
		schemaTitle = newSchemaTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZNotationEcorePackage.SCHEMA__SCHEMA_TITLE,
					oldSchemaTitle, schemaTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<Relation>(Relation.class, this,
					ZNotationEcorePackage.SCHEMA__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ZNotationEcorePackage.SCHEMA__RELATION:
			return ((InternalEList<?>) getRelation()).basicRemove(otherEnd, msgs);
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
		case ZNotationEcorePackage.SCHEMA__SCHEMASTATE:
			if (resolve)
				return getSchemastate();
			return basicGetSchemastate();
		case ZNotationEcorePackage.SCHEMA__SCHEMA_TITLE:
			return getSchemaTitle();
		case ZNotationEcorePackage.SCHEMA__RELATION:
			return getRelation();
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
		case ZNotationEcorePackage.SCHEMA__SCHEMASTATE:
			setSchemastate((SchemaState) newValue);
			return;
		case ZNotationEcorePackage.SCHEMA__SCHEMA_TITLE:
			setSchemaTitle((String) newValue);
			return;
		case ZNotationEcorePackage.SCHEMA__RELATION:
			getRelation().clear();
			getRelation().addAll((Collection<? extends Relation>) newValue);
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
		case ZNotationEcorePackage.SCHEMA__SCHEMASTATE:
			setSchemastate((SchemaState) null);
			return;
		case ZNotationEcorePackage.SCHEMA__SCHEMA_TITLE:
			setSchemaTitle(SCHEMA_TITLE_EDEFAULT);
			return;
		case ZNotationEcorePackage.SCHEMA__RELATION:
			getRelation().clear();
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
		case ZNotationEcorePackage.SCHEMA__SCHEMASTATE:
			return schemastate != null;
		case ZNotationEcorePackage.SCHEMA__SCHEMA_TITLE:
			return SCHEMA_TITLE_EDEFAULT == null ? schemaTitle != null : !SCHEMA_TITLE_EDEFAULT.equals(schemaTitle);
		case ZNotationEcorePackage.SCHEMA__RELATION:
			return relation != null && !relation.isEmpty();
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
		result.append(" (SchemaTitle: ");
		result.append(schemaTitle);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
