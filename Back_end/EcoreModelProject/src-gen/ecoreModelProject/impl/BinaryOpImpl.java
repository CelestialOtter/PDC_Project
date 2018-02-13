/**
 */
package ecoreModelProject.impl;

import ecoreModelProject.BinaryOp;
import ecoreModelProject.EcoreModelProjectPackage;
import ecoreModelProject.Specification;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreModelProject.impl.BinaryOpImpl#getRightSpecification <em>Right Specification</em>}</li>
 *   <li>{@link ecoreModelProject.impl.BinaryOpImpl#getLeftSpecification <em>Left Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryOpImpl extends MinimalEObjectImpl.Container implements BinaryOp {
	/**
	 * The cached value of the '{@link #getRightSpecification() <em>Right Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification rightSpecification;

	/**
	 * The cached value of the '{@link #getLeftSpecification() <em>Left Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification leftSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreModelProjectPackage.Literals.BINARY_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getRightSpecification() {
		if (rightSpecification != null && rightSpecification.eIsProxy()) {
			InternalEObject oldRightSpecification = (InternalEObject) rightSpecification;
			rightSpecification = (Specification) eResolveProxy(oldRightSpecification);
			if (rightSpecification != oldRightSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreModelProjectPackage.BINARY_OP__RIGHT_SPECIFICATION, oldRightSpecification,
							rightSpecification));
			}
		}
		return rightSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetRightSpecification() {
		return rightSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSpecification(Specification newRightSpecification) {
		Specification oldRightSpecification = rightSpecification;
		rightSpecification = newRightSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcoreModelProjectPackage.BINARY_OP__RIGHT_SPECIFICATION, oldRightSpecification,
					rightSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getLeftSpecification() {
		if (leftSpecification != null && leftSpecification.eIsProxy()) {
			InternalEObject oldLeftSpecification = (InternalEObject) leftSpecification;
			leftSpecification = (Specification) eResolveProxy(oldLeftSpecification);
			if (leftSpecification != oldLeftSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreModelProjectPackage.BINARY_OP__LEFT_SPECIFICATION, oldLeftSpecification,
							leftSpecification));
			}
		}
		return leftSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetLeftSpecification() {
		return leftSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSpecification(Specification newLeftSpecification) {
		Specification oldLeftSpecification = leftSpecification;
		leftSpecification = newLeftSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcoreModelProjectPackage.BINARY_OP__LEFT_SPECIFICATION, oldLeftSpecification, leftSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EcoreModelProjectPackage.BINARY_OP__RIGHT_SPECIFICATION:
			if (resolve)
				return getRightSpecification();
			return basicGetRightSpecification();
		case EcoreModelProjectPackage.BINARY_OP__LEFT_SPECIFICATION:
			if (resolve)
				return getLeftSpecification();
			return basicGetLeftSpecification();
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
		case EcoreModelProjectPackage.BINARY_OP__RIGHT_SPECIFICATION:
			setRightSpecification((Specification) newValue);
			return;
		case EcoreModelProjectPackage.BINARY_OP__LEFT_SPECIFICATION:
			setLeftSpecification((Specification) newValue);
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
		case EcoreModelProjectPackage.BINARY_OP__RIGHT_SPECIFICATION:
			setRightSpecification((Specification) null);
			return;
		case EcoreModelProjectPackage.BINARY_OP__LEFT_SPECIFICATION:
			setLeftSpecification((Specification) null);
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
		case EcoreModelProjectPackage.BINARY_OP__RIGHT_SPECIFICATION:
			return rightSpecification != null;
		case EcoreModelProjectPackage.BINARY_OP__LEFT_SPECIFICATION:
			return leftSpecification != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryOpImpl
