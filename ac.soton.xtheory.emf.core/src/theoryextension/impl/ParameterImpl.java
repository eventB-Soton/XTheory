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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.Annotation;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.EventBObject;
import org.eventb.emf.core.impl.EventBNamedImpl;

import theoryextension.Parameter;
import theoryextension.TheoryextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link theoryextension.impl.ParameterImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends EventBNamedImpl implements Parameter {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TheoryextensionPackage.Literals.PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentWithInverseEList<Annotation>(Annotation.class, this, TheoryextensionPackage.PARAMETER__ANNOTATIONS, CorePackage.ANNOTATION__EVENT_BOBJECT);
		}
		return annotations;
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
			case TheoryextensionPackage.PARAMETER__ANNOTATIONS:
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
			case TheoryextensionPackage.PARAMETER__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case TheoryextensionPackage.PARAMETER__ANNOTATIONS:
				return getAnnotations();
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
			case TheoryextensionPackage.PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
			case TheoryextensionPackage.PARAMETER__ANNOTATIONS:
				getAnnotations().clear();
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
			case TheoryextensionPackage.PARAMETER__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
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
				case TheoryextensionPackage.PARAMETER__ANNOTATIONS: return CorePackage.EVENT_BOBJECT__ANNOTATIONS;
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
				case CorePackage.EVENT_BOBJECT__ANNOTATIONS: return TheoryextensionPackage.PARAMETER__ANNOTATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ParameterImpl
