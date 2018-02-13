/**
 */
package ecoreModelProject;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link ecoreModelProject.BinaryOp#getSpecificationsgrammar <em>Specificationsgrammar</em>}</li>
 *   <li>{@link ecoreModelProject.BinaryOp#getSpecifications <em>Specifications</em>}</li>
 * </ul>
 *
 * @see ecoreModelProject.EcoreModelProjectPackage#getBinaryOp()
 * @model
 * @generated
 */
public interface BinaryOp extends EObject {
	/**
	 * Returns the value of the '<em><b>Specificationsgrammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specificationsgrammar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specificationsgrammar</em>' reference.
	 * @see #setSpecificationsgrammar(SpecificationsGrammar)
	 * @see ecoreModelProject.EcoreModelProjectPackage#getBinaryOp_Specificationsgrammar()
	 * @model
	 * @generated
	 */
	SpecificationsGrammar getSpecificationsgrammar();

	/**
	 * Sets the value of the '{@link ecoreModelProject.BinaryOp#getSpecificationsgrammar <em>Specificationsgrammar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specificationsgrammar</em>' reference.
	 * @see #getSpecificationsgrammar()
	 * @generated
	 */
	void setSpecificationsgrammar(SpecificationsGrammar value);

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' reference list.
	 * The list contents are of type {@link ecoreModelProject.Specifications}.
	 * It is bidirectional and its opposite is '{@link ecoreModelProject.Specifications#getBinaryop <em>Binaryop</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' reference list.
	 * @see ecoreModelProject.EcoreModelProjectPackage#getBinaryOp_Specifications()
	 * @see ecoreModelProject.Specifications#getBinaryop
	 * @model opposite="binaryop" lower="2" upper="2"
	 * @generated
	 */
	EList<Specifications> getSpecifications();

} // BinaryOp
