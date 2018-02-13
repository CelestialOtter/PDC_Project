/**
 */
package ecoreModelProject.impl;

import ecoreModelProject.BinaryOp;
import ecoreModelProject.EcoreModelProjectPackage;
import ecoreModelProject.Specifications;
import ecoreModelProject.SpecificationsGrammar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreModelProject.impl.SpecificationsImpl#getSpecificationsgrammar <em>Specificationsgrammar</em>}</li>
 *   <li>{@link ecoreModelProject.impl.SpecificationsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ecoreModelProject.impl.SpecificationsImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ecoreModelProject.impl.SpecificationsImpl#getBinaryop <em>Binaryop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationsImpl extends MinimalEObjectImpl.Container implements Specifications {
	/**
	 * The cached value of the '{@link #getSpecificationsgrammar() <em>Specificationsgrammar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificationsgrammar()
	 * @generated
	 * @ordered
	 */
	protected SpecificationsGrammar specificationsgrammar;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArguments() <em>Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGUMENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected String arguments = ARGUMENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBinaryop() <em>Binaryop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryop()
	 * @generated
	 * @ordered
	 */
	protected BinaryOp binaryop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreModelProjectPackage.Literals.SPECIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationsGrammar getSpecificationsgrammar() {
		if (specificationsgrammar != null && specificationsgrammar.eIsProxy()) {
			InternalEObject oldSpecificationsgrammar = (InternalEObject) specificationsgrammar;
			specificationsgrammar = (SpecificationsGrammar) eResolveProxy(oldSpecificationsgrammar);
			if (specificationsgrammar != oldSpecificationsgrammar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreModelProjectPackage.SPECIFICATIONS__SPECIFICATIONSGRAMMAR, oldSpecificationsgrammar,
							specificationsgrammar));
			}
		}
		return specificationsgrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationsGrammar basicGetSpecificationsgrammar() {
		return specificationsgrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificationsgrammar(SpecificationsGrammar newSpecificationsgrammar) {
		SpecificationsGrammar oldSpecificationsgrammar = specificationsgrammar;
		specificationsgrammar = newSpecificationsgrammar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EcoreModelProjectPackage.SPECIFICATIONS__SPECIFICATIONSGRAMMAR, oldSpecificationsgrammar,
					specificationsgrammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreModelProjectPackage.SPECIFICATIONS__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArguments() {
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArguments(String newArguments) {
		String oldArguments = arguments;
		arguments = newArguments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreModelProjectPackage.SPECIFICATIONS__ARGUMENTS,
					oldArguments, arguments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOp getBinaryop() {
		if (binaryop != null && binaryop.eIsProxy()) {
			InternalEObject oldBinaryop = (InternalEObject) binaryop;
			binaryop = (BinaryOp) eResolveProxy(oldBinaryop);
			if (binaryop != oldBinaryop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP, oldBinaryop, binaryop));
			}
		}
		return binaryop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOp basicGetBinaryop() {
		return binaryop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryop(BinaryOp newBinaryop, NotificationChain msgs) {
		BinaryOp oldBinaryop = binaryop;
		binaryop = newBinaryop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP, oldBinaryop, newBinaryop);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryop(BinaryOp newBinaryop) {
		if (newBinaryop != binaryop) {
			NotificationChain msgs = null;
			if (binaryop != null)
				msgs = ((InternalEObject) binaryop).eInverseRemove(this,
						EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS, BinaryOp.class, msgs);
			if (newBinaryop != null)
				msgs = ((InternalEObject) newBinaryop).eInverseAdd(this,
						EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS, BinaryOp.class, msgs);
			msgs = basicSetBinaryop(newBinaryop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP,
					newBinaryop, newBinaryop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP:
			if (binaryop != null)
				msgs = ((InternalEObject) binaryop).eInverseRemove(this,
						EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS, BinaryOp.class, msgs);
			return basicSetBinaryop((BinaryOp) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP:
			return basicSetBinaryop(null, msgs);
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
		case EcoreModelProjectPackage.SPECIFICATIONS__SPECIFICATIONSGRAMMAR:
			if (resolve)
				return getSpecificationsgrammar();
			return basicGetSpecificationsgrammar();
		case EcoreModelProjectPackage.SPECIFICATIONS__NAME:
			return getName();
		case EcoreModelProjectPackage.SPECIFICATIONS__ARGUMENTS:
			return getArguments();
		case EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP:
			if (resolve)
				return getBinaryop();
			return basicGetBinaryop();
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
		case EcoreModelProjectPackage.SPECIFICATIONS__SPECIFICATIONSGRAMMAR:
			setSpecificationsgrammar((SpecificationsGrammar) newValue);
			return;
		case EcoreModelProjectPackage.SPECIFICATIONS__NAME:
			setName((String) newValue);
			return;
		case EcoreModelProjectPackage.SPECIFICATIONS__ARGUMENTS:
			setArguments((String) newValue);
			return;
		case EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP:
			setBinaryop((BinaryOp) newValue);
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
		case EcoreModelProjectPackage.SPECIFICATIONS__SPECIFICATIONSGRAMMAR:
			setSpecificationsgrammar((SpecificationsGrammar) null);
			return;
		case EcoreModelProjectPackage.SPECIFICATIONS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EcoreModelProjectPackage.SPECIFICATIONS__ARGUMENTS:
			setArguments(ARGUMENTS_EDEFAULT);
			return;
		case EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP:
			setBinaryop((BinaryOp) null);
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
		case EcoreModelProjectPackage.SPECIFICATIONS__SPECIFICATIONSGRAMMAR:
			return specificationsgrammar != null;
		case EcoreModelProjectPackage.SPECIFICATIONS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case EcoreModelProjectPackage.SPECIFICATIONS__ARGUMENTS:
			return ARGUMENTS_EDEFAULT == null ? arguments != null : !ARGUMENTS_EDEFAULT.equals(arguments);
		case EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP:
			return binaryop != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", arguments: ");
		result.append(arguments);
		result.append(')');
		return result.toString();
	}

} //SpecificationsImpl
