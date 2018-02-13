/**
 */
package ecoreModelProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreModelProject.Search#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link ecoreModelProject.Search#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see ecoreModelProject.EcoreModelProjectPackage#getSearch()
 * @model
 * @generated
 */
public interface Search extends EObject {
	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreModelProject.Specification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see ecoreModelProject.EcoreModelProjectPackage#getSearch_Specifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specification> getSpecifications();

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link ecoreModelProject.BinaryOp}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see ecoreModelProject.EcoreModelProjectPackage#getSearch_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BinaryOp> getOperations();

} // Search
