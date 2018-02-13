/**
 */
package ecoreModelProject.impl;

import ecoreModelProject.BinaryOp;
import ecoreModelProject.EcoreModelProjectPackage;
import ecoreModelProject.Search;
import ecoreModelProject.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ecoreModelProject.impl.SearchImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link ecoreModelProject.impl.SearchImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchImpl extends MinimalEObjectImpl.Container implements Search {
	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specifications;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<BinaryOp> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcoreModelProjectPackage.Literals.SEARCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectContainmentEList<Specification>(Specification.class, this,
					EcoreModelProjectPackage.SEARCH__SPECIFICATIONS);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BinaryOp> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<BinaryOp>(BinaryOp.class, this,
					EcoreModelProjectPackage.SEARCH__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EcoreModelProjectPackage.SEARCH__SPECIFICATIONS:
			return ((InternalEList<?>) getSpecifications()).basicRemove(otherEnd, msgs);
		case EcoreModelProjectPackage.SEARCH__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
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
		case EcoreModelProjectPackage.SEARCH__SPECIFICATIONS:
			return getSpecifications();
		case EcoreModelProjectPackage.SEARCH__OPERATIONS:
			return getOperations();
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
		case EcoreModelProjectPackage.SEARCH__SPECIFICATIONS:
			getSpecifications().clear();
			getSpecifications().addAll((Collection<? extends Specification>) newValue);
			return;
		case EcoreModelProjectPackage.SEARCH__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends BinaryOp>) newValue);
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
		case EcoreModelProjectPackage.SEARCH__SPECIFICATIONS:
			getSpecifications().clear();
			return;
		case EcoreModelProjectPackage.SEARCH__OPERATIONS:
			getOperations().clear();
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
		case EcoreModelProjectPackage.SEARCH__SPECIFICATIONS:
			return specifications != null && !specifications.isEmpty();
		case EcoreModelProjectPackage.SEARCH__OPERATIONS:
			return operations != null && !operations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchImpl
