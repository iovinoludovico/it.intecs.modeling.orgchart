/**
 */
package orgchart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>orgchart Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link orgchart.orgchartModel#getPresident <em>President</em>}</li>
 * </ul>
 *
 * @see orgchart.OrgchartPackage#getorgchartModel()
 * @model
 * @generated
 */
public interface orgchartModel extends EObject {
	/**
	 * Returns the value of the '<em><b>President</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>President</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>President</em>' containment reference.
	 * @see #setPresident(President)
	 * @see orgchart.OrgchartPackage#getorgchartModel_President()
	 * @model containment="true" required="true"
	 * @generated
	 */
	President getPresident();

	/**
	 * Sets the value of the '{@link orgchart.orgchartModel#getPresident <em>President</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>President</em>' containment reference.
	 * @see #getPresident()
	 * @generated
	 */
	void setPresident(President value);

} // orgchartModel
