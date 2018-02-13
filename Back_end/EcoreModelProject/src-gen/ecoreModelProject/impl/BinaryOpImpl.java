/**
 */
package ecoreModelProject.impl;

import ecoreModelProject.BinaryOp;
import ecoreModelProject.EcoreModelProjectPackage;
import ecoreModelProject.Specifications;
import ecoreModelProject.SpecificationsGrammar;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreModelProject.impl.BinaryOpImpl#getSpecificationsgrammar <em>Specificationsgrammar</em>}</li>
 *   <li>{@link ecoreModelProject.impl.BinaryOpImpl#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryOpImpl extends MinimalEObjectImpl.Container implements BinaryOp {
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
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specifications> specifications;

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
	public SpecificationsGrammar getSpecificationsgrammar() {
		if (specificationsgrammar != null && specificationsgrammar.eIsProxy()) {
			InternalEObject oldSpecificationsgrammar = (InternalEObject) specificationsgrammar;
			specificationsgrammar = (SpecificationsGrammar) eResolveProxy(oldSpecificationsgrammar);
			if (specificationsgrammar != oldSpecificationsgrammar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONSGRAMMAR, oldSpecificationsgrammar,
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
					EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONSGRAMMAR, oldSpecificationsgrammar,
					specificationsgrammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specifications> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectWithInverseResolvingEList<Specifications>(Specifications.class, this,
					EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS,
					EcoreModelProjectPackage.SPECIFICATIONS__BINARYOP);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSpecifications()).basicAdd(otherEnd, msgs);
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
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS:
			return ((InternalEList<?>) getSpecifications()).basicRemove(otherEnd, msgs);
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
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONSGRAMMAR:
			if (resolve)
				return getSpecificationsgrammar();
			return basicGetSpecificationsgrammar();
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS:
			return getSpecifications();
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
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONSGRAMMAR:
			setSpecificationsgrammar((SpecificationsGrammar) newValue);
			return;
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS:
			getSpecifications().clear();
			getSpecifications().addAll((Collection<? extends Specifications>) newValue);
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
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONSGRAMMAR:
			setSpecificationsgrammar((SpecificationsGrammar) null);
			return;
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS:
			getSpecifications().clear();
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
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONSGRAMMAR:
			return specificationsgrammar != null;
		case EcoreModelProjectPackage.BINARY_OP__SPECIFICATIONS:
			return specifications != null && !specifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BinaryOpImpl
