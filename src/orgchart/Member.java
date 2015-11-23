/**
 */
package orgchart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link orgchart.Member#getSubemployees <em>Subemployees</em>}</li>
 *   <li>{@link orgchart.Member#getBoss <em>Boss</em>}</li>
 *   <li>{@link orgchart.Member#getRole <em>Role</em>}</li>
 *   <li>{@link orgchart.Member#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see orgchart.OrgchartPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subemployees</b></em>' containment reference list.
	 * The list contents are of type {@link orgchart.Member}.
	 * It is bidirectional and its opposite is '{@link orgchart.Member#getBoss <em>Boss</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subemployees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subemployees</em>' containment reference list.
	 * @see orgchart.OrgchartPackage#getMember_Subemployees()
	 * @see orgchart.Member#getBoss
	 * @model opposite="boss" containment="true"
	 * @generated
	 */
	EList<Member> getSubemployees();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link orgchart.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see orgchart.Role
	 * @see #setRole(Role)
	 * @see orgchart.OrgchartPackage#getMember_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link orgchart.Member#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see orgchart.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see orgchart.OrgchartPackage#getMember_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link orgchart.Member#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Boss</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link orgchart.Member#getSubemployees <em>Subemployees</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boss</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boss</em>' container reference.
	 * @see #setBoss(Member)
	 * @see orgchart.OrgchartPackage#getMember_Boss()
	 * @see orgchart.Member#getSubemployees
	 * @model opposite="subemployees" transient="false"
	 * @generated
	 */
	Member getBoss();

	/**
	 * Sets the value of the '{@link orgchart.Member#getBoss <em>Boss</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boss</em>' container reference.
	 * @see #getBoss()
	 * @generated
	 */
	void setBoss(Member value);

} // Member
