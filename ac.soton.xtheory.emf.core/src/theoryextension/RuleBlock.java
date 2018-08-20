/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension;

import org.eclipse.emf.common.util.EList;
import org.eventb.emf.core.EventBObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link theoryextension.RuleBlock#getRules <em>Rules</em>}</li>
 *   <li>{@link theoryextension.RuleBlock#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see theoryextension.TheoryextensionPackage#getRuleBlock()
 * @model
 * @generated
 */
public interface RuleBlock extends EventBObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getRuleBlock_Rules()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link theoryextension.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see theoryextension.TheoryextensionPackage#getRuleBlock_Variables()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // RuleBlock
