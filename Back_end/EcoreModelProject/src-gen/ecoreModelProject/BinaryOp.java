/**
 */
package ecoreModelProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Op</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreModelProject.BinaryOp#getRightSpecification <em>Right Specification</em>}</li>
 *   <li>{@link ecoreModelProject.BinaryOp#getLeftSpecification <em>Left Specification</em>}</li>
 * </ul>
 *
 * @see ecoreModelProject.EcoreModelProjectPackage#getBinaryOp()
 * @model
 * @generated
 */
public interface BinaryOp extends EObject {
	/**
	 * Returns the value of the '<em><b>Right Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Specification</em>' reference.
	 * @see #setRightSpecification(Specification)
	 * @see ecoreModelProject.EcoreModelProjectPackage#getBinaryOp_RightSpecification()
	 * @model
	 * @generated
	 */
	Specification getRightSpecification();

	/**
	 * Sets the value of the '{@link ecoreModelProject.BinaryOp#getRightSpecification <em>Right Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Specification</em>' reference.
	 * @see #getRightSpecification()
	 * @generated
	 */
	void setRightSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Left Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Specification</em>' reference.
	 * @see #setLeftSpecification(Specification)
	 * @see ecoreModelProject.EcoreModelProjectPackage#getBinaryOp_LeftSpecification()
	 * @model
	 * @generated
	 */
	Specification getLeftSpecification();

	/**
	 * Sets the value of the '{@link ecoreModelProject.BinaryOp#getLeftSpecification <em>Left Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Specification</em>' reference.
	 * @see #getLeftSpecification()
	 * @generated
	 */
	void setLeftSpecification(Specification value);

} // BinaryOp
