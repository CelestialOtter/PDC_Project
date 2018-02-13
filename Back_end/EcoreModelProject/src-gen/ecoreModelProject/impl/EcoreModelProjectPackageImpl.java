/**
 */
package ecoreModelProject.impl;

import ecoreModelProject.And;
import ecoreModelProject.BinaryOp;
import ecoreModelProject.EcoreModelProjectFactory;
import ecoreModelProject.EcoreModelProjectPackage;
import ecoreModelProject.Or;
import ecoreModelProject.Restaurant;
import ecoreModelProject.Specifications;
import ecoreModelProject.SpecificationsGrammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreModelProjectPackageImpl extends EPackageImpl implements EcoreModelProjectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationsGrammarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaurantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ecoreModelProject.EcoreModelProjectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcoreModelProjectPackageImpl() {
		super(eNS_URI, EcoreModelProjectFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcoreModelProjectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcoreModelProjectPackage init() {
		if (isInited)
			return (EcoreModelProjectPackage) EPackage.Registry.INSTANCE.getEPackage(EcoreModelProjectPackage.eNS_URI);

		// Obtain or create and register package
		EcoreModelProjectPackageImpl theEcoreModelProjectPackage = (EcoreModelProjectPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof EcoreModelProjectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new EcoreModelProjectPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEcoreModelProjectPackage.createPackageContents();

		// Initialize created meta-data
		theEcoreModelProjectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcoreModelProjectPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcoreModelProjectPackage.eNS_URI, theEcoreModelProjectPackage);
		return theEcoreModelProjectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationsGrammar() {
		return specificationsGrammarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryOp() {
		return binaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOp_Specificationsgrammar() {
		return (EReference) binaryOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryOp_Specifications() {
		return (EReference) binaryOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecifications() {
		return specificationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecifications_Specificationsgrammar() {
		return (EReference) specificationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecifications_Name() {
		return (EAttribute) specificationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecifications_Arguments() {
		return (EAttribute) specificationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecifications_Binaryop() {
		return (EReference) specificationsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestaurant() {
		return restaurantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreModelProjectFactory getEcoreModelProjectFactory() {
		return (EcoreModelProjectFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		specificationsGrammarEClass = createEClass(SPECIFICATIONS_GRAMMAR);

		binaryOpEClass = createEClass(BINARY_OP);
		createEReference(binaryOpEClass, BINARY_OP__SPECIFICATIONSGRAMMAR);
		createEReference(binaryOpEClass, BINARY_OP__SPECIFICATIONS);

		specificationsEClass = createEClass(SPECIFICATIONS);
		createEReference(specificationsEClass, SPECIFICATIONS__SPECIFICATIONSGRAMMAR);
		createEAttribute(specificationsEClass, SPECIFICATIONS__NAME);
		createEAttribute(specificationsEClass, SPECIFICATIONS__ARGUMENTS);
		createEReference(specificationsEClass, SPECIFICATIONS__BINARYOP);

		restaurantEClass = createEClass(RESTAURANT);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		restaurantEClass.getESuperTypes().add(this.getSpecifications());
		andEClass.getESuperTypes().add(this.getBinaryOp());
		orEClass.getESuperTypes().add(this.getBinaryOp());

		// Initialize classes, features, and operations; add parameters
		initEClass(specificationsGrammarEClass, SpecificationsGrammar.class, "SpecificationsGrammar", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryOpEClass, BinaryOp.class, "BinaryOp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryOp_Specificationsgrammar(), this.getSpecificationsGrammar(), null,
				"specificationsgrammar", null, 0, 1, BinaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryOp_Specifications(), this.getSpecifications(), this.getSpecifications_Binaryop(),
				"specifications", null, 2, 2, BinaryOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationsEClass, Specifications.class, "Specifications", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecifications_Specificationsgrammar(), this.getSpecificationsGrammar(), null,
				"specificationsgrammar", null, 0, 1, Specifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecifications_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specifications.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecifications_Arguments(), ecorePackage.getEString(), "arguments", null, 0, 1,
				Specifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getSpecifications_Binaryop(), this.getBinaryOp(), this.getBinaryOp_Specifications(), "binaryop",
				null, 0, 1, Specifications.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restaurantEClass, Restaurant.class, "Restaurant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EcoreModelProjectPackageImpl
