/**
 */
package orgchart;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>President</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link orgchart.President#getCompanyName <em>Company Name</em>}</li>
 * </ul>
 *
 * @see orgchart.OrgchartPackage#getPresident()
 * @model
 * @generated
 */
public interface President extends Member {
	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see orgchart.OrgchartPackage#getPresident_CompanyName()
	 * @model
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link orgchart.President#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

} // President
