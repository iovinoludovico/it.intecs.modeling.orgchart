/**
 */
package orgchart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import orgchart.Member;
import orgchart.OrgchartPackage;
import orgchart.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link orgchart.impl.MemberImpl#getSubemployees <em>Subemployees</em>}</li>
 *   <li>{@link orgchart.impl.MemberImpl#getBoss <em>Boss</em>}</li>
 *   <li>{@link orgchart.impl.MemberImpl#getRole <em>Role</em>}</li>
 *   <li>{@link orgchart.impl.MemberImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberImpl extends NamedElementImpl implements Member {
	/**
	 * The cached value of the '{@link #getSubemployees() <em>Subemployees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubemployees()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> subemployees;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final Role ROLE_EDEFAULT = Role.DEVELOPER;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected Role role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrgchartPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getSubemployees() {
		if (subemployees == null) {
			subemployees = new EObjectContainmentWithInverseEList<Member>(Member.class, this, OrgchartPackage.MEMBER__SUBEMPLOYEES, OrgchartPackage.MEMBER__BOSS);
		}
		return subemployees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(Role newRole) {
		Role oldRole = role;
		role = newRole == null ? ROLE_EDEFAULT : newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgchartPackage.MEMBER__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgchartPackage.MEMBER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member getBoss() {
		if (eContainerFeatureID() != OrgchartPackage.MEMBER__BOSS) return null;
		return (Member)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoss(Member newBoss, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBoss, OrgchartPackage.MEMBER__BOSS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoss(Member newBoss) {
		if (newBoss != eInternalContainer() || (eContainerFeatureID() != OrgchartPackage.MEMBER__BOSS && newBoss != null)) {
			if (EcoreUtil.isAncestor(this, newBoss))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBoss != null)
				msgs = ((InternalEObject)newBoss).eInverseAdd(this, OrgchartPackage.MEMBER__SUBEMPLOYEES, Member.class, msgs);
			msgs = basicSetBoss(newBoss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrgchartPackage.MEMBER__BOSS, newBoss, newBoss));
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
			case OrgchartPackage.MEMBER__SUBEMPLOYEES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubemployees()).basicAdd(otherEnd, msgs);
			case OrgchartPackage.MEMBER__BOSS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBoss((Member)otherEnd, msgs);
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
			case OrgchartPackage.MEMBER__SUBEMPLOYEES:
				return ((InternalEList<?>)getSubemployees()).basicRemove(otherEnd, msgs);
			case OrgchartPackage.MEMBER__BOSS:
				return basicSetBoss(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OrgchartPackage.MEMBER__BOSS:
				return eInternalContainer().eInverseRemove(this, OrgchartPackage.MEMBER__SUBEMPLOYEES, Member.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrgchartPackage.MEMBER__SUBEMPLOYEES:
				return getSubemployees();
			case OrgchartPackage.MEMBER__BOSS:
				return getBoss();
			case OrgchartPackage.MEMBER__ROLE:
				return getRole();
			case OrgchartPackage.MEMBER__ADDRESS:
				return getAddress();
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
			case OrgchartPackage.MEMBER__SUBEMPLOYEES:
				getSubemployees().clear();
				getSubemployees().addAll((Collection<? extends Member>)newValue);
				return;
			case OrgchartPackage.MEMBER__BOSS:
				setBoss((Member)newValue);
				return;
			case OrgchartPackage.MEMBER__ROLE:
				setRole((Role)newValue);
				return;
			case OrgchartPackage.MEMBER__ADDRESS:
				setAddress((String)newValue);
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
			case OrgchartPackage.MEMBER__SUBEMPLOYEES:
				getSubemployees().clear();
				return;
			case OrgchartPackage.MEMBER__BOSS:
				setBoss((Member)null);
				return;
			case OrgchartPackage.MEMBER__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case OrgchartPackage.MEMBER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case OrgchartPackage.MEMBER__SUBEMPLOYEES:
				return subemployees != null && !subemployees.isEmpty();
			case OrgchartPackage.MEMBER__BOSS:
				return getBoss() != null;
			case OrgchartPackage.MEMBER__ROLE:
				return role != ROLE_EDEFAULT;
			case OrgchartPackage.MEMBER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
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
		result.append(" (role: ");
		result.append(role);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //MemberImpl
