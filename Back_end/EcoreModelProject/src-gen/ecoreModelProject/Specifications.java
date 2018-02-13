/**
 */
package ecoreModelProject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ecoreModelProject.Specifications#getSpecificationsgrammar <em>Specificationsgrammar</em>}</li>
 *   <li>{@link ecoreModelProject.Specifications#getName <em>Name</em>}</li>
 *   <li>{@link ecoreModelProject.Specifications#getArguments <em>Arguments</em>}</li>
 *   <li>{@link ecoreModelProject.Specifications#getBinaryop <em>Binaryop</em>}</li>
 * </ul>
 *
 * @see ecoreModelProject.EcoreModelProjectPackage#getSpecifications()
 * @model
 * @generated
 */
public interface Specifications extends EObject {
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
	 * @see ecoreModelProject.EcoreModelProjectPackage#getSpecifications_Specificationsgrammar()
	 * @model
	 * @generated
	 */
	SpecificationsGrammar getSpecificationsgrammar();

	/**
	 * Sets the value of the '{@link ecoreModelProject.Specifications#getSpecificationsgrammar <em>Specificationsgrammar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specificationsgrammar</em>' reference.
	 * @see #getSpecificationsgrammar()
	 * @generated
	 */
	void setSpecificationsgrammar(SpecificationsGrammar value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ecoreModelProject.EcoreModelProjectPackage#getSpecifications_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ecoreModelProject.Specifications#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute.
	 * @see #setArguments(String)
	 * @see ecoreModelProject.EcoreModelProjectPackage#getSpecifications_Arguments()
	 * @model
	 * @generated
	 */
	String getArguments();

	/**
	 * Sets the value of the '{@link ecoreModelProject.Specifications#getArguments <em>Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' attribute.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(String value);

	/**
	 * Returns the value of the '<em><b>Binaryop</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ecoreModelProject.BinaryOp#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binaryop</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binaryop</em>' reference.
	 * @see #setBinaryop(BinaryOp)
	 * @see ecoreModelProject.EcoreModelProjectPackage#getSpecifications_Binaryop()
	 * @see ecoreModelProject.BinaryOp#getSpecifications
	 * @model opposite="specifications"
	 * @generated
	 */
	BinaryOp getBinaryop();

	/**
	 * Sets the value of the '{@link ecoreModelProject.Specifications#getBinaryop <em>Binaryop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binaryop</em>' reference.
	 * @see #getBinaryop()
	 * @generated
	 */
	void setBinaryop(BinaryOp value);

} // Specifications
