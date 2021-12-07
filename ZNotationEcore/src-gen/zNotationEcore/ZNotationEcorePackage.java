/**
 */
package zNotationEcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see zNotationEcore.ZNotationEcoreFactory
 * @model kind="package"
 * @generated
 */
public interface ZNotationEcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "zNotationEcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///zNotationEcore.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zNotationEcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZNotationEcorePackage eINSTANCE = zNotationEcore.impl.ZNotationEcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link zNotationEcore.impl.ZNotationModelImpl <em>ZNotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zNotationEcore.impl.ZNotationModelImpl
	 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getZNotationModel()
	 * @generated
	 */
	int ZNOTATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNOTATION_MODEL__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNOTATION_MODEL__MODEL_NAME = 1;

	/**
	 * The number of structural features of the '<em>ZNotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNOTATION_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ZNotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZNOTATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zNotationEcore.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zNotationEcore.impl.SchemaImpl
	 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Schemastate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SCHEMASTATE = 0;

	/**
	 * The feature id for the '<em><b>Schema Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SCHEMA_TITLE = 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__RELATION = 2;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zNotationEcore.impl.SchemaStateImpl <em>Schema State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zNotationEcore.impl.SchemaStateImpl
	 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getSchemaState()
	 * @generated
	 */
	int SCHEMA_STATE = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_STATE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>State Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_STATE__STATE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Schema State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Schema State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zNotationEcore.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zNotationEcore.impl.VariableImpl
	 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link zNotationEcore.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see zNotationEcore.impl.RelationImpl
	 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RELATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__RELATED_TO = 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link zNotationEcore.ZNotationModel <em>ZNotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZNotation Model</em>'.
	 * @see zNotationEcore.ZNotationModel
	 * @generated
	 */
	EClass getZNotationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link zNotationEcore.ZNotationModel#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see zNotationEcore.ZNotationModel#getSchema()
	 * @see #getZNotationModel()
	 * @generated
	 */
	EReference getZNotationModel_Schema();

	/**
	 * Returns the meta object for the attribute '{@link zNotationEcore.ZNotationModel#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see zNotationEcore.ZNotationModel#getModelName()
	 * @see #getZNotationModel()
	 * @generated
	 */
	EAttribute getZNotationModel_ModelName();

	/**
	 * Returns the meta object for class '{@link zNotationEcore.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see zNotationEcore.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the reference '{@link zNotationEcore.Schema#getSchemastate <em>Schemastate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schemastate</em>'.
	 * @see zNotationEcore.Schema#getSchemastate()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Schemastate();

	/**
	 * Returns the meta object for the attribute '{@link zNotationEcore.Schema#getSchemaTitle <em>Schema Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Title</em>'.
	 * @see zNotationEcore.Schema#getSchemaTitle()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_SchemaTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link zNotationEcore.Schema#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see zNotationEcore.Schema#getRelation()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Relation();

	/**
	 * Returns the meta object for class '{@link zNotationEcore.SchemaState <em>Schema State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema State</em>'.
	 * @see zNotationEcore.SchemaState
	 * @generated
	 */
	EClass getSchemaState();

	/**
	 * Returns the meta object for the containment reference list '{@link zNotationEcore.SchemaState#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see zNotationEcore.SchemaState#getVariable()
	 * @see #getSchemaState()
	 * @generated
	 */
	EReference getSchemaState_Variable();

	/**
	 * Returns the meta object for the attribute '{@link zNotationEcore.SchemaState#getStateType <em>State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Type</em>'.
	 * @see zNotationEcore.SchemaState#getStateType()
	 * @see #getSchemaState()
	 * @generated
	 */
	EAttribute getSchemaState_StateType();

	/**
	 * Returns the meta object for class '{@link zNotationEcore.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see zNotationEcore.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link zNotationEcore.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see zNotationEcore.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link zNotationEcore.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see zNotationEcore.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link zNotationEcore.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see zNotationEcore.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for class '{@link zNotationEcore.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see zNotationEcore.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the attribute '{@link zNotationEcore.Relation#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relation Type</em>'.
	 * @see zNotationEcore.Relation#getRelationType()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_RelationType();

	/**
	 * Returns the meta object for the attribute '{@link zNotationEcore.Relation#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Related To</em>'.
	 * @see zNotationEcore.Relation#getRelatedTo()
	 * @see #getRelation()
	 * @generated
	 */
	EAttribute getRelation_RelatedTo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ZNotationEcoreFactory getZNotationEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link zNotationEcore.impl.ZNotationModelImpl <em>ZNotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zNotationEcore.impl.ZNotationModelImpl
		 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getZNotationModel()
		 * @generated
		 */
		EClass ZNOTATION_MODEL = eINSTANCE.getZNotationModel();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZNOTATION_MODEL__SCHEMA = eINSTANCE.getZNotationModel_Schema();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZNOTATION_MODEL__MODEL_NAME = eINSTANCE.getZNotationModel_ModelName();

		/**
		 * The meta object literal for the '{@link zNotationEcore.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zNotationEcore.impl.SchemaImpl
		 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Schemastate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__SCHEMASTATE = eINSTANCE.getSchema_Schemastate();

		/**
		 * The meta object literal for the '<em><b>Schema Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__SCHEMA_TITLE = eINSTANCE.getSchema_SchemaTitle();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__RELATION = eINSTANCE.getSchema_Relation();

		/**
		 * The meta object literal for the '{@link zNotationEcore.impl.SchemaStateImpl <em>Schema State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zNotationEcore.impl.SchemaStateImpl
		 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getSchemaState()
		 * @generated
		 */
		EClass SCHEMA_STATE = eINSTANCE.getSchemaState();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA_STATE__VARIABLE = eINSTANCE.getSchemaState_Variable();

		/**
		 * The meta object literal for the '<em><b>State Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA_STATE__STATE_TYPE = eINSTANCE.getSchemaState_StateType();

		/**
		 * The meta object literal for the '{@link zNotationEcore.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zNotationEcore.impl.VariableImpl
		 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link zNotationEcore.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see zNotationEcore.impl.RelationImpl
		 * @see zNotationEcore.impl.ZNotationEcorePackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__RELATION_TYPE = eINSTANCE.getRelation_RelationType();

		/**
		 * The meta object literal for the '<em><b>Related To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION__RELATED_TO = eINSTANCE.getRelation_RelatedTo();

	}

} //ZNotationEcorePackage
