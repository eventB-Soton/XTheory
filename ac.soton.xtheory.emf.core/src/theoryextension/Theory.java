/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.Theory#getImports <em>Imports</em>}</li>
 *   <li>{@link theoryextension.Theory#getParameters <em>Parameters</em>}</li>
 *   <li>{@link theoryextension.Theory#getRuleBlocks <em>Rule Blocks</em>}</li>
 *   <li>{@link theoryextension.Theory#getInternalElements <em>Internal Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getTheory()
 * @model
 * @generated
 */
public interface Theory extends EventBNamed, EventBObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_Parameters()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Rule Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.RuleBlock}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Blocks</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_RuleBlocks()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<RuleBlock> getRuleBlocks();

	/**
	 * Returns the value of the '<em><b>Internal Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eventb.emf.core.EventBNamed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Elements</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getTheory_InternalElements()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<EventBNamed> getInternalElements();

} // Theory
