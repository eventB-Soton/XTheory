/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import theoryextension.Given;
import theoryextension.Infer;
import theoryextension.InferenceRule;
import theoryextension.TheoryextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inference Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link theoryextension.impl.InferenceRuleImpl#getGiven <em>Given</em>}</li>
 *   <li>{@link theoryextension.impl.InferenceRuleImpl#getInfer <em>Infer</em>}</li>
 *   <li>{@link theoryextension.impl.InferenceRuleImpl#isApplicabilityIsInteractive <em>Applicability Is Interactive</em>}</li>
 *   <li>{@link theoryextension.impl.InferenceRuleImpl#isApplicabilityIsAutomatic <em>Applicability Is Automatic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InferenceRuleImpl extends MinimalEObjectImpl.Container implements InferenceRule {
	/**
	 * The cached value of the '{@link #getGiven() <em>Given</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGiven()
	 * @generated
	 * @ordered
	 */
	protected EList<Given> given;

	/**
	 * The cached value of the '{@link #getInfer() <em>Infer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfer()
	 * @generated
	 * @ordered
	 */
	protected Infer infer;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InferenceRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.INFERENCE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Given> getGiven() {
		if (given == null) {
			given = new EObjectContainmentEList.Resolving<Given>(Given.class, this, TheoryextensionPackage.INFERENCE_RULE__GIVEN);
		}
		return given;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infer getInfer() {
		if (infer != null && infer.eIsProxy()) {
			InternalEObject oldInfer = (InternalEObject)infer;
			infer = (Infer)eResolveProxy(oldInfer);
			if (infer != oldInfer) {
				InternalEObject newInfer = (InternalEObject)infer;
				NotificationChain msgs = oldInfer.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.INFERENCE_RULE__INFER, null, null);
				if (newInfer.eInternalContainer() == null) {
					msgs = newInfer.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.INFERENCE_RULE__INFER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TheoryextensionPackage.INFERENCE_RULE__INFER, oldInfer, infer));
			}
		}
		return infer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infer basicGetInfer() {
		return infer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfer(Infer newInfer, NotificationChain msgs) {
		Infer oldInfer = infer;
		infer = newInfer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.INFERENCE_RULE__INFER, oldInfer, newInfer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfer(Infer newInfer) {
		if (newInfer != infer) {
			NotificationChain msgs = null;
			if (infer != null)
				msgs = ((InternalEObject)infer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.INFERENCE_RULE__INFER, null, msgs);
			if (newInfer != null)
				msgs = ((InternalEObject)newInfer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TheoryextensionPackage.INFERENCE_RULE__INFER, null, msgs);
			msgs = basicSetInfer(newInfer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.INFERENCE_RULE__INFER, newInfer, newInfer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_INTERACTIVE, oldApplicabilityIsInteractive, applicabilityIsInteractive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_AUTOMATIC, oldApplicabilityIsAutomatic, applicabilityIsAutomatic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TheoryextensionPackage.INFERENCE_RULE__GIVEN:
				return ((InternalEList<?>)getGiven()).basicRemove(otherEnd, msgs);
			case TheoryextensionPackage.INFERENCE_RULE__INFER:
				return basicSetInfer(null, msgs);
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
			case TheoryextensionPackage.INFERENCE_RULE__GIVEN:
				return getGiven();
			case TheoryextensionPackage.INFERENCE_RULE__INFER:
				if (resolve) return getInfer();
				return basicGetInfer();
			case TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_INTERACTIVE:
				return isApplicabilityIsInteractive();
			case TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_AUTOMATIC:
				return isApplicabilityIsAutomatic();
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
			case TheoryextensionPackage.INFERENCE_RULE__GIVEN:
				getGiven().clear();
				getGiven().addAll((Collection<? extends Given>)newValue);
				return;
			case TheoryextensionPackage.INFERENCE_RULE__INFER:
				setInfer((Infer)newValue);
				return;
			case TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_INTERACTIVE:
				setApplicabilityIsInteractive((Boolean)newValue);
				return;
			case TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_AUTOMATIC:
				setApplicabilityIsAutomatic((Boolean)newValue);
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
			case TheoryextensionPackage.INFERENCE_RULE__GIVEN:
				getGiven().clear();
				return;
			case TheoryextensionPackage.INFERENCE_RULE__INFER:
				setInfer((Infer)null);
				return;
			case TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_INTERACTIVE:
				setApplicabilityIsInteractive(APPLICABILITY_IS_INTERACTIVE_EDEFAULT);
				return;
			case TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_AUTOMATIC:
				setApplicabilityIsAutomatic(APPLICABILITY_IS_AUTOMATIC_EDEFAULT);
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
			case TheoryextensionPackage.INFERENCE_RULE__GIVEN:
				return given != null && !given.isEmpty();
			case TheoryextensionPackage.INFERENCE_RULE__INFER:
				return infer != null;
			case TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_INTERACTIVE:
				return applicabilityIsInteractive != APPLICABILITY_IS_INTERACTIVE_EDEFAULT;
			case TheoryextensionPackage.INFERENCE_RULE__APPLICABILITY_IS_AUTOMATIC:
				return applicabilityIsAutomatic != APPLICABILITY_IS_AUTOMATIC_EDEFAULT;
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
		result.append(" (ApplicabilityIsInteractive: ");
		result.append(applicabilityIsInteractive);
		result.append(", ApplicabilityIsAutomatic: ");
		result.append(applicabilityIsAutomatic);
		result.append(')');
		return result.toString();
	}

} //InferenceRuleImpl
