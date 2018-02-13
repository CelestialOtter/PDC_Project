/**
 */
package ecoreModelProject;

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
 * @see ecoreModelProject.EcoreModelProjectFactory
 * @model kind="package"
 * @generated
 */
public interface EcoreModelProjectPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecoreModelProject";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ecoreModelProject";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecoreModelProject";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcoreModelProjectPackage eINSTANCE = ecoreModelProject.impl.EcoreModelProjectPackageImpl.init();

	/**
	 * The meta object id for the '{@link ecoreModelProject.impl.SpecificationsGrammarImpl <em>Specifications Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreModelProject.impl.SpecificationsGrammarImpl
	 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getSpecificationsGrammar()
	 * @generated
	 */
	int SPECIFICATIONS_GRAMMAR = 0;

	/**
	 * The number of structural features of the '<em>Specifications Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS_GRAMMAR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Specifications Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS_GRAMMAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreModelProject.impl.BinaryOpImpl <em>Binary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreModelProject.impl.BinaryOpImpl
	 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getBinaryOp()
	 * @generated
	 */
	int BINARY_OP = 1;

	/**
	 * The feature id for the '<em><b>Specificationsgrammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP__SPECIFICATIONSGRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP__SPECIFICATIONS = 1;

	/**
	 * The number of structural features of the '<em>Binary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreModelProject.impl.SpecificationsImpl <em>Specifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreModelProject.impl.SpecificationsImpl
	 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getSpecifications()
	 * @generated
	 */
	int SPECIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Specificationsgrammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS__SPECIFICATIONSGRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS__ARGUMENTS = 2;

	/**
	 * The feature id for the '<em><b>Binaryop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS__BINARYOP = 3;

	/**
	 * The number of structural features of the '<em>Specifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ecoreModelProject.impl.RestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreModelProject.impl.RestaurantImpl
	 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getRestaurant()
	 * @generated
	 */
	int RESTAURANT = 3;

	/**
	 * The feature id for the '<em><b>Specificationsgrammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__SPECIFICATIONSGRAMMAR = SPECIFICATIONS__SPECIFICATIONSGRAMMAR;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NAME = SPECIFICATIONS__NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__ARGUMENTS = SPECIFICATIONS__ARGUMENTS;

	/**
	 * The feature id for the '<em><b>Binaryop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__BINARYOP = SPECIFICATIONS__BINARYOP;

	/**
	 * The number of structural features of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_FEATURE_COUNT = SPECIFICATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_OPERATION_COUNT = SPECIFICATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreModelProject.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreModelProject.impl.AndImpl
	 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 4;

	/**
	 * The feature id for the '<em><b>Specificationsgrammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SPECIFICATIONSGRAMMAR = BINARY_OP__SPECIFICATIONSGRAMMAR;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__SPECIFICATIONS = BINARY_OP__SPECIFICATIONS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ecoreModelProject.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ecoreModelProject.impl.OrImpl
	 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getOr()
	 * @generated
	 */
	int OR = 5;

	/**
	 * The feature id for the '<em><b>Specificationsgrammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__SPECIFICATIONSGRAMMAR = BINARY_OP__SPECIFICATIONSGRAMMAR;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__SPECIFICATIONS = BINARY_OP__SPECIFICATIONS;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BINARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BINARY_OP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ecoreModelProject.SpecificationsGrammar <em>Specifications Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specifications Grammar</em>'.
	 * @see ecoreModelProject.SpecificationsGrammar
	 * @generated
	 */
	EClass getSpecificationsGrammar();

	/**
	 * Returns the meta object for class '{@link ecoreModelProject.BinaryOp <em>Binary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Op</em>'.
	 * @see ecoreModelProject.BinaryOp
	 * @generated
	 */
	EClass getBinaryOp();

	/**
	 * Returns the meta object for the reference '{@link ecoreModelProject.BinaryOp#getSpecificationsgrammar <em>Specificationsgrammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specificationsgrammar</em>'.
	 * @see ecoreModelProject.BinaryOp#getSpecificationsgrammar()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_Specificationsgrammar();

	/**
	 * Returns the meta object for the reference list '{@link ecoreModelProject.BinaryOp#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifications</em>'.
	 * @see ecoreModelProject.BinaryOp#getSpecifications()
	 * @see #getBinaryOp()
	 * @generated
	 */
	EReference getBinaryOp_Specifications();

	/**
	 * Returns the meta object for class '{@link ecoreModelProject.Specifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specifications</em>'.
	 * @see ecoreModelProject.Specifications
	 * @generated
	 */
	EClass getSpecifications();

	/**
	 * Returns the meta object for the reference '{@link ecoreModelProject.Specifications#getSpecificationsgrammar <em>Specificationsgrammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specificationsgrammar</em>'.
	 * @see ecoreModelProject.Specifications#getSpecificationsgrammar()
	 * @see #getSpecifications()
	 * @generated
	 */
	EReference getSpecifications_Specificationsgrammar();

	/**
	 * Returns the meta object for the attribute '{@link ecoreModelProject.Specifications#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ecoreModelProject.Specifications#getName()
	 * @see #getSpecifications()
	 * @generated
	 */
	EAttribute getSpecifications_Name();

	/**
	 * Returns the meta object for the attribute '{@link ecoreModelProject.Specifications#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arguments</em>'.
	 * @see ecoreModelProject.Specifications#getArguments()
	 * @see #getSpecifications()
	 * @generated
	 */
	EAttribute getSpecifications_Arguments();

	/**
	 * Returns the meta object for the reference '{@link ecoreModelProject.Specifications#getBinaryop <em>Binaryop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binaryop</em>'.
	 * @see ecoreModelProject.Specifications#getBinaryop()
	 * @see #getSpecifications()
	 * @generated
	 */
	EReference getSpecifications_Binaryop();

	/**
	 * Returns the meta object for class '{@link ecoreModelProject.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see ecoreModelProject.Restaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the meta object for class '{@link ecoreModelProject.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see ecoreModelProject.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link ecoreModelProject.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see ecoreModelProject.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcoreModelProjectFactory getEcoreModelProjectFactory();

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
		 * The meta object literal for the '{@link ecoreModelProject.impl.SpecificationsGrammarImpl <em>Specifications Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreModelProject.impl.SpecificationsGrammarImpl
		 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getSpecificationsGrammar()
		 * @generated
		 */
		EClass SPECIFICATIONS_GRAMMAR = eINSTANCE.getSpecificationsGrammar();

		/**
		 * The meta object literal for the '{@link ecoreModelProject.impl.BinaryOpImpl <em>Binary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreModelProject.impl.BinaryOpImpl
		 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getBinaryOp()
		 * @generated
		 */
		EClass BINARY_OP = eINSTANCE.getBinaryOp();

		/**
		 * The meta object literal for the '<em><b>Specificationsgrammar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OP__SPECIFICATIONSGRAMMAR = eINSTANCE.getBinaryOp_Specificationsgrammar();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OP__SPECIFICATIONS = eINSTANCE.getBinaryOp_Specifications();

		/**
		 * The meta object literal for the '{@link ecoreModelProject.impl.SpecificationsImpl <em>Specifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreModelProject.impl.SpecificationsImpl
		 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getSpecifications()
		 * @generated
		 */
		EClass SPECIFICATIONS = eINSTANCE.getSpecifications();

		/**
		 * The meta object literal for the '<em><b>Specificationsgrammar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATIONS__SPECIFICATIONSGRAMMAR = eINSTANCE.getSpecifications_Specificationsgrammar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATIONS__NAME = eINSTANCE.getSpecifications_Name();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATIONS__ARGUMENTS = eINSTANCE.getSpecifications_Arguments();

		/**
		 * The meta object literal for the '<em><b>Binaryop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATIONS__BINARYOP = eINSTANCE.getSpecifications_Binaryop();

		/**
		 * The meta object literal for the '{@link ecoreModelProject.impl.RestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreModelProject.impl.RestaurantImpl
		 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getRestaurant()
		 * @generated
		 */
		EClass RESTAURANT = eINSTANCE.getRestaurant();

		/**
		 * The meta object literal for the '{@link ecoreModelProject.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreModelProject.impl.AndImpl
		 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link ecoreModelProject.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ecoreModelProject.impl.OrImpl
		 * @see ecoreModelProject.impl.EcoreModelProjectPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

	}

} //EcoreModelProjectPackage
