/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eventb.emf.core.impl.EventBObjectImpl;

import theoryextension.ConditionalRewrite;
import theoryextension.RewriteRule;
import theoryextension.TheoryextensionPackage;
import theoryextension.UnconditionalRewrite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rewrite Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#isIsCaseComplete <em>Is Case Complete</em>}</li>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}</li>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}</li>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#getUrule <em>Urule</em>}</li>
 *   <li>{@link theoryextension.impl.RewriteRuleImpl#getCrule <em>Crule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RewriteRuleImpl extends EventBObjectImpl implements RewriteRule {
	/**
	 * The default value of the '{@link #isIsCaseComplete() <em>Is Case Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCaseComplete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CASE_COMPLETE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCaseComplete() <em>Is Case Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCaseComplete()
	 * @generated
	 * @ordered
	 */
	protected boolean isCaseComplete = IS_CASE_COMPLETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplicabilityIsInteractive() <em>Applicability Is Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicabilityIsInteractive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABILITY_IS_INTERACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicabilityIsInteractive() <em>Applicability Is Interactive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicabilityIsInteractive()
	 * @generated
	 * @ordered
	 */
	protected boolean applicabilityIsInteractive = APPLICABILITY_IS_INTERACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isApplicabilityIsAutomatic() <em>Applicability Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicabilityIsAutomatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABILITY_IS_AUTOMATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplicabilityIsAutomatic() <em>Applicability Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicabilityIsAutomatic()
	 * @generated
	 * @ordered
	 */
	protected boolean applicabilityIsAutomatic = APPLICABILITY_IS_AUTOMATIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUrule() <em>Urule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrule()
	 * @generated
	 * @ordered
	 */
	protected UnconditionalRewrite urule;

	/**
	 * The cached value of the '{@link #getCrule() <em>Crule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrule()
	 * @generated
	 * @ordered
	 */
	protected ConditionalRewrite crule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RewriteRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.REWRITE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCaseComplete() {
		return isCaseComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCaseComplete(boolean newIsCaseComplete) {
		boolean oldIsCaseComplete = isCaseComplete;
		isCaseComplete = newIsCaseComplete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE, oldIsCaseComplete, isCaseComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicabilityIsInteractive() {
		return applicabilityIsInteractive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicabilityIsInteractive(boolean newApplicabilityIsInteractive) {
		boolean oldApplicabilityIsInteractive = applicabilityIsInteractive;
		applicabilityIsInteractive = newApplicabilityIsInteractive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE, oldApplicabilityIsInteractive, applicabilityIsInteractive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicabilityIsAutomatic() {
		return applicabilityIsAutomatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicabilityIsAutomatic(boolean newApplicabilityIsAutomatic) {
		boolean oldApplicabilityIsAutomatic = applicabilityIsAutomatic;
		applicabilityIsAutomatic = newApplicabilityIsAutomatic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC, oldApplicabilityIsAutomatic, applicabilityIsAutomatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconditionalRewrite getUrule() {
		if (urule != null && urule.eIsProxy()) {
			InternalEObject oldUrule = (InternalEObject)urule;
			urule = (UnconditionalRewrite)eResolveProxy(oldUrule);
			if (urule != oldUrule) {
				InternalEObject newUrule = (InternalEObject)urule;
				NotificationChain msgs = oldUrule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.REWRITE_RULE__URULE, null, null);
				if (newUrule.eInternalContainer() == null) {
					msgs = newUrule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.REWRITE_RULE__URULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TheoryextensionPackage.REWRITE_RULE__URULE, oldUrule, urule));
			}
		}
		return urule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconditionalRewrite basicGetUrule() {
		return urule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrule(UnconditionalRewrite newUrule, NotificationChain msgs) {
		UnconditionalRewrite oldUrule = urule;
		urule = newUrule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__URULE, oldUrule, newUrule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrule(UnconditionalRewrite newUrule) {
		if (newUrule != urule) {
			NotificationChain msgs = null;
			if (urule != null)
				msgs = ((InternalEObject)urule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.REWRITE_RULE__URULE, null, msgs);
			if (newUrule != null)
				msgs = ((InternalEObject)newUrule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.REWRITE_RULE__URULE, null, msgs);
			msgs = basicSetUrule(newUrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__URULE, newUrule, newUrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalRewrite getCrule() {
		if (crule != null && crule.eIsProxy()) {
			InternalEObject oldCrule = (InternalEObject)crule;
			crule = (ConditionalRewrite)eResolveProxy(oldCrule);
			if (crule != oldCrule) {
				InternalEObject newCrule = (InternalEObject)crule;
				NotificationChain msgs = oldCrule.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.REWRITE_RULE__CRULE, null, null);
				if (newCrule.eInternalContainer() == null) {
					msgs = newCrule.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.REWRITE_RULE__CRULE, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TheoryextensionPackage.REWRITE_RULE__CRULE, oldCrule, crule));
			}
		}
		return crule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalRewrite basicGetCrule() {
		return crule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrule(ConditionalRewrite newCrule, NotificationChain msgs) {
		ConditionalRewrite oldCrule = crule;
		crule = newCrule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__CRULE, oldCrule, newCrule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrule(ConditionalRewrite newCrule) {
		if (newCrule != crule) {
			NotificationChain msgs = null;
			if (crule != null)
				msgs = ((InternalEObject)crule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.REWRITE_RULE__CRULE, null, msgs);
			if (newCrule != null)
				msgs = ((InternalEObject)newCrule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.REWRITE_RULE__CRULE, null, msgs);
			msgs = basicSetCrule(newCrule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.REWRITE_RULE__CRULE, newCrule, newCrule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TheoryextensionPackage.REWRITE_RULE__URULE:
				return basicSetUrule(null, msgs);
			case TheoryextensionPackage.REWRITE_RULE__CRULE:
				return basicSetCrule(null, msgs);
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
			case TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE:
				return isIsCaseComplete();
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE:
				return isApplicabilityIsInteractive();
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC:
				return isApplicabilityIsAutomatic();
			case TheoryextensionPackage.REWRITE_RULE__PATTERN:
				return getPattern();
			case TheoryextensionPackage.REWRITE_RULE__URULE:
				if (resolve) return getUrule();
				return basicGetUrule();
			case TheoryextensionPackage.REWRITE_RULE__CRULE:
				if (resolve) return getCrule();
				return basicGetCrule();
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
			case TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE:
				setIsCaseComplete((Boolean)newValue);
				return;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE:
				setApplicabilityIsInteractive((Boolean)newValue);
				return;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC:
				setApplicabilityIsAutomatic((Boolean)newValue);
				return;
			case TheoryextensionPackage.REWRITE_RULE__PATTERN:
				setPattern((String)newValue);
				return;
			case TheoryextensionPackage.REWRITE_RULE__URULE:
				setUrule((UnconditionalRewrite)newValue);
				return;
			case TheoryextensionPackage.REWRITE_RULE__CRULE:
				setCrule((ConditionalRewrite)newValue);
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
			case TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE:
				setIsCaseComplete(IS_CASE_COMPLETE_EDEFAULT);
				return;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE:
				setApplicabilityIsInteractive(APPLICABILITY_IS_INTERACTIVE_EDEFAULT);
				return;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC:
				setApplicabilityIsAutomatic(APPLICABILITY_IS_AUTOMATIC_EDEFAULT);
				return;
			case TheoryextensionPackage.REWRITE_RULE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case TheoryextensionPackage.REWRITE_RULE__URULE:
				setUrule((UnconditionalRewrite)null);
				return;
			case TheoryextensionPackage.REWRITE_RULE__CRULE:
				setCrule((ConditionalRewrite)null);
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
			case TheoryextensionPackage.REWRITE_RULE__IS_CASE_COMPLETE:
				return isCaseComplete != IS_CASE_COMPLETE_EDEFAULT;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_INTERACTIVE:
				return applicabilityIsInteractive != APPLICABILITY_IS_INTERACTIVE_EDEFAULT;
			case TheoryextensionPackage.REWRITE_RULE__APPLICABILITY_IS_AUTOMATIC:
				return applicabilityIsAutomatic != APPLICABILITY_IS_AUTOMATIC_EDEFAULT;
			case TheoryextensionPackage.REWRITE_RULE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case TheoryextensionPackage.REWRITE_RULE__URULE:
				return urule != null;
			case TheoryextensionPackage.REWRITE_RULE__CRULE:
				return crule != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (IsCaseComplete: ");
		result.append(isCaseComplete);
		result.append(", ApplicabilityIsInteractive: ");
		result.append(applicabilityIsInteractive);
		result.append(", ApplicabilityIsAutomatic: ");
		result.append(applicabilityIsAutomatic);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(')');
		return result.toString();
	}

} //RewriteRuleImpl
