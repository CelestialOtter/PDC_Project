/**
 */
package ecoreModelProject.impl;

import ecoreModelProject.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcoreModelProjectFactoryImpl extends EFactoryImpl implements EcoreModelProjectFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcoreModelProjectFactory init() {
		try {
			EcoreModelProjectFactory theEcoreModelProjectFactory = (EcoreModelProjectFactory) EPackage.Registry.INSTANCE
					.getEFactory(EcoreModelProjectPackage.eNS_URI);
			if (theEcoreModelProjectFactory != null) {
				return theEcoreModelProjectFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcoreModelProjectFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreModelProjectFactoryImpl() {
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
		case EcoreModelProjectPackage.SPECIFICATIONS_GRAMMAR:
			return createSpecificationsGrammar();
		case EcoreModelProjectPackage.BINARY_OP:
			return createBinaryOp();
		case EcoreModelProjectPackage.SPECIFICATIONS:
			return createSpecifications();
		case EcoreModelProjectPackage.RESTAURANT:
			return createRestaurant();
		case EcoreModelProjectPackage.AND:
			return createAnd();
		case EcoreModelProjectPackage.OR:
			return createOr();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationsGrammar createSpecificationsGrammar() {
		SpecificationsGrammarImpl specificationsGrammar = new SpecificationsGrammarImpl();
		return specificationsGrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOp createBinaryOp() {
		BinaryOpImpl binaryOp = new BinaryOpImpl();
		return binaryOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specifications createSpecifications() {
		SpecificationsImpl specifications = new SpecificationsImpl();
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant createRestaurant() {
		RestaurantImpl restaurant = new RestaurantImpl();
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcoreModelProjectPackage getEcoreModelProjectPackage() {
		return (EcoreModelProjectPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcoreModelProjectPackage getPackage() {
		return EcoreModelProjectPackage.eINSTANCE;
	}

} //EcoreModelProjectFactoryImpl
