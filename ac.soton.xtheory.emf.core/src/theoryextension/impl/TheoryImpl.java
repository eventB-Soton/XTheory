/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package theoryextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBNamed;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.impl.EventBNamedImpl;
import theoryextension.Parameter;
import theoryextension.RuleBlock;
import theoryextension.Theory;
import theoryextension.TheoryextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Theory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link theoryextension.impl.TheoryImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link theoryextension.impl.TheoryImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link theoryextension.impl.TheoryImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link theoryextension.impl.TheoryImpl#getRuleBlocks <em>Rule Blocks</em>}</li>
 *   <li>{@link theoryextension.impl.TheoryImpl#getInternalElements <em>Internal Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TheoryImpl extends EventBNamedImpl implements Theory {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<String> imports;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getRuleBlocks() <em>Rule Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<RuleBlock> ruleBlocks;

	/**
	 * The cached value of the '{@link #getInternalElements() <em>Internal Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EventBNamed> internalElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TheoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.THEORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this, TheoryextensionPackage.THEORY__ANNOTATIONS, CorePackage.ANNOTATION__EVENT_BOBJECT);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImports() {
		if (imports == null) {
			imports = new EDataTypeUniqueEList<String>(String.class, this, TheoryextensionPackage.THEORY__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList.Resolving<Parameter>(Parameter.class, this, TheoryextensionPackage.THEORY__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuleBlock> getRuleBlocks() {
		if (ruleBlocks == null) {
			ruleBlocks = new EObjectContainmentEList.Resolving<RuleBlock>(RuleBlock.class, this, TheoryextensionPackage.THEORY__RULE_BLOCKS);
		}
		return ruleBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventBNamed> getInternalElements() {
		if (internalElements == null) {
			internalElements = new EObjectContainmentEList.Resolving<EventBNamed>(EventBNamed.class, this, TheoryextensionPackage.THEORY__INTERNAL_ELEMENTS);
		}
		return internalElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBObject getContaining(EClass eClass) {
		EventBObject bObject = this;
		while (!eClass.isSuperTypeOf(bObject.eClass()))
			if (bObject.eContainer() instanceof EventBObject) bObject=(EventBObject)bObject.eContainer();
			else return null;
		return bObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getAllContained(EClass eClass, boolean resolve) {
		EList<EObject> typeObjects = new BasicEList<EObject>();
		typeObjects.add(null);	//include the null object
		for (TreeIterator<EObject>trit = EcoreUtil.getAllContents(this, resolve); trit.hasNext();){
			EObject o = trit.next();
			if (eClass.isSuperTypeOf(o.eClass())) typeObjects.add(o);
		}
		return typeObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation(String source) {
		for (Annotation annotation : getAnnotations()){
			if (source.equals(annotation.getSource())) return annotation;
		}
		return null;
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
			case TheoryextensionPackage.THEORY__ANNOTATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotations()).basicAdd(otherEnd, msgs);
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
			case TheoryextensionPackage.THEORY__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
			case TheoryextensionPackage.THEORY__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case TheoryextensionPackage.THEORY__RULE_BLOCKS:
				return ((InternalEList<?>)getRuleBlocks()).basicRemove(otherEnd, msgs);
			case TheoryextensionPackage.THEORY__INTERNAL_ELEMENTS:
				return ((InternalEList<?>)getInternalElements()).basicRemove(otherEnd, msgs);
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
			case TheoryextensionPackage.THEORY__ANNOTATIONS:
				return getAnnotations();
			case TheoryextensionPackage.THEORY__IMPORTS:
				return getImports();
			case TheoryextensionPackage.THEORY__PARAMETERS:
				return getParameters();
			case TheoryextensionPackage.THEORY__RULE_BLOCKS:
				return getRuleBlocks();
			case TheoryextensionPackage.THEORY__INTERNAL_ELEMENTS:
				return getInternalElements();
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
			case TheoryextensionPackage.THEORY__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case TheoryextensionPackage.THEORY__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends String>)newValue);
				return;
			case TheoryextensionPackage.THEORY__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case TheoryextensionPackage.THEORY__RULE_BLOCKS:
				getRuleBlocks().clear();
				getRuleBlocks().addAll((Collection<? extends RuleBlock>)newValue);
				return;
			case TheoryextensionPackage.THEORY__INTERNAL_ELEMENTS:
				getInternalElements().clear();
				getInternalElements().addAll((Collection<? extends EventBNamed>)newValue);
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
			case TheoryextensionPackage.THEORY__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case TheoryextensionPackage.THEORY__IMPORTS:
				getImports().clear();
				return;
			case TheoryextensionPackage.THEORY__PARAMETERS:
				getParameters().clear();
				return;
			case TheoryextensionPackage.THEORY__RULE_BLOCKS:
				getRuleBlocks().clear();
				return;
			case TheoryextensionPackage.THEORY__INTERNAL_ELEMENTS:
				getInternalElements().clear();
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
			case TheoryextensionPackage.THEORY__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case TheoryextensionPackage.THEORY__IMPORTS:
				return imports != null && !imports.isEmpty();
			case TheoryextensionPackage.THEORY__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case TheoryextensionPackage.THEORY__RULE_BLOCKS:
				return ruleBlocks != null && !ruleBlocks.isEmpty();
			case TheoryextensionPackage.THEORY__INTERNAL_ELEMENTS:
				return internalElements != null && !internalElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EventBObject.class) {
			switch (derivedFeatureID) {
				case TheoryextensionPackage.THEORY__ANNOTATIONS: return CorePackage.EVENT_BOBJECT__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == EObject.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == EventBObject.class) {
			switch (baseFeatureID) {
				case CorePackage.EVENT_BOBJECT__ANNOTATIONS: return TheoryextensionPackage.THEORY__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (imports: ");
		result.append(imports);
		result.append(')');
		return result.toString();
	}

} //TheoryImpl
