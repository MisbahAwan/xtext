/**
 */
package zNotationEcore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import zNotationEcore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZNotationEcoreFactoryImpl extends EFactoryImpl implements ZNotationEcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZNotationEcoreFactory init() {
		try {
			ZNotationEcoreFactory theZNotationEcoreFactory = (ZNotationEcoreFactory) EPackage.Registry.INSTANCE
					.getEFactory(ZNotationEcorePackage.eNS_URI);
			if (theZNotationEcoreFactory != null) {
				return theZNotationEcoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZNotationEcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZNotationEcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ZNotationEcorePackage.ZNOTATION_MODEL:
			return createZNotationModel();
		case ZNotationEcorePackage.SCHEMA:
			return createSchema();
		case ZNotationEcorePackage.SCHEMA_STATE:
			return createSchemaState();
		case ZNotationEcorePackage.VARIABLE:
			return createVariable();
		case ZNotationEcorePackage.RELATION:
			return createRelation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZNotationModel createZNotationModel() {
		ZNotationModelImpl zNotationModel = new ZNotationModelImpl();
		return zNotationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaState createSchemaState() {
		SchemaStateImpl schemaState = new SchemaStateImpl();
		return schemaState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZNotationEcorePackage getZNotationEcorePackage() {
		return (ZNotationEcorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZNotationEcorePackage getPackage() {
		return ZNotationEcorePackage.eINSTANCE;
	}

} //ZNotationEcoreFactoryImpl
