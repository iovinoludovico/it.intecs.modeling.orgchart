/**
 */
package orgchart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import orgchart.OrgchartPackage;
import orgchart.President;
import orgchart.orgchartModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>orgchart Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link orgchart.impl.orgchartModelImpl#getPresident <em>President</em>}</li>
 * </ul>
 *
 * @generated
 */
public class orgchartModelImpl extends MinimalEObjectImpl.Container implements orgchartModel {
	/**
	 * The cached value of the '{@link #getPresident() <em>President</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresident()
	 * @generated
	 * @ordered
	 */
	protected President president;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected orgchartModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgchartPackage.Literals.ORGCHART_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public President getPresident() {
		return president;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresident(President newPresident, NotificationChain msgs) {
		President oldPresident = president;
		president = newPresident;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrgchartPackage.ORGCHART_MODEL__PRESIDENT, oldPresident, newPresident);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresident(President newPresident) {
		if (newPresident != president) {
			NotificationChain msgs = null;
			if (president != null)
				msgs = ((InternalEObject)president).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrgchartPackage.ORGCHART_MODEL__PRESIDENT, null, msgs);
			if (newPresident != null)
				msgs = ((InternalEObject)newPresident).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrgchartPackage.ORGCHART_MODEL__PRESIDENT, null, msgs);
			msgs = basicSetPresident(newPresident, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgchartPackage.ORGCHART_MODEL__PRESIDENT, newPresident, newPresident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrgchartPackage.ORGCHART_MODEL__PRESIDENT:
				return basicSetPresident(null, msgs);
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
			case OrgchartPackage.ORGCHART_MODEL__PRESIDENT:
				return getPresident();
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
			case OrgchartPackage.ORGCHART_MODEL__PRESIDENT:
				setPresident((President)newValue);
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
			case OrgchartPackage.ORGCHART_MODEL__PRESIDENT:
				setPresident((President)null);
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
			case OrgchartPackage.ORGCHART_MODEL__PRESIDENT:
				return president != null;
		}
		return super.eIsSet(featureID);
	}

} //orgchartModelImpl
